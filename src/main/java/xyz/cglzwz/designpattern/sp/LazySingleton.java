package xyz.cglzwz.designpattern.sp;

/**
 * 懒汉式单例模式
 * 
 * @author chgl16
 * @date 2019-04-02 
 */

public class LazySingleton {
	private static  LazySingleton instance = null;
	
	private LazySingleton() {}
	
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		
		return instance; 
	}
}
