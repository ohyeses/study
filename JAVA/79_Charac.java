package Ex_02;

public abstract class Charac { //클래스 앞에도 abstract 붙여줘양한다.
	
	// 추상메소드 만들기 -> abstract
	// 추상메소드는 추상클래스 안에서만 생성이 된다.
	public abstract void attack();
	
	public void run() {
		System.out.println("앞으로 이동하기");
	}
	
	public void back() {
		System.out.println("뒤로 이동하기");
	}
	
	public void jump() {
		System.out.println("위로 점프하기");
	}
	
}
