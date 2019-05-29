package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("all")
public class NotificationSystem {

	private List<Listener> listenerList = new ArrayList<>();

	public void register(Listener notificationListener) {
		listenerList.add(notificationListener);
	}

	public void sendNotification() {
		Iterator<Listener> it = listenerList.iterator();
		while (it.hasNext()) {
			it.next().notification();
		}
	}
}
