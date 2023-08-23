package HW;

import java.util.ArrayList;

//ArrayListExam03 -> BoardExam처럼 변환
//Student class 만들어서 작업
public class ArrayListExam04_StudentDTO {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student student1 = new Student(1, "장동건", 100, 99, 88);
		Student student2 = new Student(2, "이민호", 89, 100, 100);
		Student student3 = new Student(3, "김범룡", 95, 89, 100);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		display(students);
	}

	public static void display(ArrayList<Student> students) {
		System.out.println("번호\t성명\t국어\t수학\t영어");
		for (Student student : students) {
			System.out.println(
							student.getNum()+"\t"+
							student.getName()+"\t"+
							student.getKor()+"\t"+
							student.getMat()+"\t"+
							student.getEng()
					);

		}
	}
}
