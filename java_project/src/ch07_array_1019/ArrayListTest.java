package ch07_array_1019;

//ctrl + shift + o : 자동임포트
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// Student 타입으로 ArrayList를 만들기 -> students
		ArrayList<Student> students = new ArrayList<Student>();
		// 해당 ArrayList에 각자 알고 있는 이름 3개만 등록하기.
		students.add( new Student("조정래") );
		students.add( new Student("헤르만 헤세") );
		students.add( new Student("유시민" ) );
		// Student에 생성자를 잘 보고 객체 만들기.
		// showInfo를 이용해 출력해보기
		// 기본 for문 출력하고
		// 향상된 for문 출력하기
		for(int i=0; i<students.size(); i++){
			
			Student student = students.get(i);
			student.showInfo();
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Student student : students){
			student.showInfo();
		}
		
		// 기본 선언하는 부분
		ArrayList<Book> library = new ArrayList<Book>();

		// <String> : String 타입만 넣을 수 있다.
		// ArrayList<String> library = new ArrayList<String>();
		// library.add( "lsy" ); -> 이건 가능
		
		// <Book> : Book 타입만 넣을 수 있다.
		// library.add( "lsy" ); -> 이런 건 안됨
		// library, ArrayList 형식은 Book 타입의 객체 5개를 등록했음.
		library.add( new Book("태백산맥", "조정래") );
		library.add( new Book("데미안", "헤르만 헤세") );
		library.add( new Book("어떻게 살 것인가", "유시민") );
		library.add( new Book("토지", "박경리") );
		library.add( new Book("어린왕자", "생텍쥐페리") );
		
		// 기본 반복문 for를 이용해서, 해당 ArrayList에 있는 값을 가져오기. 
		for(int i=0; i<library.size(); i++){
	
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library){
			book.showBookInfo();
		}
	}
}