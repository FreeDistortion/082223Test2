package oop.basic.constructor;

public class Constructor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickname;
	private int point;
	
	//variable이 없는 생성자 - default constructor
	public Constructor(){
		System.out.println("Constructor class' default constructor");
	}
	
	//insert용 constructor
	public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickname) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.addr=addr;
		this.telNum=telNum;
		this.ssn=ssn;
		this.nickname=nickname;
		System.out.println("constructor with 7 variables");
	}
	
	//select용 constructor
	public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickname, int point) {
		this(name, id, pass, addr, telNum, ssn, nickname);
		this.point=point;
		System.out.println("constructor with 8 variables");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
