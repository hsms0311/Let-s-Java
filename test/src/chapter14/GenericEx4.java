package chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx4 {

	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "김기동");
		map.put("id", "kim");
		map.put("age", 20);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "이기동");
		map.put("id", "lee");
		map.put("age", 30);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "박기동");
		map.put("id", "park");
		map.put("age", 40);
		list.add(map);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("인덱스 : " + i
					+ ", 이름 : " + list.get(i).get("name")
					+ ", 아이디 : " + list.get(i).get("id")
					+ ", 나이 : " + list.get(i).get("age"));
		}
	}

}
