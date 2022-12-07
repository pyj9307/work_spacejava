package ch08_inheritance_1020;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 모든 클래스는 부모 클래스가 : Object 최고 상위 클래스가 암묵적으로 상속되어짐.
		// 생성자 호출하는 부분이 생략 -> super();
		
		// 상속 클래스를 배워 
		
		Customer customerLee = new Customer(10010, "이순신");
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===============================");
		
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// 다형성에서 부모클래스 형으로 박으면
		// 바라보는 관점은 부모클래스 형으로 보인다.
		// 확인 lsy. 짝어보면 부모클래스만 보입니다.
		Customer lsy = new VIPCustomer();
		// 원래의 자식 클래스 형으로 변환 다운캐스팅
		// 명시적 형병환을 했을 때 이것을 받을 형은 원래 자식 클래스 형입니다.
		// lsy7. 찍어보면 자식클래스와 부모 클래스가 전부 다 보입니다.
		// 상속은 그래서 자식보다는 부모가 먼저 초기화가 반드시 되므로
		// 1타 2피로 사용 가능합니다.
		VIPCustomer lsy7 = (VIPCustomer)lsy;
		
		VIPCustomer lsy2 = new VIPCustomer(); // 가 아니라 Customer로도 받을 수 있다.
		Object lsy3 = new VIPCustomer();
		
		
	}
}
