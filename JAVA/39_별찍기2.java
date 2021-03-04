
public class Ex02_º°Âï±â2 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		for(int i=0; i<=4; i++) {
			for(int j=4-i; j>=0; j--) {
				System.out.print(j);
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
