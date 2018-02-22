package org.woodbridgerobotics.javafsm;
import static org.woodbridgerobotics.javafsm.Transits.*;
public class Driver {
	public static void main(String[] args) {
		StateManager man = new StateManager();
		Print2 p2;
		man.entry(new Print1())
			.on(PRINT_2, (p2 = new Print2())
			.on(PRINT_4, new Print4())
			.on(PRINT_8, new Print8()));
		while(man.canAct()) {
			man.act();
		}
	}

}
