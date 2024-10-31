package chapter05;

import java.util.Scanner;

public class SwitchEx2
{

	public static void main(String[] args)
	{
		System.out.println("점수 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String grade = "";
		
		switch (score / 10) {
			case 9 :
				grade = "A";
				break;
				
			case 8 :
				grade = "B";
				break;
				
			case 7 :
				grade = "C";
				break;
				
			case 6 :
				grade = "D";
				break;
				
			default :
				grade = "F";
		}
		System.out.println("학점 : " + grade);
	}

}
