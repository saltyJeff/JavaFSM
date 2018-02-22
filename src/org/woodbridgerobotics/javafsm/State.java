package org.woodbridgerobotics.javafsm;

import java.util.HashMap;

public abstract class State<EVTS> {
	private HashMap<EVTS, State> transitions = new HashMap<>();
	private StateManager man;
	protected void registerManager(StateManager sm) {
		man = sm;
	}
	protected void emit(EVTS evt) {
		man.acceptState(transitions.get(evt));
	}
	protected void end() {
		man.acceptState(null);
	}
	public State<EVTS> on(EVTS evt, State next) {
		transitions.put(evt, next);
		return this;
	}
	public abstract void onEnter();
	public abstract void act();
	public abstract void onLeave();
}
