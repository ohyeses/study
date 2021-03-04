package Ex_01;

public class SmartMouse extends WheelMouse {

	// 인체공학 마우스 (SmartMouse) 생성하기
	// 기본기능 : 좌클릭, 우클릭, 드래그, 휠
	// Mouse, WheelMouse ? ->
	
	public void leftClick() {
		System.out.print("좌클릭 하기!");
	}

	public void rightClick() {
		System.out.print("우클릭 하기!");
	}
	
	@Override
	public void drag() {
		super.drag(); // 자신의 부모를 가리키는 키워드 -> WheelMouse -> Mouse
		System.out.print("자동 드래그 사용하기!");
		
	}
	
	// SmartMouse 만의 기능
	public void smart () {
		System.out.print(" ");
	}
	// 부모로부터 물려받은 wheel()를 새롭게 정의하기
	// 중복정의 -> 오버로딩
	// 재정의 -> 오버라이딩
	public void wheel() { // 새롭게 재 정의가 됐다!
		System.out.print("자동 휠 사용하기!");
	}
	
	

}
