package org.woodbridgerobotics.javafsm;

public class StateManager {
	private State currentState;
	private boolean hasStarted = false;
	protected void acceptState(State s) {
		currentState.onLeave();
		currentState = s;
		if(s != null) {
			currentState.onEnter();
		}
	}
	public boolean canAct() {
		return currentState != null;
	}
	public void act() {
		if(!canAct()) {
			return;
		}
		if(!hasStarted) {
			hasStarted = true;
			currentState.onEnter();
		}
		System.out.println(canAct());
		currentState.act();
	}
	public <E> State<E> entry(State<E> e) {
		if(currentState == null) {
			currentState = e;
			currentState.registerManager(this);
			return e;
		}
		throw new IllegalStateException("Entry can only be called once");
	}
}
