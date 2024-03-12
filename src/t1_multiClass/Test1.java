package t1_multiClass;

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}

public class Test1 {  // 파일명과 같은 public 붙여서
	public static void main(String[] args) {
		System.out.println("이곳은 Test1클래스의 main메소드 입니다.");
	
		new Aa();
		
		new Bb();
		
		System.out.println("작업을 마칩니다.");
	}
}

class Bb {
	public Bb() {
		System.out.println("이곳은 Bb클래스 입니다.");
	}
}
