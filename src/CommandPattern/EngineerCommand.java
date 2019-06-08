package CommandPattern;

public class EngineerCommand implements iCommand {

	private Engineer engineer;

	public EngineerCommand(Engineer engineer) {
		this.engineer = engineer;
	}

	@Override
	public void execute() {
		engineer.doWork();

	}

}
