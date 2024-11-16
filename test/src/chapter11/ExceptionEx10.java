package chapter11;

import java.util.Scanner;

public class ExceptionEx10 {
	static String user_id = "yoo";
	static String user_pw = "jw1234";

	public static void main(String[] args) throws Exception {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("아이디 : ");
			String input_id = scan.nextLine();
			
			System.out.print("비밀번호 : ");
			String input_pw = scan.nextLine();
			
			if (!user_id.equals(input_id)) {
				throw new LoginException("아이디를 다시 확인해주세요");
			} else if (!user_pw.equals(input_pw)) {
				throw new LoginException("비밀번호를 다시 확인해주세요");
			} else {
				System.out.println("로그인에 성공하였습니다");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
