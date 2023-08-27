package additionalHW.six.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentManager {
	private List studentList;
	

	public StudentManager() {
		studentList = new ArrayList();
	} 
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public List getStudentList() {
		return studentList;
	}
	
	public Student getStudent(String name) { 
		/*
		  학생이름(name)으로 학생 검색 
		*/ 

		Student student=new Student(name);
		Iterator<Student> it=studentList.iterator();
		while(it.hasNext()) {
			student= it.next();
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return student;
	}

	public ArrayList search(String grade) {
	    /*
		  점수 등급으로 학생 목록 검색 
		*/  
		ArrayList students= new ArrayList();
		
		Iterator<Student> it=studentList.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			if(st.getGrade().equals(grade))
				students.add(st);
//			if(students.contains(grade)) {
//				
//				return students;
//			}
		}
		return students;
	}
	 
}
