package Phone;

public class InfoVO {
	private String name;
	private int age;
	private String number;

	public InfoVO(String name, int age, String number) { // int ���� ���� ������ X -> ������.
		this.name = name;
		this.age = age;
		this.number= number;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNumber() {
		return number;
	}

}
