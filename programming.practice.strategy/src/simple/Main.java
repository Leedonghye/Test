package simple;

public class Main {

	public static void main(String[] args) {
		
		PlantFactory plantFactory = new PlantFactory();
		
		Plant plant = plantFactory.orderPlant("SunFlower");
		System.out.println(plant + "출격\n");
		
		plant = plantFactory.orderPlant("PeaShooter");
		System.out.println(plant + "출격\n");
	}
}