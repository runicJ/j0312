package t4_exception;

public class Exception1_ClassNotFound {
	public static void main(String[] args) {
		
		// java.lang.Object
		
		try {
			Class.forName("java.lang.Object2");  // 클래스가 있든없든 발생 forname 클래스객체로 클래스파일 이름을 찾음
			System.out.println("java.lang패키지에는 Object2클래스가 있습니다.");
		} catch (ClassNotFoundException e) {  // e는 변수 아무거나 넣어도 됨. // console에서 복사해서 넣어서봄 //(exception e)해도됨
			//System.out.println("java.lang패키지에는 Object2클래스가 없습니다.");
			//e.printStackTrace();
			System.out.println("java.lang패키지에는 Object2클래스가 없습니다. : " + e.getMessage());  // e.getMessage() 요약한 것
		}
		System.out.println("작업끝....");  // try~catch 구문에선 오류가 나도 작업을 마침
	}
}
