import java.util.Arrays;
import java.util.Scanner;

public class Ex01_ä�����α׷� {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int[] input = new int[5];
	      
	      int[] bingo = {2, 4, 5, 3, 3};

	      System.out.println("����ä���ϱ⦡��");
	      System.out.println("���� �Է��ϼ���");

	      for (int i = 0; i < input.length; i++) {
	         System.out.print(i + 1 + "���� >>");
	         input[i] = sc.nextInt();
	      }
	      
	      //1. �ݺ����� �̿��� �迭�� ��� ���� ������ ���
	      System.out.print("�Է��� ���� : ");
	      for(int i = 0; i < input.length; i++) {
	         System.out.print(input[i] + " ");
	      }
	      System.out.println();
	      System.out.println("����Ȯ��");
	      
	      int cnt = 0;
	      for(int i = 0; i < input.length; i++) {
	         if(input[i] == bingo[i]) {
	            System.out.print("O" + " ");
	            cnt++;
	         }else {
	            System.out.print("X" + " ");
	         }
	      }
	      System.out.println("���� : " + cnt*20);
	      
	      
	      
	      
	      //2. ���ο� ����(Arrays)�� �̿��� ���
//	      System.out.print("�Է��� ���� : ");
//	      System.out.println(Arrays.toString(input));
	      
//	      //for-each��, Ȯ�� for��
//	      System.out.print("�Է��� ���� : ");
//	      for (int answer : input) {
//	         System.out.print(answer + " ");
//	      }

	}

}
