package CommandPattern;

public class CommandCenter {

	iCommand command;

	public CommandCenter() {
	}

	public void setCommand(iCommand command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}

}
