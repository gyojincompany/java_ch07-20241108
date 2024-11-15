package CH07_01;

public class Shape {
	//필드
	int width;
	int height;
	String color;
	
	public Shape() { //기본 생성자
		super();
	}

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	void area() {
		System.out.println(width * height);
	}
	
	final void color() {//오버라이딩 불가 메소드 선언
		System.out.println(color);
	}

}
