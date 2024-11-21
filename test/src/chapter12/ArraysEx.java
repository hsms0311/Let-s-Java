package chapter12;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		String[] arr = {"김기동", "이기동", "박기동", "유기동"};
		
		Arrays.fill(arr, "고길동");
		for (String n : arr) System.out.print(n + ", ");
		
		System.out.println();
		
		Arrays.fill(arr, 1, 3, "X");
		for (String n : arr) System.out.print(n + ", ");
	}

}
