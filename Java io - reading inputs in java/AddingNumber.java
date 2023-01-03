package AkashJAVA;

import java.util.Scanner;

public class AddingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		int sum=0;
		for(int i=0;i<TestCase;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			sum=a+b;
			System.out.println(sum);
		}
	}

}
