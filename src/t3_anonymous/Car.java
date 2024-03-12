package t3_anonymous;
// 상속이나 인터페이스 해야 가능 상속,인터페이스 동시에 가능
public class Car extends Tire {

	@Override
	public void roll() {
		System.out.println("추상 타이어가 굴러갑니다.");
	}
	
	public void mod1() {
		System.out.println("이곳은 Car(자식객체)클래스 mod1메소드 입니다.");
	}
	
	Tire tire1 = new Tire() {  //익명은 자식객체 구현객체

		@Override
		public void roll() {
			System.out.println("익명 객체에서의 타이어가 굴러갑니다.");
		}
	};

	public void mod2() {
		tire1.roll();  // 익명객체에서 재정의한 메소드를 불러옴
		tire1.roll2();  // 부모가 가지고 있는 일반 메소드
	}
	
	public void mod3() {
		// 메소드 안에서 익명클래스 사용...
		Tire tire2 = new Tire() {

			@Override
			public void roll() {
				System.out.println("메소드 안의 익명객체에서 타이어가 굴러갑니다.");
			}
		};
		tire2.roll(); // 생성
	}
}
