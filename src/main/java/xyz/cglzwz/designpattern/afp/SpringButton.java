package xyz.cglzwz.designpattern.afp;

/**
 * Spring按钮类，充当具体产品
 * 
 * @author chgl16
 * @date 2018-03-12
 */
public class SpringButton implements Button{
	@Override
	public void display() {
		System.out.println("显示绿色按钮");
	}
}
