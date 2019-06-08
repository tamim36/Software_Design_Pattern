package FacadePatternByUdemy;

public class Main {

	public static void main(String[] args) {
		Memory memory = new Memory();
		CPU cpu = new CPU();
		HardDrive hdd = new HardDrive();

		FacadeComputer facade = new FacadeComputer(cpu, memory, hdd);
		facade.start();
	}

}
