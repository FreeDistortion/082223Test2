package HW;

public class Student {
	private int num;
	private String name;
	private int kor, mat, eng;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int num, String name, int kor, int mat, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
}
