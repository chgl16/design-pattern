package xyz.cglzwz.designpattern.afp;

/**
 * 客户端运行类
 * 
 * @author chgl16
 * @date 2019-03-12
 */

public class App {

	public static void main(String[] args) {
		// 使用抽象层定义
		SkinFactory skinFactory;
		Button button;
		TextField textField;
		ComboBox comboBox;
		
		// 获取对象
		skinFactory = new SpringSkinFactory();
		button = skinFactory.createButton();
		textField = skinFactory.createTextField();
		comboBox = skinFactory.createComboBox();
		
		// 调用
		button.display();
		textField.display();
		comboBox.display();
	}

}
