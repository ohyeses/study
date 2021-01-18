package JDBC;

// MVC ���� �� Model
// Model -> ���� �����ϰ��� �ϴ� �����ͺ��̽� ���̺��� ��� �ڷ����� �ϳ��� ���� �� �ִ� �������̴�.
// ���ø����̼��� ���������� �� �������� ���� �մϴ�. 
public class MemberVO {
	// ĸ��ȭ -> �Ժη� ���� ���ϰ� private���� ���������Ѵ�.
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// private���� ������ �������� �� �� �ֵ��� �����ڿ� getter, setter �޼ҵ带 ������ش�.
	
	// alt shift s -> Generate Constructor using Fields Ŭ��. ������ �����
	public MemberVO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// ������ �����ε�
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