//120181853 이동현

package programming.practice.strategy;

import behavior.FlyWithWings;
import behavior.Quack;
import behavior.SwimWithLegs;

public class MallardDuck extends duck {
	public MallardDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("나는 청둥오리~");
	}
}