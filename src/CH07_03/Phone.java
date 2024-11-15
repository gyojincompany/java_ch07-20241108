package CH07_03;

public abstract class Phone {//추상클래스
	//필드
	String owner;
	
	//생성자
	public Phone() {
	super();
	}

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public abstract int powerType(); //추상메소드
	//1) 추상메소드는 추상클래스 내에만 선언 가능하다.
	//2) 추상메소드는 메소드의 내용이 없다->{} 없다
	
}
