package 성적표만들기;

public class Gradecard {
	// 성적표 만들기
	// 1. 과목(자바, 파이썬), 이름, 학번, 합계 -> 필드 정의

	private int Java;
	private int Python;
	private String name;
	private String id;
	private int total;

	public int getJava() {
		return Java;
	}

	public int getPython() {
		return Python;
	}

	public int getTotal() {
		return total;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	// 2. 생성자를 통해 초기값으로 지정할 수 있도록 생성자 만들기
	public Gradecard(int Java, int Python, String name, String id) {
		this.Java = Java;
		this.Python = Python;
		this.name = name;
		this.id = id;
		this.total = Java + Python;
	}

}
