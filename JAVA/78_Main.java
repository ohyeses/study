package Ex_01;

public class Main {

	public static void main(String[] args) {
		// 1. ��ü�� ������ �� �ִ� MainŬ���� �����ϱ�
		// 2. Mouse�� WheelMouse ��ü �����ϱ�
		// 3. �� ��ü�� �޼ҵ� ȣ���غ���.
	
		
		Mouse m = new Mouse();
		m.leftClick();
		m.rightClick();
		m.drag();
		
		// 2. WheelMouse ��ü �����ϱ�.
		WheelMouse wm = new WheelMouse();
		
		wm.leftClick();
		wm.rightClick();
		wm.drag();
		wm.wheel();
		
		// �巡�׸� �����Ϸ���?
		// Mouse �� WheelMouse���� drag�� ��� �ֱ⶧����
		
		// ����� Ư¡
		// 1. ���߻���� �Ұ����ϴ�. (�θ�Ŭ���� ������ �� �ϳ�!)
		// 2. ��� Ŭ������ Object Class�� ��� �޴´�. -> ���� �޼ҵ带 ����� �� �ִ�.
		// 3. ��ӿ��� ������ ����.
		
		// SmartMouse ��ü ����
		SmartMouse sm = new SmartMouse();
		sm.smart();
		sm.wheel();
		
		// wheel�� ����� �����ϰ� �Ǹ� WheelMouse ��ü�� ����� �ٲ�� �ȴ�.
		sm.drag();
		// �������̵� ����Ű alt + shift + s
	}

}
