package org.woodbridgerobotics.javafsm;

import static org.woodbridgerobotics.javafsm.Transits.*;
public class Print2 extends State<Transits> {

	@Override
	public void onEnter() {
		System.out.println(2);
	}

	@Override
	public void act() {
		emit(PRINT_8);
	}

	@Override
	public void onLeave() {
		// TODO Auto-generated method stub
	}

}
