
public class Ex03_�����3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			// ������ ����ϴ� �κ�
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
			// ������ ����ϴ� �κ�
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
