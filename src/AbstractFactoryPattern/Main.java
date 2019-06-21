package AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		Application app;
		GuiFactory factory = null;
		String os = "MAC";

		if (os.equals("WIN")) {
			factory = new WinFactory();
		} else if (os.equals("MAC")) {
			factory = new MacFactory();
		}

		app = new Application(factory);

		app.createUI();
		app.paint();
	}

}
