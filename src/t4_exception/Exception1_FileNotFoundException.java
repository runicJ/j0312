package t4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1_FileNotFoundException {
	public static void main(String[] args) {
		
			try {
				//FileInputStream is = new FileInputStream("test1.txt");
				FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFound.java"); //절대경로 //리눅스는 /
				System.out.println("test.txt파일이 존재합니다.");
			} catch (FileNotFoundException e) {
				System.out.println("test.txt파일이 없습니다.");
				e.printStackTrace();
			}  // Strem방식으로 읽겠다
		System.out.println("작업끝");  // 에러메시지 출력후 작업 종료	
	}
}
