
public class PersonMain {

	public static void main(String[] args) {
		
		//VO -> �̸�, ����, ����ó�� ���� �� �ִ� ��ü
		Person p1 = new Person("����ȣ", 21, "010-3192-4771");
		Person p2 = new Person("ä����", 22, "010-1234-5555");
		
		
		// p1, p2�� �迭�� �ٷﺸ�� -> ��ü �迭
		// �迭�̶�? ������ �ڷ����� ȿ�������� �ٷ��
		
		// 5ĭ¥�� int �迭
		int[] intArray = new int[5];
		
		// 2ĭ¥�� Person �迭
		Person[] array = new Person[2];
		array[0] = p1;
		array[1] = p2;
		
		
		for(int i=0; i < array.length; i++) {
			System.out.println("�̸� : " + array[i].getName());
			System.out.println("���� : " + array[i].getAge());
			System.out.println("����ó : " + array[i].getTel());
			 
		}
	}

}
