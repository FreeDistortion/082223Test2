package api.lang;
//String class의 중요 method 살펴보기 1
public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("java programming");
		String str2="is funny";
		System.out.println("str1.charAt(1)->"+str1.charAt(1));
		System.out.println("str1.concat(str2)->"+str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);//String의 값은 위와 같은 method로 다룬다고 해서 값이 바뀌지 않음. 따라서 web 환경같은 곳에선 StringBuffer등 다른 class를 쓰는 것이 용이.
		System.out.println("str1.indexOf('a')->"+str1.indexOf('a'));
		System.out.println("str1.indexOf(\"합\")->"+str1.indexOf("합"));
		System.out.println("str1.lastIndexOf('a')->"+str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexOf(\"합\")->"+str1.lastIndexOf("합"));
		System.out.println("str1.length()->"+str1.length());
		
		System.out.println("str1.equals(\"java programming\")->"+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")->"+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(\"java programming\")->"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")->"+str1.equalsIgnoreCase("Java programming"));
		
	}

}
