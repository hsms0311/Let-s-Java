package chapter09;

import java.lang.reflect.Method;

public class AnnotationEx {

	public static void main(String[] args) throws Exception {
		Method method[] = UserClass.class.getDeclaredMethods();
		
		for (int i=0; i<method.length; i++) {
			String methodName = method[i].getName();
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
			
			System.out.println(methodName + "의 어노테이션");
			System.out.println("value : " + annot.value() + " ");
			System.out.println("number : " + annot.number() + " ");
			System.out.println();
			
			method[i].invoke(new UserClass(), null); // 메서드 실행
		}
	}

}
