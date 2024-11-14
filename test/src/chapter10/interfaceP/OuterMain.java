package chapter10.interfaceP;

public class OuterMain {

	public static void main(String[] args) {
		Outer o = new Outer();
		
		o.setInterfaceEx(new InterfaceExImple1());
		o.outerMethod();
		o.setInterfaceEx(new InterfaceExImple2());
		o.outerMethod();
	}

}
