package programming.practice.factory;

public class PizzaStore {
	public pizza orderPizza(String pizzaName) {
		pizza pizza = SimplePizzaFactory.createPizza(pizzaName);
	
	if(pizza == null) {
		return null;
		}
	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	
		return pizza;
	}
}