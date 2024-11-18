package chapter12;

public class CloneEx {

	public static void main(String[] args) {
		String[] arr1 = {"김기동", "이기동", "박기동", "유기동"};
		String[] arr2 = arr1.clone();
		
		System.out.println(arr1 == arr2);
		for (String v : arr2) {
			System.out.println(v);
		}
		
		String[] arr3 = new String[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		System.out.println(arr1 == arr3);
		for (String v : arr3) {
			System.out.println(v);
		}
	}

}
