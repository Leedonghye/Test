package programming.practice.factory;

public class SimplePizzaFactory {
	
	public static pizza createPizza(String name) {
		pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if(name.equals("clam")) {
			pizza = new ClamPizza(); 
			} else if(name.equals("Veggie")) {
				pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
