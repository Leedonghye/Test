package factorymethod;

import programming.practice.factory.pizza;

public class Main {
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new FranchiseA();
		pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println(pizza+"°í°´ Àü´Þ\n");
		
	}
}
