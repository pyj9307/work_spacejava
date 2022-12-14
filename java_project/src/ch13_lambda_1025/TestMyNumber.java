package ch13_lambda_1025;

public class TestMyNumber {

	public static void main(String[] args) {
		// 람다식을 사용한다고 하는 것은 결국 메서드를 사용한다.
		// 일반 메서드보다 가독성이 좋다.
		// 그런데 람다식을 사용하려고 보니깐 이름이 없네. 해당 인터페이스에 예를 들어
		// 메서드 2개이면, 람사식으로 어느 메서드를 선택해서 사용할지 모릅니다.
		// 에너테이션으로 함수형 인터페이스를 선언해서, 컴파일러에게 알려줍니다.
		// 람다식으로 이 인터페이스를 사용할거야. 그러니 개발자가 혹시나 모르고
		// 메서드를 2개 이상 만든다면 경고
		MyNumber max = (x, y)->(x>= y)? x:y; // 람다식을 인터페이스형 max 변수에 대입

		System.out.println(max.getMax(10, 20));// 인터페이스형 변수로 메서드 호출
		
	//	MyNumber max2 = (x, y)-> x>=y ?x:y;
	//	System.out.println(max2.getMax(10, 20));
	}
}
