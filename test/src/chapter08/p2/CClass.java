package chapter08.p2;

import chapter08.p1.*;

public class CClass extends AClass {
	CClass() {
		this.varA = "varA";
//		this.varA2 = "varA2"; // 사용 불가
		this.methodA();
//		this.methodA2(); // 사용 불가
	}
}
