package ObserverDesignPattern;

public class ObserverMain {
	public static void main(String[] args) {
		NotificationSystem system = new NotificationSystem();

		system.register(new Client());
		system.register(new Admin());

		system.sendNotification();
	}
}
