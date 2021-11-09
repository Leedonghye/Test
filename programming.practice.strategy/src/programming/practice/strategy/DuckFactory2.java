package programming.practice.strategy;

public class DuckFactory2 {
	
	public duck createDuck(String type) {
		duck duck = null;
		if(type.equals("MalladDuck")) {
			duck = new MallardDuck();
		} else if(type.equals("RedheadDuck")) {
			duck = new RedheadDuck();
		}
		
		return duck;
	}
	
	public void runDuck(duck duck) {
		duck.display();
		duck.quack();
		duck.swim();
	}
	
	public static void main(String args[]) {
		DuckFactory2 duckFactory2 = new DuckFactory2();
		duck duck = duckFactory2.createDuck("MallardDuck");
		duckFactory2.runDuck(duck);
		duck = duckFactory2.createDuck("RedheadDuck");
		duckFactory2.runDuck(duck);
	}
}
