package programming.practice.factory;

public abstract class pizza {
	public abstract void prepare();
	
	public void bake() {
		System.out.println("���� ����~");
	}
	
	public void cut() {
		System.out.println("���� �ڸ���~");
	}
	
	public void box() {
		System.out.println("�ڽ��� ���~");
	}
}
