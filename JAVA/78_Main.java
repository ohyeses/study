package Ex_01;

public class Main {

	public static void main(String[] args) {
		// 1. 객체가 생성될 수 있는 Main클래스 생성하기
		// 2. Mouse와 WheelMouse 객체 생성하기
		// 3. 각 객체의 메소드 호출해보기.
	
		
		Mouse m = new Mouse();
		m.leftClick();
		m.rightClick();
		m.drag();
		
		// 2. WheelMouse 객체 생성하기.
		WheelMouse wm = new WheelMouse();
		
		wm.leftClick();
		wm.rightClick();
		wm.drag();
		wm.wheel();
		
		// 드래그를 수정하려면?
		// Mouse 와 WheelMouse에도 drag가 모두 있기때문에
		
		// 상속의 특징
		// 1. 다중상속이 불가능하다. (부모클래스 무조건 단 하나!)
		// 2. 모든 클래스는 Object Class를 상속 받는다. -> 관련 메소드를 사용할 수 있다.
		// 3. 상속에는 제한이 없다.
		
		// SmartMouse 객체 생성
		SmartMouse sm = new SmartMouse();
		sm.smart();
		sm.wheel();
		
		// wheel의 기능을 수정하게 되면 WheelMouse 자체의 기능이 바뀌게 된다.
		sm.drag();
		// 오버라이딩 단축키 alt + shift + s
	}

}
