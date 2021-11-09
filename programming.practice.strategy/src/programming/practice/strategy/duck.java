//120181853 ÀÌµ¿Çö

package programming.practice.strategy;

import behavior.Flyable;
import behavior.Quackable;
import behavior.Swimable;

public abstract class duck {
	protected Quackable quackable;
	protected Flyable flyable;
	protected Swimable swimable;
	
	public void quack() {
		this.quackable.quack();
	
	}
	public void swim() {
		this.swimable.swim();
	}
	
	public void fly() {
		this.flyable.fly();
	}
	
	public abstract void display();
}
