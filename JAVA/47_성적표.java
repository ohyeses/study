import java.util.Scanner;

public class Ex10_����ǥ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "��° �Է� >>");
			score[i] = sc.nextInt();
		}
		
		//�Էµ� ����
		System.out.print("�Էµ� ���� : ");
		for (int i = 0; i < score.length; i++) {
		System.out.print(score[i]+ " ");
		}
		
		int max = score[0];
		int min = score[0];
		int sum = 0;
		float avg = 0;
		
		System.out.println();
		//�ְ� ����, ���� ����, �հ�, ���
		for(int i =0; i< score.length; i++) {
			if( score[i] > max) {
				max = score[i];
			}
			if( score[i] < min) {
				min = score[i];
			}
			sum += score[i];
			
		}
		avg = sum / score.length;
		System.out.print("�ְ� ���� : " + max);
		System.out.println();
		System.out.print("���� ���� : " + min);
		System.out.println();
		System.out.print("���� : " + sum);
		System.out.println();
		System.out.print("��� : " + avg);
		
		
		
		
	}

}
