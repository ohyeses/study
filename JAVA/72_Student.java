
public class Student {
	private String name, number;

	private int age, scoreJava, scoreWeb, scoreDB;
	
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreDB ) {
		
		this.name = name; // this �� ���������� ����ϱ� ���� Ű����
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreDB = scoreDB;
	}
	
	

	
	// Alt + Shift + s
	// ��Ŭ�� -> Source
	// setter 
	// set �޼ҵ�
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setNumber(String number) {
//		this.number = number;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setScoreJava(int scoreJava) {
//		this.scoreJava = scoreJava;
//	}
//
//	public void setScoreWeb(int scoreWeb) {
//		this.scoreWeb = scoreWeb;
//	}
//
//	public void setScoreDB(int scoreDB) {
//		this.scoreDB = scoreDB;
//	}

	public Student(String name, String number, int age, int scoreWeb, int scoreDB) {
		//super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreWeb = scoreWeb;
		this.scoreDB = scoreDB;
	}

	public int getScoreJava() {
		return scoreJava;
	}


	public String getName() {
		return name;
	}




	public String getNumber() {
		return number;
	}




	public int getAge() {
		return age;
	}




	public int getScoreWeb() {
		return scoreWeb;
	}




	public int getScoreDB() {
		return scoreDB;
	}




	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}




	public void showInfo() {
		System.out.println("������������������������������������");
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("[ " + number + ", " + age + "��" + "]");
		System.out.println(name + "���� Java������ " + scoreJava + "�� �Դϴ�.");
		System.out.println(name + "���� Web������ " + scoreWeb + "�� �Դϴ�.");
		System.out.println(name + "���� DB������ " + scoreDB + "�� �Դϴ�.");
	}
}
