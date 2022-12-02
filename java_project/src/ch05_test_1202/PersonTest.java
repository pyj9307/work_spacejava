package ch05_test_1202;

public class PersonTest {
   
	 public static void main(String[] args) {
		 // 기본 생성자 호출.
		  Person pyj = new Person();
		  // 데이터에 직접 접근 할거냐?
//		  pyj.name = "박영주";
		  pyj.height = 171F;
		  pyj.weight = 75F;
		  

		  // set를 이용해서 name 값 설정하기.
		  pyj.setName("박영주세터로추가했음.");
		  pyj.showInfo();
		  System.out.println("get메서드로 이름호출 "+ pyj.getName());
		  
		  // 매개변수가 1개인 생성자를 호출.
		  Person pyj2 = new Person("박영주2");
		  pyj2.height = 171F;
		  pyj2.weight = 75F;
		  pyj2.showInfo();

		  // 매개변수가 3개인 생성자를 호출.
		  Person pyj3 = new Person("박영주3",171F,75F);
		  pyj3.showInfo();
//		  personKim.name = "������";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("�̼���", 175, 75);
	 }
}
