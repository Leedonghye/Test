package programming.practice.abstractfactory;

import programming.practice.factory.pizza
;
public class Main {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new FranchiseA();
		pizza pizza = pizzaStore.orderPizza("veggie");
		Beverage beverage = pizzaStore.orderBeverage("coffee");
		System.out.println(pizza + "�� ����");
		System.out.println(beverage + "�� ����\n");
		
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("pepperoni");
		beverage = pizzaStore.orderBeverage("soju");
		System.out.println(pizza + "�� ����");
		System.out.println(beverage + "�� ����\n");
		

	}

}
