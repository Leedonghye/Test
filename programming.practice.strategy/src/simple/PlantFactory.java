package simple;

public class PlantFactory {
	public Plant orderPlant(String plantName) {
		Plant plant = null;
		
		if(plantName.equals("PeaShooter")) {
			plant = new PeaShooter();
		} else if(plantName.equals("SunFlower")) {
			plant = new SunFlower();
		}
		
		plant.display();
		
		return plant;
	}
}