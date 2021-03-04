package Ex_01; //패키지 이름

public class Mouse { // 클래스 이름
	// 상속의 특징 : 모든 클래스의 부모 클래스는 Object클래스이다.
	
	// 마우스가 할 수 있는 동작(메소드) 정의하기

	// 좌 클릭, 우 클릭, 드래그
	public void leftClick() {
		System.out.print("좌클릭 하기!");
	}

	public void rightClick() {
		System.out.print("우클릭 하기!");
	}

	public void drag() {
		System.out.print("짧은 드래그 하기!");
	}


	// 새로운 클래스 생성하기(WheelMouse)
	// 기능 : 좌클릭, 우클릭, 드래그, 휠(wheel())


		
}
