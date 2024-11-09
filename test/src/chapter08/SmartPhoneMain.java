package chapter08;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "전화기";
		p.color = "화이트";
		p.company = "엘지";
		
		System.out.println("Phone 출력");
		System.out.println(p.name);
		System.out.println(p.color);
		System.out.println(p.company);
		p.call();
		p.receive();
//		p.installApp(); // 에러
		
		SmartPhone sp = new SmartPhone();
		sp.name = "갤럭시";
		sp.color = "블랙";
		sp.company = "삼성";
		
		System.out.println("SmartPhone 출력");
		System.out.println(sp.name);
		System.out.println(sp.color);
		System.out.println(sp.company);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}
