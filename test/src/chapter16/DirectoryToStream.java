package chapter16;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryToStream {

	public static void main(String[] args) {
		try {
			System.out.println("list() 메서드를 이용하여 스트림 생성하기");
			// src 디렉토리로 Path 객체 생성
			Path path = Paths.get("src");
			// src 경로의 모든 디렉토리와 파일 Stream 객체로 생성
			Stream<Path> s1 = Files.list(path);
			s1.forEach(s -> System.out.println(s.getFileName()));
			
			System.out.println("find() 메서드를 이용하여 스트림 생성하기");
			// src 디렉토리로 시작해서 10단계까지의 디렉토리 깊이까지 탐색
			Stream<Path> s2 = Files.find(path, 10, (s, BasicFileAttributes) -> {
				File file = s.toFile();
				// 디렉토리가 아니고 파일 이름에 Stream 이 포함된 파일명
				return !file.isDirectory() && file.getName().contains("Stream");
			});
			s2.forEach(s -> System.out.println(s.getFileName()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
