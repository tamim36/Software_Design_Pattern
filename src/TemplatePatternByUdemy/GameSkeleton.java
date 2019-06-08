package TemplatePatternByUdemy;

public abstract class GameSkeleton {

	abstract void initialize();

	abstract void start();

	abstract void end();

	// The template method
	public final void play() {
		initialize();
		start();
		end();
	}
}
