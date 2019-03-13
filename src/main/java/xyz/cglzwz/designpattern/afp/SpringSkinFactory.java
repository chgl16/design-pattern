package xyz.cglzwz.designpattern.afp;

/**
 * Spring皮肤工厂，充当具体工厂
 * 
 * @author chgl16
 * @date 2018-03-12
 */

public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}
}
