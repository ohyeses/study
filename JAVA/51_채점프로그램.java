import java.util.Arrays;
import java.util.Scanner;

public class Ex01_채점프로그램 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int[] input = new int[5];
	      
	      int[] bingo = {2, 4, 5, 3, 3};

	      System.out.println("──채점하기──");
	      System.out.println("답을 입력하세요");

	      for (int i = 0; i < input.length; i++) {
	         System.out.print(i + 1 + "번답 >>");
	         input[i] = sc.nextInt();
	      }
	      
	      //1. 반복문을 이용해 배열의 모든 값에 접근해 출력
	      System.out.print("입력한 답은 : ");
	      for(int i = 0; i < input.length; i++) {
	         System.out.print(input[i] + " ");
	      }
	      System.out.println();
	      System.out.println("정답확인");
	      
	      int cnt = 0;
	      for(int i = 0; i < input.length; i++) {
	         if(input[i] == bingo[i]) {
	            System.out.print("O" + " ");
	            cnt++;
	         }else {
	            System.out.print("X" + " ");
	         }
	      }
	      System.out.println("총점 : " + cnt*20);
	      
	      
	      
	      
	      //2. 새로운 도구(Arrays)를 이용해 출력
//	      System.out.print("입력한 답은 : ");
//	      System.out.println(Arrays.toString(input));
	      
//	      //for-each문, 확장 for문
//	      System.out.print("입력한 답은 : ");
//	      for (int answer : input) {
//	         System.out.print(answer + " ");
//	      }

	}

}
