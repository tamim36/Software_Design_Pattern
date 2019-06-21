package AbstractFactoryPattern;

public class WinCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("This is windows checkbox");
	}

}
