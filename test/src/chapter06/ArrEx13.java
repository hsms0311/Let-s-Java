package chapter06;

public class ArrEx13 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신", "김유신"};

		int[] score = {90, 80, 100};

		int i = 0; // 인덱스 변수.

		for (String name : names) {
			System.out.println(name + " : " + score[i]);
			i++;
		}
	}

}
