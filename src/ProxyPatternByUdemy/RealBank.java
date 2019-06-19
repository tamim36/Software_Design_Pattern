package ProxyPatternByUdemy;

public class RealBank implements Bank {

	@Override
	public void withdrawMoney(String clientName) throws Exception {

		System.out.println(clientName + " Money withdrawing from Real Bank");

	}

}
