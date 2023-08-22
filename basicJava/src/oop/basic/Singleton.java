package oop.basic;
//동시 접속에 대한 처리 필 - 객체의 field나 method를 접근하는 부분의 부분logic이나 method 앞에 synchronized처리
public class Singleton {
	//Math m = new Math(); <- not visible err: private constructor
	private static Singleton singleton=new Singleton();
	private Singleton() {
		System.out.println("instance generated");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}

