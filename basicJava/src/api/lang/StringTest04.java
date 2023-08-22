package api.lang;
//String class의 중요 method 살펴보기 1

public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("java programming");
		String str2="is funny";
		System.out.println("str1.startsWith(\"java\")->"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"test\")->"+str1.startsWith("test"));
		System.out.println("str1.endsWith(\"ing\")->"+str1.endsWith("ing"));
		System.out.println("str1.endsWith(\"java\")->"+str1.endsWith("java"));
		System.out.println("str1.contains(\"ja\")->"+str1.contains("ja"));
		
		//대소문자변환
		System.out.println("str1.toUpperCase()->"+str1.toUpperCase());
		System.out.println("str1.toLowerCase()->"+str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.substring(5)->"+str1.substring(5));
		System.out.println("str1.substring(5,8)->"+str1.substring(5,8));
		System.out.println("str1.replace('a', 'A')->"+str1.replace('a', 'A'));
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
