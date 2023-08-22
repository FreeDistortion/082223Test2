package oop.basic;

import java.util.Random;

public class StaticDemoTest {

	public static void main(String[] args) {
		// method area에 main이 올라감.
		// method area에 staticNum이 올라감.
		StaticDemo obj1=new StaticDemo();// method area: staticNum=1	stack:obj1	heap: num=1
		obj1.display();
		/*
		 * num변수와 staticNum변수는 다르므로 접근방식이 다름.
		 * num은 instance variable이므로 객체참조변수(obj1)를 통해서 사용
		 * staticNum변수는 static변수 즉, 객체의 소유가 아닌 class에 정의된 공유변수이므로 어떤 instance의 소유도 아님.
		 * 따라서, 클래스명.정적변수의 형식으로 access
		 * 즉, obj1.staticNum이 아니라, StaticDemo.staticNum으로 access해야함.
		 */
//		System.out.println("main->"+obj1.num+", "+obj1.staticNum);//		X
		System.out.println("main->"+obj1.num+", "+StaticDemo.staticNum);//	O
		
		StaticDemo obj2=new StaticDemo();// method area: staticNum=2	stack:obj1		heap: num=1
		obj2.display();
		System.out.println("main->"+obj2.num+", "+obj2.staticNum);
		
		StaticDemo obj3=new StaticDemo();// method area: staticNum=3	stack:obj1		heap: num=1
		obj3.display();
		System.out.println("main->"+obj3.num+", "+obj3.staticNum);

		//API에서 제공되는 static 변슈도 동일한 방법으로 접근
		Random rand=new Random();
		rand.nextBoolean();
		System.out.println(Math.PI);
		//				  ---------
		//				array.ArgsTest의 Integer.parseInt와 같은 개념
		System.out.println(Math.abs(-10));
	}

}
