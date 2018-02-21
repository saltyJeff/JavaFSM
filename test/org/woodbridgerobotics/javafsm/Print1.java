package org.woodbridgerobotics.javafsm;

import static org.woodbridgerobotics.javafsm.Transits.*;
public class Print1 extends State<Transits> {

	@Override
	public void onEnter() {
		System.out.println(1);
	}

	@Override
	public void act() {
		emit(PRINT_2);
	}

	@Override
	public void onLeave() {
		// TODO Auto-generated method stub
	}

}
