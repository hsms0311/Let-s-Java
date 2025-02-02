package chapter07;

public class CarMain2 {

	public static void main(String[] args) {
		// Car 타입의 배열 객체 생성.
		Car[] cars = new Car[3];

		Car casper = new Car();

		casper.color = "화이트";
		casper.company = "현대";
		casper.type = "경형";

		// 모든 인덱스에 casper 객체 저장.
		for (int i = 0; i < cars.length; i++) {
			cars[i] = casper;
		}

		System.out.println("2번 인덱스 color : " + cars[2].color);

		// 0번 인덱스 객체의 color 필드에 "블랙" 대입.
		cars[0].color = "블랙";

		System.out.println("2번 인덱스 color : " + cars[2].color);
	}

}
