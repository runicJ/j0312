package t2_nested3;

// 중첩클래스 : 로컬 클래스
public class Test1 {
	int su = 500;
	
	public Test1() {  // 생성자
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}

	public void modClass() {  // 메소드 안에 있는 것은 메소드 안에서만 사용하고 사라짐, 메소드 벗어나면 소멸
		int atom = 900;
		System.out.println("이곳은 Test1클래스의 modClass메소드()입니다.");
		System.out.println("이곳은 Test1클래스의 modClass메소드() 안의 atom변수 입니다. " + atom);  // 사용안하면 노란줄
		
		// public class Aa {  // public 붙이면 에러
		class Aa {  // 로컬 클래스 메소드 안에서만 사용하고 날리겠다
			int suA = 550;
	
			
			public Aa() {
				System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
			}
			
			public void modTest1A() {
				System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다.");
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		Aa aa = new Aa();  // 메소드 안 클래스는 생성해서 사용해야 //bin\Test1$1Aa.class $뒤에 숫자 메소드안
		System.out.println("중첩클래스 안의 suA : " + aa.suA);
		aa.modTest1A();	
	}
	
	public void modClass2() {
		class Bb {}
	}
	public void modClass3() {
		class Aa {}  // 같은 class명 가능
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}
