package t4_exception;

public class Exception2_NullPointer {
	public static void main(String[] args) {
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("o : " + str.charAt(2));
		try {  // 오류 메시지 오류 라인 위에 try~
			System.out.println("str2 : " + str2.charAt(2));
			System.out.println("정상 처리");
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("null값 체크 : " + e.getMessage());
		}
	}
}
