package programming.practice.abstractfactory;

import programming.practice.factory.CheesePizza;
import programming.practice.factory.VeggiePizza;
import programming.practice.factory.pizza;

public class FranchiseAFactory implements MenuFactory {

	@Override
	public pizza createPizza(String name) {
		pizza pizza = null;
		
		if(name.equals("veggie")) {
			pizza = new VeggiePizza();
		} else if (name.equals("cheese")) {
			pizza = new CheesePizza();
		}
		
		return pizza;
	}

	@Override
	public Beverage createBeverage(String name) {
		Beverage beverage = null;
		
		if(name.equals("coffee")) {
			beverage = new Coffee();
		} else if(name.equals("cola")) {
			beverage = new Cola();
		}
		
		return beverage;
	}

}
