package api.lang;

import java.util.Date;
import java.util.ArrayList;
import java.util.Random;

public class ObjectTest {

	public static void main(String[] args) {
		//equals는 하위 class에서 객체의 속성을 비교해서 같은 객체인지 여부를 bool로 return하도록 재정의해서 사용
		Object obj1=new Object();
		Object obj2=new Object();
		if(obj1==obj2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		if(obj1.equals(obj2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		Person p1=new Person("BP","Seoul",20);
		Person p2=new Person("BP","Seoul",20);
		if(p1.equals(p2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		//Object class의 method
		//toString method가 객체의 기본method - 기본method는 생략이 가능.
		System.out.println(obj1);//생략
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());//객체가 할당된 곳의 memory를 기준으로 값을 계산해서 return
		System.out.println(obj2.hashCode());
		
		
		System.out.println(p1);
		String str= new String("Java");
		System.out.println(str);
		Date d= new Date();
		System.out.println(d);
		ArrayList<String>list = new ArrayList();
		list.add("test");
		list.add("java");
		System.out.println(list);
		Random rand = new Random();
		System.out.println(rand);
		
	}

}
