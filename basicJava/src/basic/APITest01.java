package basic;

import java.io.File;
import java.util.Random;

//import java.util.*;
//import java.util.Random;

public class APITest01 {
	public static void main(String[] args) {
		/*
		 *  문자열 처리를 위한 기능 사용을 위해 String class를 JVM이 인식하는(JVM이 찾아서 사용할 수있는 미리 약속된 공간, heap) 작업공간에 할당
		 *  
		 *  사용법은 다음과 같다.
		 *  ClassName variable = new ClassName();
		 *  ---------                ----------
		 *  할당되는 classname이 		new: heap에 할당해 사용하고싶은 class를 사용하는 연산자
		 *  datatype
		 */
		//new String();
		//위와 같이 하면 heap은 쓰였으나, stack에서 안 쓰였기에 무의미. 따라서 변수 선언을 해줘야 함.
		String str1 = new String();
		Object ob1 = new Object();
		StringBuffer sb = new StringBuffer();
		Thread t = new Thread();
		//jvm이 인식할 수 있는 기본 패키지는 현재 작업 중인 패키지+java.lang 패키지까지.
		//따라서 추가적인 package를 이용하기 위해선 추가해줘야 함.(import)
		Random rand=new Random();
		new File("파일path");//Random과 FIle을 heap에 올린 상태
	}

}
