package additionalHW.six.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.tree.ExpandVetoException;

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
		Student st = new Student(name);
		if(studentList.contains(st.getName())){
			return st;
		}
		else {
			return null;
		}
			
	}

	public ArrayList search(String grade) {
	    /*
		  점수 등급으로 학생 목록 검색 
		*/  
		
	}
	 
}
