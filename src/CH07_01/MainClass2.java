package CH07_01;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = new Shape();
		Square square = new Square();
		Triangle triangle = new Triangle(10, 20);
		
		shape = square;//대입성공
		//square = shape;//대입실패
		shape = triangle;		
		
		Shape shape2 = triangle;//자동 타입 변환 자식객체->부모객체
		shape2.area();
		
//		triangle = square;
		
		
	}

}
