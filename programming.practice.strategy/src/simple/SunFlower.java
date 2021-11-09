package simple;

public class SunFlower extends Plant {
	
	@Override
	public void prepare() {
		System.out.println("준비중...");
		
	}
	
	@Override
	public void display() {
		System.out.println("나는 태양");
	}
}