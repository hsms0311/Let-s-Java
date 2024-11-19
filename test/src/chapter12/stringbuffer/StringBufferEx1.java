package chapter12.stringbuffer;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcd");
		System.out.println("문자열 연결전 sb = " 
							+ System.identityHashCode(sb));
		sb.append("efgh");
		System.out.println("문자열 연결후 sb = " 
							+ System.identityHashCode(sb));
		System.out.println(sb.toString().equals("abcdefgh"));
	}

}
