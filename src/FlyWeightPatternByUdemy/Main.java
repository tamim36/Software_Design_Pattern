package FlyWeightPatternByUdemy;

public class Main {

	private static final String colors[] = { "red", "green", "yellow", "blue", "white", "black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());

			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(200);

			circle.draw();
		}

	}

	public static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	public static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	public static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}
