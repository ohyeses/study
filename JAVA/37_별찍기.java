
public class Ex09_紺啄奄 {

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
//		** 焼... 増拭 亜壱 粛陥 ばばばば
//		*嬢 更醤 せせせせせせ
		
		for(i=5; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
