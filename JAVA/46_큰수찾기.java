
public class Ex09_ū��ã�� {

	public static void main(String[] args) {
		int [] array = {33,25, 22, 90, 24, 45};
		
		// �迭�� �� �� ���� ū ���� ã�� ����ϴ� ���α׷��� ������ּ���
		
		// ��� ��� -> ���� ū ���� : 90
		int max = array[0];
		int temp = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.print("���� ū ���� : "+ max);
		
		for(int i=0; i<array.length; i++) {
			temp = array[i];
			if(temp >=max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
