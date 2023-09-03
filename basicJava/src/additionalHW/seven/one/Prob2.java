package additionalHW.seven.one;

import javax.print.DocFlavor.INPUT_STREAM;

public class Prob2 {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	private int[] intArr;
	private int capacity;
	private int length = -1;

	public MyStack(int i) {
		if (i < 0) {
			intArr = new int[10];
			capacity = 10;
		} else {
			intArr = new int[i];
			capacity = i;
		}
		// TODO Auto-generated constructor stub
	}
	// 구현하시오.

	public void push(int i) {
			if (isFull()) {
			} else {
				length++;
				intArr[length] = i;
			}
		}

	
	public boolean isEmpty() {
		return length == -1;
	}

	public boolean isFull() {
		return length == capacity;
	}

	public int top() {
		if (isEmpty()) {
			return -1;
		} else {
			return intArr[length];
		}
	}

	public int pop() {
		if (isEmpty()) {

			return -1;

		} else {
			length--;
			return intArr[length+1];
		}
	}

}