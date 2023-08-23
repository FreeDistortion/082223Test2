package additionalHW.three;

import java.util.Arrays;

public class BookMgr {
	private Book[] booklist;
	
	public BookMgr() {
		super();
		booklist=null;
	}

	public BookMgr(Book[] booklist) {
		super();
		this.booklist = booklist;
	}

	public void printBooklist(){
		for(int i =0;i<booklist.length;i++) {
			System.out.println(booklist[i].getTitle()+"\n");
			
		}
		
	}
	
	public void printTotalPrice(){
		int sum=0;
		for(int i =0;i<booklist.length;i++) {
			sum+=booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합: "+sum);

	}
}
