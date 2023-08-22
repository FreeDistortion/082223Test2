package api.lang;

//POJO(Plain Old Java Object): 모든 일반적인 자바 class
public class Person {
	private String name;
	private String addr;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		// obj의 타입이 Perosn class 타입인지 검사
		if(obj instanceof Person) {
			//갹체의 값을 비교해야 하기에 Person의 member를 access
			Person p = (Person)obj;
			//객체의 모든 값 비교
			if(this.name.equals(p.name)&this.addr.equals(p.addr)&this.age==p.age) {
				return true;
			}
		}
		return false;
	}

	
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return this.name;//return name;
	}
	
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
