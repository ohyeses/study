import java.util.Scanner;

public class Ex10_성적표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 입력 >>");
			score[i] = sc.nextInt();
		}
		
		//입력된 점수
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < score.length; i++) {
		System.out.print(score[i]+ " ");
		}
		
		int max = score[0];
		int min = score[0];
		int sum = 0;
		float avg = 0;
		
		System.out.println();
		//최고 점수, 최저 점수, 합계, 평균
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
		System.out.print("최고 점수 : " + max);
		System.out.println();
		System.out.print("최저 점수 : " + min);
		System.out.println();
		System.out.print("총합 : " + sum);
		System.out.println();
		System.out.print("평균 : " + avg);
		
		
		
		
	}

}
