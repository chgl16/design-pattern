package xyz.cglzwz.designpattern.fmp;

/**
 * 文件日志记录器工程类，充当具体工厂角色
 * @author chgl16
 * @date 2019-03-25
 */
public class FileLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		Logger logger = new FileLogger();
		return logger;
	}
}

