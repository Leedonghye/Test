package factorymethod;

import programming.practice.factory.pizza;

public abstract class PizzaStore {
	public pizza orderPizza(String name) {
		pizza pizza = this.createPizza(name);
		
		if(pizza == null) {
			return null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract pizza createPizza(String name);

}
