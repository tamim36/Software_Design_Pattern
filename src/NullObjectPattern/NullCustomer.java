package NullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNill() {
		return true;
	}

	@Override
	public String getName() {
		return "This customer is not available";
	}

}
