//120181853 �̵���

package programming.practice.strategy;

import behavior.FlyNoWay;
import behavior.Squack;
import behavior.FloatOnWater;

public class RubberDuck extends duck {
	public RubberDuck() {
		this.quackable = new Squack();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}
	
	
	@Override
	public void	display() {
		System.out.println("���� ������~");
	}
}
