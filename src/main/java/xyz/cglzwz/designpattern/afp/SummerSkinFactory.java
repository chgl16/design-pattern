package xyz.cglzwz.designpattern.afp;

/**
 * Summer皮肤工厂，充当具体工厂
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SummerComboBox();
	}
}
