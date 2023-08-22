package api.lang;

//String과 StringBuffer의 성능 비교
public class StringStringBufferTest {
	// String으로 객체를 만들고 문자열을 추가해서 실행시간을 측정하기
	public static void stringCheck(int count) {
		long start = System.nanoTime();
		String str = new String("java");
		for (int i = 1; i <= count; i++) {
			str += "java";
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str=str+java");
		System.out.println("실행시간: " + time);
	}

	// StringBuffer로 객체를 만들고 문자열을 추가해서 실행시간을 측정하기
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer str = new StringBuffer("java");
		for (int i = 1; i <= count; i++) {
			str.append("java");
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str.append(\"java\")");
		System.out.println("실행시간: " + time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10000;
		System.out.println("실행횟수-> " + count);
		stringCheck(count);
		System.out.println("---------------------------");
		stringBufferCheck(count);
	}

}
