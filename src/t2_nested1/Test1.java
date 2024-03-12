package t2_nested1;

// 중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 100;  //필드	
	
	public Test1() {  // 생성자
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}
	
	public class Aa {  // 독립된 클래스
		// int su = 100;  사용가능(O)	
		int suA = 200;
		//static int suB = 250;  // 인스턴스 객체 안에는 static 사용불가
		
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다.");
		}
		
		//public static void modTest1B() {}
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");  //생성자든 뭐든 있어야 실행가능
	}
}
// bin\Test1$Aa.class 인스턴스 클래스
// bin\Aa.class 독립적인 객체