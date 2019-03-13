package xyz.cglzwz.designpattern.afp;

/**
 * Summer按钮类，充当具体产品
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public class SummerButton implements Button{
	@Override
	public void display() {
		System.out.println("显示蓝色按钮");
	}
}
