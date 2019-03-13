package xyz.cglzwz.designpattern.afp;

/**
 * Summer组合框类，充当具体产品
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public class SummerComboBox implements ComboBox {
	@Override
	public void display() {
		System.out.println("显示蓝色组合框");
	}
}
