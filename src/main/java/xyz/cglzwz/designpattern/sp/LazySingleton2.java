package xyz.cglzwz.designpattern.sp;

/**
 * 懒汉模式双重检查锁定
 * @author chgl16
 * @date 2019-04-03
 */
public class LazySingleton2 {
	// 使用volatile修饰，确保每个线程能够正确处理
	private volatile static  LazySingleton2 instance = null;
	
	private LazySingleton2() {}
	
	public static synchronized LazySingleton2 getInstance() {
		// 第一重判断
		if (instance == null) {
			// 锁定代码块
			synchronized (LazySingleton2.class) {
				// 第二重判断
				if (instance == null) {
					// 创建单例实例
					instance = new LazySingleton2();
				}
			}	
		}
		return instance; 
	}
}
