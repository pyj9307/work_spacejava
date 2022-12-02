package ch05_test_1202;

public class PersonTest1 {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;

		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.numberOfChildren);
	}
}
