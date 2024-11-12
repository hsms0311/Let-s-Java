package chapter08;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] a = new Animal[4];
		
		Animal Eagle = new Eagle("조류", "독수리");
		Animal Tiger = new Tiger("포유류", "호랑이");
		Animal Lion = new Lion("포유류", "사자");
		Animal Shark = new Shark("어류", "상어");
		
		a[0] = Eagle;
		a[1] = Tiger;
		a[2] = Lion;
		a[3] = Shark;
		
		for(int i=0; i<a.length; i++) {
			a[i].sleep();
		}
	}

}
