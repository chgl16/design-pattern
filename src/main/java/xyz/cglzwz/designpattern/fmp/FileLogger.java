package xyz.cglzwz.designpattern.fmp;

/**
 * 文件日志记录器，充当具体产品角色。
 * @author chgl16
 * @date 2019-03-25
 */
public class FileLogger implements Logger {
	@Override 
	public void write() {
		System.out.println("打印文件日志记录");
	}
}
