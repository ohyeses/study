
public class PersonMain {

	public static void main(String[] args) {
		
		//VO -> 이름, 나이, 연락처를 담을 수 있는 객체
		Person p1 = new Person("나예호", 21, "010-3192-4771");
		Person p2 = new Person("채수민", 22, "010-1234-5555");
		
		
		// p1, p2를 배열로 다뤄보자 -> 객체 배열
		// 배열이란? 동일한 자료형을 효율적으로 다루는
		
		// 5칸짜리 int 배열
		int[] intArray = new int[5];
		
		// 2칸짜리 Person 배열
		Person[] array = new Person[2];
		array[0] = p1;
		array[1] = p2;
		
		
		for(int i=0; i < array.length; i++) {
			System.out.println("이름 : " + array[i].getName());
			System.out.println("나이 : " + array[i].getAge());
			System.out.println("연락처 : " + array[i].getTel());
			 
		}
	}

}
