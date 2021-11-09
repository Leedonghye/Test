package factorymethod;

import programming.practice.factory.pizza;
import programming.practice.factory.CheesePizza;
import programming.practice.factory.PepperoniPizza;
public class FranchiseA extends PizzaStore {

	@Override
	protected pizza createPizza(String name) {
		System.out.println("프렌차이즈A");
		pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		return pizza;
	}

}
