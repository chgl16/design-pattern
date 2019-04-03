package xyz.cglzwz.designpattern.sp;

/**
 * 饿汉式单例
 * @author chgl16
 * @date 2019-04-02
 */

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}



