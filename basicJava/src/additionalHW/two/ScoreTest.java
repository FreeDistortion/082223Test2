package additionalHW.two;

class Score{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum=kor+eng+math;
		avg=(double)sum/3;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void print() {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
	}
	public int getSum() {
		return sum;
	}
}

public class ScoreTest{
   public static void main(String []args){
      int totalScore = 0;
      Score s1 = new Score("홍길동", 10, 20, 30);
     
      
      Score s2 = new Score("김자바", 50, 40, 60);
      
     
      Score s3 = new Score("이디비", 70, 100, 50);
      
      System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

      s1.print();
      s2.print();
      s3.print();
      totalScore=s1.getSum()+s2.getSum()+s3.getSum();
      System.out.print("총  계\t"
      +(s1.getKor()+s2.getKor()+s3.getKor())+"\t"
      +(s1.getEng()+s2.getEng()+s3.getEng())+"\t"
      +(s1.getMath()+s2.getMath()+s3.getMath())+"\t"
      +totalScore+"\t"+((double)totalScore/3)
      );
//총계용 국어, 영어, 수학, 총점, 평균값을 계산하여 출력되도록
//이곳을 완성하시오.
      
   }
}