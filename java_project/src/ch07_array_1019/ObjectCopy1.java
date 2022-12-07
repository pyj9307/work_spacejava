package ch07_array_1019;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		// 복사
 		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
 		// 결과는 복사를 해당 주소값만 복사를 했네. 원본을 복사한게 아니라
 		// 얕은 복사 -> 실제 데이터가 위치한 주소만 복사를 했음.
 		
 		
		// 복사본 bookarray2의 객체를 확인하기(주소값 확인)
		System.out.println("bookArray2 출력하기.");
		
		// 향상된 for 출력해보기
		for(Book lang : bookArray1){
			System.out.println(lang);
		}
		
		System.out.println("bookArray2 출력하기.");
		
		for(int i=0; i<bookArray2.length; i++){
//			bookArray2[i].showBookInfo();
			System.out.println(bookArray2[i]);
		}
		
			System.out.println("bookArray1 출력하기.");
			for(int i=0; i<bookArray1.length; i++){
//				bookArray1[i].showBookInfo();
				System.out.println(bookArray1[i]);
		}
		
			System.out.println("bookArray2 내용물 출력하기.");
			for(int i=0; i<bookArray2.length; i++){
//				bookArray2[i].showBookInfo();
				bookArray2[i].showBookInfo();
		}
		
	}
}
