package org.woodbridgerobotics.javafsm;
import static org.woodbridgerobotics.javafsm.Transits.*;
public class Driver {
	public static void main(String[] args) {
		StateManager man = new StateManager();
		man.entry(new Print1())
			.on(PRINT_2, new Print2())
			.then()
			.on(PRINT_4, new Print4())
			.on(PRINT_8, new Print8());
		while(man.canAct()) {
			man.act();
		}
	}

}
