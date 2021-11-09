package programming.practice.abstractfactory;

import programming.practice.factory.pizza;

public abstract class PizzaStore {
	protected MenuFactory menuFactory;
	
	public pizza orderPizza(String name) {
		pizza pizza = this.menuFactory.createPizza(name);
		if(pizza != null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		return pizza;
	}
	
	public Beverage orderBeverage(String name) {
		Beverage beverage = this.menuFactory.createBeverage(name);
		if(beverage != null) {
			beverage.prepare();
			beverage.putInCup();
		}
		return beverage;
	}
}
