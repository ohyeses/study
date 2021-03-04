
public class Student {
	private String name, number;

	private int age, scoreJava, scoreWeb, scoreDB;
	
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreDB ) {
		
		this.name = name; // this 는 전역변수를 사용하기 위한 키워드
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreDB = scoreDB;
	}
	
	

	
	// Alt + Shift + s
	// 우클릭 -> Source
	// setter 
	// set 메소드
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
		System.out.println("──────────────────");
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살" + "]");
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 DB점수는 " + scoreDB + "점 입니다.");
	}
}
