
public class Ex09_����� {

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
//		** ��... ���� ���� �ʹ� �ФФФ�
//		*�� ���� ������������
		
		for(i=5; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
