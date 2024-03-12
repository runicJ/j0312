package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1Run클래스의 main메소드 입니다.");
		System.out.println();
		
		Test1 t1 = new Test1();
		System.out.println("su : " + t1.su);
		t1.modTest1();
		System.out.println();
		
		new Aa();  // 외부(일반) 클래스
		System.out.println();
		
		Test1.Aa t1a = new Test1.Aa();  //힙영역 // 정적 멤버 클래스(중첩클래스) // 정적으로 선언 해서 클래스명.으로 접근
		System.out.println("suA : " + t1a.suA);
		t1a.modTest1A();
		t1a.modTest1B();  //힙영역에 있는 것을 불러옴  // 객체 생성 후 가져옴
		System.out.println();
		
		System.out.println("suB : " + Test1.Aa.suB);  //객체 생성x 메소드영역에서 가져옴
		Test1.Aa.modTest1B();
	}
}
