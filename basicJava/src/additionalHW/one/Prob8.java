package additionalHW;

public class Prob8 {

	public static void main(String args[]) {
		
		Prob8 prob8 = new Prob8();
		
		System.out.println( prob8.leftPad("SDS", 6, '#') );
		System.out.println( prob8.leftPad("SDS", 5, '$') ); 
		System.out.println( prob8.leftPad("SDS", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		
		/*  여기에 프로그램을 완성하십시오. */
		String newLine="";
		if(str.length()>size) {
			return str;
		}else {
			for(int i =1;i<=size-str.length();i++) {
				newLine+=padChar;
			}
			newLine+=str;

		}
		
		return newLine;
	}
	
}
