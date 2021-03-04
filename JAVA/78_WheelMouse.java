package Ex_01;

public class WheelMouse extends Mouse {

	// 상속으로 묶어준다.
	// 상속을 받기 위한 키워드 -> extends(확장하다)
	// 상속을 선언하는 방법 - > 자식클래스 extends 부모클래스
	
//	public void leftClick() {
//		System.out.print("좌클릭 하기!");
//	}
//
//	public void rightClick() {
//		System.out.print("우클릭 하기!");
//	}
//
//	public void drag() {
//		System.out.print("짧은 드래그 하기!");
//	}
	
	
	// WheelMouse만이 갖는 기능.
	// 자식클래스는 부모 클래스보다 더 확장적인 기능을 갖게 된다. (최신화가 된다.)
	// 기존의 마우스를 또 다시 물려받을 수 있을까? -> 가능
	// 상속의 특징 : 상속의 횟수는 제한이 없다!
	
	public void wheel() {
		System.out.print("휠 사용하기!");
	}

}
