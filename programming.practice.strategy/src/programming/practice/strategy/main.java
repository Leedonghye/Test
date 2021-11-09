//120181853 ÀÌµ¿Çö

package programming.practice.strategy;

public class main {

	public static void main(String[] args) {
		duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		duck = new RedheadDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		duck = new RubberDuck();
		duck.quack();
		duck.swim();
		duck.display();
		
		duck = new DecoyDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
	}

}