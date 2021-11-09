package programming.practice.abstractfactory;

import programming.practice.factory.pizza;

public interface MenuFactory {
	public abstract pizza createPizza(String name);
	public abstract Beverage createBeverage(String name);

}
