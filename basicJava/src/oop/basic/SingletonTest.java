package oop.basic;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start...");
//		Singleton obj = new Singleton(); not visible err occur
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("obj1 & obj2 are same instance");
		}else {
			System.out.println("obj1 & obj2 are different instance");
		}
	}

}
