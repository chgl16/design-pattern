package xyz.cglzwz.designpattern.fmp;

/**
 * 日志记录器工厂接口，充当抽象工厂角色。
 * @author chgl16
 * @date 2019-03-25
 */
public interface LoggerFactory {
	public Logger createLogger();  // 抽象工厂方法
}

