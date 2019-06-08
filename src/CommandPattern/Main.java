package CommandPattern;

public class Main {

	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		Engineer engineer = new Engineer();

		ProgrammerCommand programmerCommand = new ProgrammerCommand(programmer);
		EngineerCommand engineerCommand = new EngineerCommand(engineer);

		CommandCenter center = new CommandCenter();

		center.setCommand(engineerCommand);
		center.buttonPressed();

		center.setCommand(programmerCommand);
		center.buttonPressed();
	}

}
