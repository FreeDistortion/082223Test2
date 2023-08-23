package api.util;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	ArrayListExam04_StudentDTO에서 List에 저장한 StudentDTO 객체를 HashMap에 저장
		//	->	key: 1, 2, 3
		HashMap<Integer, Student> stuMap=new HashMap<>();
		Student student1 = new Student(1, "장동건", 100, 99, 88);
		Student student2 = new Student(2, "이민호", 89, 100, 100);
		Student student3 = new Student(3, "김범룡", 95, 89, 100);
		
		stuMap.put(1,student1);
		stuMap.put(2,student2);
		stuMap.put(3,student3);
		print(stuMap);
		
		//3.	print method 호출해서 결과 출력
	}
	
	//HashMap에 저장된 StudentDTO객체 값을 꺼내서 출력
	//2.	ArrayListExam04_StudentDTO의 print method 수정
	public static void print(HashMap<Integer, Student> stuMap) {
		System.out.println("번호\t성명\t국어\t수학\t영어");
		//2.1.	모든 key 추출
		Set<Integer> ketList=stuMap.keySet();
		
		//2.2. Set으로 반환된 Key를 Iterator변환
		Iterator<Integer> it=ketList.iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(stuMap.get(key));
		}
		
		
		
		
		
		for (int key:ketList) {
			Student val=stuMap.get(key);
			System.out.println(val.getName());
//			System.out.println(
//					stuMap.get(key).getNum()+"\t"+
//							stuMap.get(key).getName()+"\t"+
//							stuMap.get(key).getKor()+"\t"+
//							stuMap.get(key).getMat()+"\t"+
//							stuMap.get(key).getEng()
//					);

		}
	}
}






class Student {
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
