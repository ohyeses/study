
public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student("����ȣ", "20200801", 21, 10, 80, 95); //���� ��ü ���� �� �ݵ�� 6���� ���� �־���

		student1.showInfo();
		
		Student student2 = new Student("ä����", "20201210", 11, 90, 70, 35); //���� ��ü ���� �� �ݵ�� 6���� ���� �־���
		// �����ڴ� �޼ҵ��.
		// �޼ҵ尡 �������� ���� �� ���� Ư¡�� �ִ�. => ���� Ÿ��,���ϰ��� ����.
		// new ��� Ű����� �޸𸮿� �����̵ȴ�.
		
		student2.showInfo();
		
		Student student3 = new Student("����", "20181003", 23, 100, 100, 100);
		
		//student1(����ȣ)�� Java������ �˰� �;��
		int sum = student1.getScoreJava() + student2.getScoreJava() + student3.getScoreJava();
		System.out.println("Java������ ����� : " + sum * 1.0 / 3);
	}

}
