package xyz.cglzwz.designpattern.afp;

/**
 * Spring文本框类，充当具体产品
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public class SpringTextField implements TextField {
	@Override
	public void display() {
		System.out.println("显示绿色文本框");
	}
}
