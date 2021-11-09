package programming.practice.strategy;

import behavior.FlyNoWay;
import behavior.Quack;
import behavior.SwimWithLegs;

public class RobotDuck extends duck {
	public RobotDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("»ßºò, ³ª´Â ·Îº¿¿À¸®");
	}
}
