package chapter14;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "김기동");
		map.put("id", "kim");
		map.put("age", 20);
		
		System.out.println(map.get("name"));
		System.out.println(map.get("id"));
		System.out.println(map.get("age"));
	}

}
