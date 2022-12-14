package ch13_lambda_1025;

// 컴파일러 할 떄 알려준다. 이 인터페이스는 함수형 인터페이스라서.
// 메서드 하나야.

// 에너테이션을 사용하게 되면 유효성을 체크를 하는 것처럼
// 미리 1차 검사.
// 만약 모르고 메서드를 2개를 만들 경우, 문법 체크해서 오류를 발생시킴
@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
//	int getMax2(int num1, int num2);
}
