import java.util.Scanner;

public class Ex01_���� {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		
		//Ű����� ���� ������ �Է� �޾�
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
