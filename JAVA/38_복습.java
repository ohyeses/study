import java.util.Scanner;

public class Ex01_복습 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		
		//키보드로 부터 정수를 입력 받아
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
