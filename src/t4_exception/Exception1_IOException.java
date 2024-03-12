package t4_exception;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1_IOException {
	public static void main(String[] args) {
		
		try {
			InputStreamReader is = new InputStreamReader(System.in);  //console 통해서 파일명을 입력받아 처리(system.in) //선언
			System.out.println("업로드할 파일명을 입력하세요");
			is.read();  //읽어라
			System.out.println("파일을 정상적으로 읽어들였습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽기 실패~~");
			e.printStackTrace();
		}
	}
}
