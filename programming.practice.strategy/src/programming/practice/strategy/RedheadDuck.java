//120181853 �̵���

package programming.practice.strategy;

import behavior.FlyWithWings;
import behavior.Quack;
import behavior.SwimWithLegs;

public class RedheadDuck extends duck {
	public RedheadDuck() {
		
	
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}
	public void display() {
		System.out.println("���� �Ƹ޸�ī������~");

	}

}
