package programming.practice.factory;

public class VeggiePizza extends pizza {

	@Override
	public void prepare() {
		System.out.println("야채 피자 준비");
	}
}
