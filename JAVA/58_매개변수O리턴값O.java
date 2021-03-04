
public class Ex02_매개변수O리턴값O {

	public static void main(String[] args) {
		System.out.println(sum(5,10));
		System.out.println(sum(1,2));
		System.out.println(sum(3,4));
		System.out.println(sum(5,8));
		System.out.println(sum(34,55));

		
		
	}
	
	public static int sum(int a, int b) {
		int result = a+b+3;
		return result;
	}
}
