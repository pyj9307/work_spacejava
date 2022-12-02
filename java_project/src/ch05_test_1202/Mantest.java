package ch05_test_1202;

public class Mantest {

	public static void main(String[] args) {
		Man person = new Man();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.childrenNum = 3;

		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.childrenNum);
		
	}

}
