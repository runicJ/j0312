package t4_exception;

class Parent {
	
}

class Child extends Parent {
	
}

class Child2 extends Parent {
	
}

public class Exception3_final {
	public static void main(String[] args) {
		System.out.println("작업시작");
		// Child child = new Child();
		Parent child = new Child();
		Child ccc = (Child) child;
		System.out.println();
		
		Parent parent = new Parent();
		try {
			Child2 ccc2 = (Child2) parent;
			System.out.println("정상처리");
		} catch (ClassCastException e) {
			//e.printStackTrace();
			System.out.println("형변환 오류(다운캐스팅) : " + e.getMessage());
		}
		try {
			String data = null;
			System.out.println(data);  //System.out.println(); 문자로 연산
			System.out.println(data + 100);
			System.out.println((String) data + 100);
			System.out.println(data.toString() + 100);
			System.out.println("정상처리2");
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("null값 체크 : " + e.getMessage());
		} finally {
			System.out.println("작업끝");			
		}
	}
}
