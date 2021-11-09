package programming.practice.factory;

public class ClamPizza extends pizza {

	@Override
	public void prepare() {
		System.out.println("조개 피자 준비");
	}
}
