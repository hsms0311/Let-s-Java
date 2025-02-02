package chapter05;

public class zPractice {}

// 	01. 1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오.
//	아래 코드에서 반복문을 이용하여 합계 연산을 처리하는 코드를 추가하시오.
//
//	public static void main(String[] args) {
//		int sum = 0;
//		
//		// for 문을 이용하여 반복 합계 연산.
//
//		System.out.println("5의 배수의 합계는 " + sum);
//	}
//	[실행 결과]
//	5의 배수의 합계는 1050
//
//	정답 : 
//	for (int i=1; i<=100; i++) {
//		if (i % 5 == 0) sum += i;
//	}


//	02. 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오.
//
//	public static void main(String[] args) {
//		int evenSum = 0;
//		int oddSum = 0;
//
//		// for 문을 이용하여 반복 합계 연산.
//	
//		for (int i=1; i<=100; i++) {
//			// 코드 작성.
//		}
//		System.out.println("짝수의 합계는 " + evenSum);
//		System.out.println("홀수의 합계는 " + oddSum);
//	}
//	[실행 결과]
//	짝수의 합계는 2550
//	홀수의 합계는 2500
//
//	정답 :
//	if (i % 2 == 0) {
//		evenSum += i;
//	} else {
//		oddSum += i;
//	}


//	03. 두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를
//	출력하는 프로그램을 작성하시오.
//
//	public static void main(String[] args) {
//		for (int x=1; x<=6; x++) {
//			for (int y=1; y<=6; y++) {
//				// 코드 작성.
//			}
//		}
//	}
//	[실행 결과]
//	(1, 5)
//	(2, 4)
//	(3, 3)
//	(4, 2)
//	(5, 1)
//
//	정답 : 
//	if (x + y == 6) {
//		System.out.println("(" + x + "," + y + ")");
//	}


// 	04. 이중 for 문을 이용하여 아래와 같은 실행 결과가
//	출력되도록 코드를 작성하시오.
//	[실행 결과]
//	*
//	**
//	***
//	****
//	*****
//
//	정답 :
//	for (int i=1; i<=5; i++) {
//		for (int j=1; j<=i; j++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}


//	05. 이중 for 문을 이용하여 아래와 같은 실행 결과가
//	출력되도록 코드를 작성하시오.
//	[실행 결과]
//	*****
//	****
//	***
//	**
//	*
//
//	정답 :
//	for (int i=5; i>=1; i--) {
//		for (int j=i; j>=1; j--) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}


//	06. 이중 for 문을 이용하여 아래와 같은 실행 결과가
//	출력되도록 코드를 작성하시오.
//	[실행 결과]
//		*
//	   ***
//	  *****
//	 *******
//  *********
//
//	정답 :
//	for (int i=1; i<=5; i++) {
//		for (int j=5-i; j>0; j--) {
//			System.out.print(" ");
//		}
//		for (int k=1; k<=i*2-1; k++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}


//	07. 주사위의 눈이 6이 나올때까지 계속 반복해서 굴리고,
//	눈이 6이 되면 지금까지 주사위를 굴린 횟수까지 출력하는
//	코드를 작성하시오. (while 문으로 반복, 주사위는 
//	Math.random()으로 작성)
//	[실행 결과]
//	(3)
//	(6)
//	총 주사위 굴린 횟수는 : 2회
//
//	정답 : 
//	public static void main(String[] args) {
//		int count = 0;
//
//		while (true) {
//			int dice = (int)(Math.random()*6)+1;
//
//			System.out.println("(" + dice + ")");
//
//			count++;
//
//			if (dice == 6) {
//				break;
//			}
//		}
//		System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
//	}