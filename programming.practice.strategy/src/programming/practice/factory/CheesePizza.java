package programming.practice.factory;

public class CheesePizza extends pizza {

	@Override
	public void prepare() {
		System.out.println("치즈 피자 준비~");
	}
}