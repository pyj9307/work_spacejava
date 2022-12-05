package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student2 pyjStudent6 = new Student2();
		System.out.println(Student2.getSerialNum());
		Student2.setSerialNum(2000);
		System.out.println(Student2.getSerialNum());

		// Student 클래스로 객체를 생성해서, 자동으로 학번이 어떻게 부여 되는지 확인.
		Student1 pyjStudent3 = new Student1();
		System.out.println("pyjStudent3의 학번 : " + pyjStudent3.studentID);
		

		Student1 pyjStudent4 = new Student1();
		System.out.println("pyjStudent4의 학번 : " + pyjStudent4.studentID);
		

		Student1 pyjStudent5 = new Student1();
		System.out.println("pyjStudent5의 학번 : " + pyjStudent5.studentID);
		
		
		
		// static 키워드에 접근 하는 방법
		// 인스턴스 (객체를) 생성해서 접근. 비추.
		// 해당 클래스명으로 접근.
		Student pyjStudent = new Student();
		pyjStudent.setStudentName("박영주");
		System.out.println(pyjStudent.serialNum);
		System.out.println(Student.serialNum);
		pyjStudent.serialNum++;
		System.out.println(pyjStudent.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println("pyjStudend2 의 정보");
		Student pyjStudent2 = new Student();
		System.out.println(pyjStudent2.serialNum);
//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
	}
}

