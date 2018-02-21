package org.woodbridgerobotics.javafsm;

import static org.woodbridgerobotics.javafsm.Transits.*;
public class Print8 extends State<Transits> {

	@Override
	public void onEnter() {
		System.out.println(8);
	}

	@Override
	public void act() {
		end();
	}

	@Override
	public void onLeave() {
		// TODO Auto-generated method stub
	}

}
