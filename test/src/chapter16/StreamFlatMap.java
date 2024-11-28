package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFlatMap {

	public static void main(String[] args) {
		// 문자열을 공백으로 분리해서 매핑
		List<String> list1 = Arrays.asList("동해물과", 
				"백두산이", "마르고", "닳도록");
		
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		// 문자열을 , 로 분리해서 double 자료형으로 변환해서 매핑
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3",
				"4.4, 5.5, 6.6", "7.7, 8.8, 9.9");
		
		DoubleStream ds = list2.stream().flatMapToDouble(data -> {
			String[] sa = data.split(", ");
			double[] da = new double[sa.length];
			for (int i=0; i<da.length; i++) {
				da[i] = Double.parseDouble(sa[i].trim());
			}
			return Arrays.stream(da);
		});
		ds.forEach(s -> System.out.println(s));
		System.out.println();
		
		// 문자열을 , 로 분리해서 int 자료형으로 변환해서 매핑
		List<String> list3 = Arrays.asList("1, 2, 3", "4, 5, 6");
		
		IntStream is = list3.stream().flatMapToInt(data -> {
			String[] sa = data.split(", ");
			int[] ia = new int[sa.length];
			for (int i=0; i<ia.length; i++) {
				ia[i] = Integer.parseInt(sa[i].trim());
			}
			return Arrays.stream(ia);
		});
		is.forEach(s -> System.out.println(s));
	}

}
