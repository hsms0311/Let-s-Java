package chapter07;

public class CarMain {

	public static void main(String[] args) {
		Car casper = new Car();
		Car pride = new Car();

		casper.color = "화이트";
		casper.company = "현대";
		casper.type = "경형";

		pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";

		casper.go();
		pride.back();

		System.out.println(casper.color);
		System.out.println(casper.company);
		System.out.println(casper.type);

		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}

}
