package programming.practice.factory;

public class PepperoniPizza extends pizza {

	@Override
	public void prepare() {
		System.out.println("페퍼로니 피자 준비~");
	}
}