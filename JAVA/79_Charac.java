package Ex_02;

public abstract class Charac { //Ŭ���� �տ��� abstract �ٿ�����Ѵ�.
	
	// �߻�޼ҵ� ����� -> abstract
	// �߻�޼ҵ�� �߻�Ŭ���� �ȿ����� ������ �ȴ�.
	public abstract void attack();
	
	public void run() {
		System.out.println("������ �̵��ϱ�");
	}
	
	public void back() {
		System.out.println("�ڷ� �̵��ϱ�");
	}
	
	public void jump() {
		System.out.println("���� �����ϱ�");
	}
	
}
