package AkashJAVA;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Subject1=sc.nextInt();
		int Subject2=sc.nextInt();
		int Subject3=sc.nextInt();
		int TotalMarks=Subject1+Subject2+Subject3;
		int percentage=TotalMarks*100/300;
		System.out.println(TotalMarks);
		System.out.print(percentage+"%");
	}

}
