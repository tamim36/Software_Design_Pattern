package ProxyPattern;

public class Client {

	public static void main(String[] args) {

		Subject proxySubject = new Proxy(new RealSubject());

		System.out.println(proxySubject.Operation());
	}

}
