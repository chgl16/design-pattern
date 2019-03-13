package xyz.cglzwz.designpattern.afp;

/**
 * 皮肤接口工厂接口，充当抽象工厂
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}
