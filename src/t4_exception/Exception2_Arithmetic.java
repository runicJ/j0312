package t4_exception;

// 실행 예외 처리
public class Exception2_Arithmetic {
	public static void main(String[] args) {
		int su1 = 10, su2 = 0;
		
		try {
			System.out.println("10 / 0 = " + (su1 / su2));
			System.out.println("정상처리");
		} catch (ArithmeticException e) {  //그냥 try~catch 하면 가장 상위 Exception e로 나옴
			//e.printStackTrace();  //오류메시지
			System.out.println("예외처리" + e.getMessage());  //기본 오류메시지			
		}
		System.out.println("작업끝");
	}
}
