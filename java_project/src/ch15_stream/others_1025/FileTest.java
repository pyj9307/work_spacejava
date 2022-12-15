package ch15_stream.others_1025;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		// C:\JAVA_Workspace2\fileTest : 절대 경로, 여기가 파일 서버 역할
		// . 점은 현재위치, ./ : 현재 폴더를 기준으로 하위
		// .. 점점은 부모 폴더 : 상대 경로
//		File file = new File("C:\\Temp\\newFile.txt");
		File file = new File("C:\\JAVA_Workspace2\\fileTest\\newFile.txt");  // 다른 확장자도 가능.
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		//file.delete();
		
		
		
		
		
		
		
		
		
		
	}
}
