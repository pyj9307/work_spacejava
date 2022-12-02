package ch05_test_1018;

public class Student2 {
	String studentName; // 이름
	int studentNum; // 학번
	String estudentEmail; // 메일
	String location; // 사는 곳
	// 클래스 기본적인 멤버 변수를 선언만 했음.
	// 기본형을 제외하고는 참조형 변수. 예) Student2, String 등
	
	public void sum(int num1, int num2) { // void 리턴의 결과값이 없다.
		System.out.println(num1+num2);
		
	}
	public static int sum2(int num1, int num2) {
		System.out.println(num1+num2);
		return num1+num2; // 결과값의 반환 타입이 int임을 나타냄.
		// 해당 메서드 선언부에서 확인이 가능.
		
	}
	
	public static void main(String[] args) {
		
		// 해당 객체를 생성하는 new 키워드 설명은 안드렸음.
		Student2 lsy = new Student2();
		// Student2 : 클래스 이름.
		// lsy : 참조형 변수 이름.
		// new :  키워드를 통해서 해당 객체를 생성.
		// Student2() : 매개변수가 없는 기본 생성자라고 함.
		// 역할은 기본값을 초기화하는 역할.
		
		lsy.sum(10, 20);
	}
	
}
