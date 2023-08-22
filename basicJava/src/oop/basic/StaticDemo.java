package oop.basic;
//instance variable과 class variable의 비교
//instance variable -> 객체(instance)가 소유하는 variable(객체변수, 객체마다 고유한 값을 갖는 경우)
//static variable(class variable) -> 모든 객체가 공유해서 사용하는 변수
//									변하지 않는 값(상수), 

public class StaticDemo {
	int num;//instance마다 갖는 고유한 값을 저장하는 variable
	static int staticNum;//모든 객체가 공통으로 사용하는 값이나, 누적된 값을 저장하기 위해 사용하는 variable
	
	public StaticDemo() {
		num++;//num=num+1;
		staticNum++;
	}
	public void display() {
		System.out.println("num->"+num+", staticNum->"+staticNum);
	}
}
