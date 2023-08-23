package additionalHW.six.four;

import java.net.NoRouteToHostException;

public class Student {
 
	private String name;	//학생이름
	private int midScore;	//중간점수
	private int endScore;	//기말점수
	private int taskScore;	//과제점수	
	private String grade;	//등급
	
	/*
	  학생이름을 매개변수로 하는 생성자 구현
	*/
	public Student(String name) {
		this.name=name;
	}


    /*
	  학생이름, 중간점수, 기말점수, 과제점수를 매개변수로 하는 생성자 구현
	*/ 	 
	public Student(String name, int midScore, int endScore, int taskScore) {
		super();
		this.name = name;
		this.midScore = midScore;
		this.endScore = endScore;
		this.taskScore = taskScore;
	}
	
	
	
	public void calcGrade() throws Exception {
		/* 
		  학생의 등급을 판단하는 메소드 구현
	    */
		int nMidScore=midScore*4/10;
		int nEndScore=endScore*4/10;
		int nTaskScore=taskScore*2/10;
		int sum=nEndScore+nMidScore+nTaskScore;
		if(sum<=100) {
			this.grade="A";
		}else if (sum<90) {
			this.grade="B";
		}else if (sum<80) {
			this.grade="C";
		}else if (sum<70) {
			this.grade="D";
		}else if (sum<60&sum>=0) {
			this.grade="F";
		}else {
			throw new Exception();
		}
		
	} 



	public int getEndScore() {
		return endScore;
	}

	public void setEndScore(int endScore) {
		this.endScore = endScore;
	}

	public int getMidScore() {
		return midScore;
	}

	public void setMidScore(int midScore) {
		this.midScore = midScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaskScore() {
		return taskScore;
	}

	public void setTaskScore(int taskScore) {
		this.taskScore = taskScore;
	}
	
		
	public String getGrade() {
		return grade;
	}
	 
}
