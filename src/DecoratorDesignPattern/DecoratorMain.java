package DecoratorDesignPattern;

public class DecoratorMain {
	public static void main(String[] args) {
		Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
		widget.draw();
	}
}
