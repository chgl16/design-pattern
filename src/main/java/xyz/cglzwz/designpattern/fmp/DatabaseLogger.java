package xyz.cglzwz.designpattern.fmp;

/**
 *  数据库日志记录器，充当具体产品角色。
 * @author chgl16
 * @date 2019-03-25
 */

public class DatabaseLogger implements Logger {
	@Override 
	public void write() {
		System.out.println("打印数据库日志记录");
	}
}
