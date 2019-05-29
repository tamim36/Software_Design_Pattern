package ObserverDesignPattern;

public class Admin implements Listener {

	@Override
	public void notification() {
		System.out.println("Admin Notification");
	}

}
