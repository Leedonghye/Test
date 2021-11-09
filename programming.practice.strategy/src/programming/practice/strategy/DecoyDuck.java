package programming.practice.strategy;

import behavior.FloatOnWater;
import behavior.FlyNoWay;
import behavior.MuteQuack;

public class DecoyDuck extends duck {
	public DecoyDuck() {
		this.quackable = new MuteQuack();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}
	@Override
	public void	display() {
		System.out.println("나는 가짜오리~");
	}
}