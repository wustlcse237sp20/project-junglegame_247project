package core;

import coreTests.ClickTestLoop;

public class CoreLoop implements GameLoop {
	
	public static CoreLoop current;
	
	private GameLoop runningLoop;
	
	public CoreLoop() {
		current = this;
	}
	
	@Override
	public void start() {
		// TODO Initialize default runningLoop;
		runningLoop = new ClickTestLoop();
		runningLoop.start();
	}

	@Override
	public void update() {
		runningLoop.update();
	}
	
	public void setLoop(GameLoop loop) {
		runningLoop = loop;
		runningLoop.start();
	}

}
