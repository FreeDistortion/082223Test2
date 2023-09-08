package additionalHW.seven.two;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		//	ArrayList를 만들어 [1.사용데이터]의 객체의 순서대로 Circle 객체와 Rectangle 객체를 생성하여 넣는다.
		ArrayList<Shape> arrayList=new ArrayList<>();
		arrayList.add(new Rectangle(4, 7, 5));
		arrayList.add(new Rectangle(5, 4, 6));
		arrayList.add(new Circle(6, 7, 6));
		arrayList.add(new Circle(7, 8, 3));
		
		//	모든 객체의 넓이 정보와 둘레 정보를 화면에 출력한다. - for문 이용
		System.out.println("구분\t\t길이\tX좌표\tY좌표\tArea\tCircumference");
		for (Shape shape : arrayList) {
			System.out.println(shape.getClass().getSimpleName()+"\t"+shape.getLen()+"\t"+shape.point.getX()+"\t"+shape.point.getY()+"\t"+shape.getArea()+"\t"+shape.getCircumference());
		}
			
		//	모든 객체들에 move()함수를 이용하여 x가 10 증가, y 가 10 증가 되도록 변경한 후 객체 정보를 화면에 출력한다. - for문 이용
		for (Shape shape : arrayList) {
			if(shape instanceof Rectangle) {
				((Rectangle) shape).move(shape.point.getX()+10, shape.point.getY()+10);
			}else if (shape instanceof Circle) {
				((Circle) shape).move(shape.point.getX()+10, shape.point.getY()+10);
			}
			
			System.out.println(shape.getClass().getSimpleName()+"\t"+shape.getLen()+"\t"+shape.point.getX()+"\t"+shape.point.getY());

		}
	}
}
