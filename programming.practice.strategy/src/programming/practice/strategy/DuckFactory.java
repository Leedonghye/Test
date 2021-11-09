package programming.practice.strategy;

public class DuckFactory {
	
	public MallardDuck createMallardDuck() {
		MallardDuck mallardDuck = new MallardDuck();
		return mallardDuck;
	}
	
	public RedheadDuck createRedheadDuck() {
		RedheadDuck redheadDuck = new RedheadDuck();
		return redheadDuck;
	}
	
	public void runMallardDuck(MallardDuck mallardDuck) {
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.swim();
	}
	
	public void runRedheadDuck(RedheadDuck redheadDuck) {
		redheadDuck.display();
		redheadDuck.quack();
		redheadDuck.swim();
	}
	
	public static void main(String args[]) {
		DuckFactory duckFactory = new DuckFactory();
		MallardDuck mallardDuck = duckFactory.createMallardDuck();
		duckFactory.runMallardDuck(mallardDuck);
		RedheadDuck redheadDuck = duckFactory.createRedheadDuck();
		duckFactory.runRedheadDuck(redheadDuck);
	}
	
}
