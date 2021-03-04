
public class Pokemon {
	//
	private String type;
	private String name;
	private int lv;
	private int power;

	// 생성자의 특징 : 리턴타입 X, 클래스의 이름과 동일, 객체를 생성할 때만 ㅎ
	// 기본 생성자 -> 생략 가능
	public Pokemon(String name, String type, int lv, int power) {
		this.name = name;
		this.type = type;
		this.lv = lv;
		this.power = power;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getLv() {
		return lv;
	}

	public int getPower() {
		return power;
	}

//	public String getter() {
//		return name;
//	}
//	
//	public int getLV() {
//		return lv;
//	}
//	
//	public void setter(int lv) {
//		this.lv = lv;
//	}

}
