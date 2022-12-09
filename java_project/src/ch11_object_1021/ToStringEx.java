package ch11_object_1021;

class Book{ // 암묵적으로 Object를 상속 받고 있음.
	// Object toString 메서드가 존재합니다.
	// 이 메서드는 의미가 없는 해당 메모리 주소값을 출력함.
	// 실제 작업은 데이터를 다루지, 주소값을 다루지 않습니다. 그래서 재정의 함.
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() { // toString은 Object Class가 이미 메서드를 가지고 있음(의미 없는 주솟값 출력하는 것). 따라서 재정의함(Override)
		
		return "책제목 : " + bookTitle + ", 책번호 : " + bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	}
}

