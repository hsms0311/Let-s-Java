package chapter05;

public class SwitchExStr {

	public static void main(String[] args) {
		String addr = "파주";

		switch (addr) {
			case "서울":
				System.out.println("서울입니다.");
				break;

			case "경기":
				System.out.println("경기입니다.");
				break;

			case "제주":
				System.out.println("제주입니다.");
				break;

			default:
				System.out.println("업서용...");
		}
	}

}
