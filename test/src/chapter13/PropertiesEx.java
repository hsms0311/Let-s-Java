package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		try {
			Properties p = new Properties();
			
			// properties 파일 읽어오기
			FileInputStream reader = new FileInputStream(
					"C:/DevData/Let's Java/test/src/chapter13"
					+ "/config.properties");
			
			// Properties 객체에 로드
			p.load(reader);
			System.out.println(p);
			System.out.println("이름 : " + p.get("name"));
			
			// properties 에 키, 값으로 추가
			p.put("subject", "자바");
			System.out.println(p);
			
			// properties 파일로 출력
			p.store(new FileOutputStream(
					"C:/DevData/Let's Java/test/src/chapter13"
					+ "test.properties"), "#save");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
