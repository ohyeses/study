
public class Ex09_별찍기 {

	public static void main(String[] args) {
		int i; 
		int j;
//		*
//		**
//		***
//		****
//		*****
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		*****
//		****
//		***
//		** 아... 집에 가고 싶다 ㅠㅠㅠㅠ
//		*어 뭐야 ㅋㅋㅋㅋㅋㅋ
		
		for(i=5; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
