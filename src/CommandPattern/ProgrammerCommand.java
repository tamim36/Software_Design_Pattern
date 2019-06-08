package CommandPattern;

public class ProgrammerCommand implements iCommand {

	private Programmer programmer;

	public ProgrammerCommand(Programmer programmer) {
		this.programmer = programmer;
	}

	@Override
	public void execute() {
		programmer.doProgramming();

	}
}
