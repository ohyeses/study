
public class Ex01_���������� {

	public static void main(String[] args) {
		int[] array = {25, 17, 32, 85, 30};
		float result = average(array);
		System.out.println("��հ��� : " + result + "�Դϴ�.");
		//���ϰ��� �� �迭�� ��� ������ ����� ������
	}

	//array�� ����ִ� ������ ����� ���ؼ� result�� ����(����)
	public static float average(int[] array) {
		float result = 0;
		
		for(int i = 0; i<array.length; i++) {
			result += array[i];
		}
		
		
		return result/array.length;
	}

}
