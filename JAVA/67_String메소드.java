import java.util.Arrays;

public class Ex02_String�޼ҵ� {

	public static void main(String[] args) {
		String str = "���� ���� �;��";
		//System.out.println(str.charAt(8));
		
		//'��'�� ����ϰ� �;��
		//index �� ���ϱ��? 8
		
		// ��Ʈ�� �迭�� ����.
		String[] array = str.split(" "); //""�� ���� �ɰ�. " "�� ���� �������� �����ּ���.
		
		System.out.println(Arrays.toString(array));
		
		for (int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
