package ProxyPatternByUdemy;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {

	RealBank realBank = new RealBank();

	private static List<String> bannedClients;

	static {
		bannedClients = new ArrayList<String>();
		bannedClients.add("xsxs");
		bannedClients.add("me@me");
		bannedClients.add("abcde");
		bannedClients.add("aaaaa");
	}

	@Override
	public void withdrawMoney(String clientName) throws Exception {

		if (bannedClients.contains(clientName.toLowerCase())) {
			throw new Exception(clientName + " Access Denied ! ");
		}

		realBank.withdrawMoney(clientName);

	}

}
