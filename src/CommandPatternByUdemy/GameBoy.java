package CommandPatternByUdemy;

public class GameBoy {

	// The invoker or Game console

	Command upCommand, downCommand, leftCommand, rightCommand;

	public GameBoy(Command upCommand, Command downCommand) {
		this.upCommand = upCommand; // concrete commands
		this.downCommand = downCommand;
		// this.leftCommand = leftCommand; -- for future purpose
		// this.rightCommand = rightCommand;
	}

	public void arrowUp() {
		upCommand.execute();
	}

	public void arrowDown() {
		downCommand.execute();
	}

	public void arrowLeft() {
		leftCommand.execute();
	}

	public void arrowRight() {
		rightCommand.execute();
	}

}
