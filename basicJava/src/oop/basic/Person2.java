package oop.basic;
//java의 특징에 맞게 class 정의
//class 정의의 경우 field(클래스의 속성, 클래스의 구성요소, 클래스에서 다루는 data)는
//	private로 선언해서 외부에서 접근할 수 없도록 정보 은닉, 이후 public method를 통해 접근할 수 있도록 구현.
public class Person2 {
	//정보 은닉
	private String name;
	private String addr;
	private int age;
	
	//모든 field가 private으로 선언되어 있어, 값을 설정하거나 가져오기 위해 method 사용필요 
	//객체의 field에 값을 설정하는 method
	//메서드명 : set + 값이 저장될 field의 첫 글자를 대문자로 변경한 이름
	//e.g. name변수에 값을 설정하는 method의 경우
	//	setName(field에 값을 저장하는 method <- 이를 setter method라고 칭한다)
	
	/*
	 * class든 method든 하나의 기능을 수행해야 한다 -> setter method는 return value x -> void
	 */
	
	//통상적으로 method의 variable은 어떤 field에 영향을 미치는지를 파악하고, 해당 field와 이름을 같게 설정
	//field의 값을 variable로 변경하는 method
	//	field = variable;
	public void setName(String name){
		this.name=name;
//		----	  ----
//현재 작업 중인 객체  variable
	}
	
	
	//객체의 field에 저장된 값을 호출하는 곳으로 넘겨줄 method
	//메서드명: get + 값이 저장될 field의 첫 글자를 대문자로 변경한 이름
	//e.g. name 변수의 값을 가져올 수 있도록 method 정의
	//	getName(field의 값을 넘겨주는는 method <- 이를 getter method라고 칭한다)
	public String getName() {
		return this.name;//return name;
	}
	
	//addr과 age의 setter, getter method 정의 및 호출사용
	//addr: Seoul, age: 30
	
	public void setAddr(String addr) {
		this.addr=addr;
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
