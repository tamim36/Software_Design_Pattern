package ProxyPatternByUdemy;

public class Main {

	public static void main(String[] args) {
		Bank bank = new ProxyBank();

		try {
			bank.withdrawMoney("tamim");
			bank.withdrawMoney("supreme");
			bank.withdrawMoney("xsxs");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
