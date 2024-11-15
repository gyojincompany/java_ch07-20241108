package CH07_01;

public class Triangle extends Shape{	
	
	String name;
	int point;
	
	public Triangle() {
		super();
	}

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override //annotation
	void area() {
		// TODO Auto-generated method stub
		System.out.println(width * height*0.5);
		
	}
	void areaSuper() {
		super.area();//부모 area 메소드 호출
	}
	
	
}
