package xyz.cglzwz.designpattern.afp;

/**
 * Spring组合框类，充当具体产品
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public class SpringComboBox implements ComboBox {
	@Override
	public void display() {
		System.out.println("显示绿色的组合框");
	}
}
