package decorator;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new HouseBlend();
		System.out.println(beverage.getDescription() + " : "+beverage.cost());
		
		beverage = new DarkRoast();
		System.out.println(beverage.getDescription() + " : "+beverage.cost());
		
		beverage = new Decaf();
		System.out.println(beverage.getDescription() + " : "+beverage.cost());
		
		beverage = new Espresso();
		System.out.println(beverage.getDescription() + " : "+beverage.cost());

	}

}
