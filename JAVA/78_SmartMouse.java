package Ex_01;

public class SmartMouse extends WheelMouse {

	// ��ü���� ���콺 (SmartMouse) �����ϱ�
	// �⺻��� : ��Ŭ��, ��Ŭ��, �巡��, ��
	// Mouse, WheelMouse ? ->
	
	public void leftClick() {
		System.out.print("��Ŭ�� �ϱ�!");
	}

	public void rightClick() {
		System.out.print("��Ŭ�� �ϱ�!");
	}
	
	@Override
	public void drag() {
		super.drag(); // �ڽ��� �θ� ����Ű�� Ű���� -> WheelMouse -> Mouse
		System.out.print("�ڵ� �巡�� ����ϱ�!");
		
	}
	
	// SmartMouse ���� ���
	public void smart () {
		System.out.print(" ");
	}
	// �θ�κ��� �������� wheel()�� ���Ӱ� �����ϱ�
	// �ߺ����� -> �����ε�
	// ������ -> �������̵�
	public void wheel() { // ���Ӱ� �� ���ǰ� �ƴ�!
		System.out.print("�ڵ� �� ����ϱ�!");
	}
	
	

}
