package ch10_interfaceex_1021;

public class CustomerTest {

	public static void main(String[] args) {
		
		// 고객이 환불을 하는 인터페이스 만들기
		// refund라는 추상 메서드 만들기.
		// 환불 인터페이스 구현하기
		// 해당 고객으로 환불 받아보기.
		// 다형성으로 환불 인터페이스형으로 선언해서 사용해보기.

		Customer customer = new Customer();
	
		// 인터페이스의 다향성 개념으로 Customer 클래스를 해당 인터페이스 형으로 할당.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		System.out.println();
		
		Refund refunder = customer;
		refunder.refund();
		refunder.order();
		System.out.println();
		
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer2.refund();
			customer2.order();
		}
	}
}


