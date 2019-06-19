package ProxyPattern;

public class Proxy extends Subject {

	RealSubject realSubject;

	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public String Operation() {
		return "hello from proxy and " + realSubject.Operation();
	};

}
