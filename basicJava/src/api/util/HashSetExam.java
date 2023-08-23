package api.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	100,98,88,77,100을 HashSet에 저장
		//4.	2번 method 호출 후 출력
		//5.	3번 method 호출 후 HashSet에 저장된 data 출력
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(98);
		set.add(88);
		set.add(77);
		set.add(100);
		System.out.println(Arrays.toString(changeArr(set)));
		print(set);
	}
	
	//2.	HashSet -> array 변환 return
	public static int[] changeArr(HashSet<Integer> set) {
		int[] intArr=new int[set.size()];
		
		int i=0;
		
		for(int data:set) {
			intArr[i]=data;
			i++;
		}
		return intArr;
		
	}
	
	//3.	HashSet에 저장된 data 출력
	/*
	 * method name: print
	 * ->	Iterator를 이용해 출력
	 * ->	method 선언부 임의 지정
	 */
	public static void print(HashSet<Integer> set) {
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			int a=iterator.next();
			System.out.print(a+" ");
		}
	}
}
