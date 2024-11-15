package CH08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		tv.setVolume(70);
		audio.turnOn();
		
		RemoteControl rControl;//선언만 가능(메모리에 인스턴스 x)
		
		rControl = tv;
		rControl = audio;
		
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		

	}

}
