package api.lang;
//String class의 constructor
public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data1= {97,99,100,97,98};
		String str1=new String(data1);
		String str2 = new String(data1,2,3);
		System.out.println(str1);
		System.out.println(str2);
		
		char[] data2= {'a','b','c','d'};
		String str3 = new String(data2);
		String str4 = new String(data2,1,2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
