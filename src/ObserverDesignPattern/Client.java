package ObserverDesignPattern;

public class Client implements Listener {

	@Override
	public void notification() {
		System.out.println("Client Notification");
	}

}
