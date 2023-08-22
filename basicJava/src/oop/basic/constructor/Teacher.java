package oop.basic.constructor;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {
		
	}
	//constructor는 생성될 떄 field가 바뀜.
	//set/get은 나중에 추가적으로 바꿔줄 수 있음.
	public Teacher(String name, int age, String subject) {
		this.name=name;
		this.age=age;
		this.subject=subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void display() {
		System.out.println("이\t름: "+name+"\t나\t이: "+age+"\t담당과목\t: "+subject);
	}
}
