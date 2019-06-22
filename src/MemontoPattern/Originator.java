package MemontoPattern;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Mememto saveStateToMemento() {
		return new Mememto(state);
	}

	public void getStateFromMemento(Mememto mememto) {
		state = mememto.getState();
	}

}
