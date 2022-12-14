package ch14_exception_1025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// a.txt 파일의 위치의 기준은 해당 프로젝트(패키지 바깥, 프로젝트 안에 만드는 거임)
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
		 	System.out.println(e);
			//return;
//			e.printStackTrace();
		} 
		System.out.println("여기도 수행됨..");
	}
}
