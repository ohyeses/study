package JDBC;

// MVC 패턴 중 Model
// Model -> 내가 접근하고자 하는 데이터베이스 테이블의 모든 자료형을 하나로 묶을 수 있는 데이터이다.
// 어플리케이션이 “무엇”을 할 것인지를 정의 합니다. 
public class MemberVO {
	// 캡슐화 -> 함부로 접근 못하게 private으로 접근제한한다.
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// private으로 생성한 변수들을 쓸 수 있도록 생성자와 getter, setter 메소드를 만들어준다.
	
	// alt shift s -> Generate Constructor using Fields 클릭. 생성자 만들기
	public MemberVO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// 생성자 오버로딩
	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}


	// alt shift s -> Generate Getter and Setters -> Select All
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}