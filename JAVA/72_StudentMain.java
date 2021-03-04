
public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student("나예호", "20200801", 21, 10, 80, 95); //실제 객체 만들 때 반드시 6개의 값을 넣어줘

		student1.showInfo();
		
		Student student2 = new Student("채수민", "20201210", 11, 90, 70, 35); //실제 객체 만들 때 반드시 6개의 값을 넣어줘
		// 생성자는 메소드다.
		// 메소드가 갖고있지 않은 한 가지 특징이 있다. => 리턴 타입,리턴값이 없다.
		// new 라는 키워드로 메모리에 생성이된다.
		
		student2.showInfo();
		
		Student student3 = new Student("김운비", "20181003", 23, 100, 100, 100);
		
		//student1(나예호)의 Java점수를 알고 싶어요
		int sum = student1.getScoreJava() + student2.getScoreJava() + student3.getScoreJava();
		System.out.println("Java점수의 평균은 : " + sum * 1.0 / 3);
	}

}
