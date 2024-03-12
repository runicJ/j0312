package t4_exception;

public class Exception5_throw {
	public static void main(String[] args) {
		findMethod();
		System.out.println("작업끝....");
	}

	private static void findMethod() {
		try {
			Class.forName("java.lang.String2");
			System.out.println("String클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 클래스가 없습니다." + e.getMessage());
		}
	}	
}
