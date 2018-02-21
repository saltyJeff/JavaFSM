package org.woodbridgerobotics.javafsm;

public class OnOrThen<EVTS> {
	private State<EVTS> prevState;
	private State<EVTS> thisState;
	public OnOrThen(State<EVTS> prev, State<EVTS> nxt) {
		prevState = prev;
		thisState = nxt;
		System.out.println(prev.getClass().getSimpleName()+" ==> "+nxt.getClass().getSimpleName());
	}
	public OnOrThen<EVTS> on(EVTS evt, State nxtState) {
		return prevState.on(evt, nxtState);
	}
	public State<EVTS> then() {
		return thisState;
	}
}
