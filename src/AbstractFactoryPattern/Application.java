package AbstractFactoryPattern;

public class Application {

	private GuiFactory factory;
	private CheckBox checkBox;
	private Button button;

	public Application(GuiFactory factory) {
		this.factory = factory;
	}

	void createUI() {
		this.button = factory.createButton();
		this.checkBox = factory.createCheckBox();
	}

	void paint() {
		this.button.paint();
		this.checkBox.paint();
	}
}
