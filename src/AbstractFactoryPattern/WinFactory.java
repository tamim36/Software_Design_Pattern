package AbstractFactoryPattern;

public class WinFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WinCheckBox();
	}

}
