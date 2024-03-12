package t4_exception;

public class Exception5_throw2 {
	public static void main(String[] args) {
		try {
			findMethod();  // main은 시작 던질 수 없음. try~ 무조건 한번은
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 클래스가 없습니다." + e.getMessage());
		} finally {
			System.out.println("작업끝....");		
		}
	}

	private static void findMethod() throws ClassNotFoundException {
		Class.forName("java.lang.String2");  // 내 선언부에 던지겠다 main으로
		System.out.println("계속 진행중...");
	}	
}
