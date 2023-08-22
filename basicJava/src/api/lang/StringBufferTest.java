package api.lang;

import java.net.MulticastSocket;

//String은 원본이 변경되지 않고 String method의 호출 결과가 새로운 String 객체로 만들어져 리턴.
//""로 연결되는 조작이 빈번한 경우, 문자열이 지속적으로 바뀌므로 상수풀에 계속 객체가 만들어짐
//문자열 조작이 자주 발생하는 경우 StingBuffer나 StringBuilder를 이용해서 작업
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("java programming");
		StringBuilder sbuilder = new StringBuilder("java programming");
		System.out.println("원본: "+sb);
		System.out.println("원본: "+sbuilder);
		
		//문자열 뒤에 추가하기
		sb.append("is funny.");
		sbuilder.append("is funny.");
		System.out.println("원본: "+sb);
		System.out.println("원본: "+sbuilder);

		//문자열 중간에 삽입하기
		sb.insert(2, "servlet");
		sb.insert(5, "jsp");
		System.out.println("원본: "+sb);
		System.out.println("원본: "+sbuilder);

		//문자열삭제
		sb.delete(2, 5);//start ~ end-1
		sbuilder.delete(4, 8);
		System.out.println("원본: "+sb);
		System.out.println("원본: "+sbuilder);
		
		//문자열 거꾸로 변경
		sb.reverse();
		sbuilder.reverse();
		System.out.println("원본: "+sb);
		System.out.println("원본: "+sbuilder);

	}

}
