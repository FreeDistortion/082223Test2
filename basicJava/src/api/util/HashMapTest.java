package api.util;

import java.util.HashMap;
import java.util.Set;

// Map
// ->	key와 value가 함께 발생하는 데이터를 저장하기 위한 자료구조
// ->	servlet과 jsp 내부에서 사용하는 데이터 저장구조가 모두 map구조

/*
 * 			Map
 * 		key		value
 * 		x		y
 * 
 * 
 */
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Hashmap 생성
		HashMap<String, Integer> map=new HashMap<>();
		
		//2.	HashMap에 데이터 저장
		//-> map도 순서가 없는 자료구조, key값을 이용햇 내부에서 저장될 ㅜ이치를 계산해서 저장되기 때문에 추출했을 때 넣은 순서대로 나오지 않는다.
		map.put("a01",100);
		map.put("a02",200);
		map.put("a03",300);
		map.put("a04",400);
		System.out.println("key a04's value-> "+map.get("a04"));
		map.put("a04",500);
		map.put("a05",500);
		
		//3.	HashMap에 저장된 요소의 개수
		System.out.println(map.size());
		
		//4.	HashMap에서 데이터 꺼내기
		System.out.println("key a04's value-> "+map.get("a04"));
		
		//5.	HashMap에 저장된 데이터를 모두 꺼내서 출렷하기
		//	1)	HashMap에 저장된 모든 key를 추출(key가 Set에 담겨서 return)
		Set<String> keyList=map.keySet();
		
		//	2)	반복문 안에서 키를 이용해서 map을 꺼내기
		for(String key:keyList) {
			int value=map.get(key);
			System.out.println("key-> "+key+"\tvalue-> "+value);
		}
		
	}

}
