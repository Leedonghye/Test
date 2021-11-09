package factorymethod;

import programming.practice.factory.pizza;
import programming.practice.factory.CheesePizza;
import programming.practice.factory.PepperoniPizza;
import programming.practice.factory.VeggiePizza;
import programming.practice.factory.ClamPizza;

public class FranchiseB extends PizzaStore {

	@Override
	protected pizza createPizza(String name) {
		System.out.println("프렌차이즈B");
		pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if(name.equals("clam")) {
			pizza = new ClamPizza();
		} else if(name.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}
