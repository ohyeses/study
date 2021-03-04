
public class Ex03_별찍기3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			// 공백을 출력하는 부분
			for(int j =1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int i=1; i<=3; i++) {
			// 공백을 출력하는 부분
			System.out.println();
			for(int j =1; j<=3-i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
