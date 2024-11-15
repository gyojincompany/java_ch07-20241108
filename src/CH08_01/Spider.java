package CH08_01;

//interface는 extends 상속 x -> implements 구현 o
public class Spider implements Monster{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("거미 뜀");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("거미 걸음");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("거미줄 공격");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날지 못함");
	}
	
}
