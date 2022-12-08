package ch08_witharraylist_1020;

public class VVIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	private int parkingNum;

	public VVIPCustomer(int customerID, String customerName, int agentID, int parkingNum){
		super(customerID, customerName);
		// 1) 혜택 추가 : 보너스 적립율 : 15%, 할인율 20%, 전문 상담원 VVIP , 추가로 발렛 파킹 제공. 
		customerGrade = "VVIP";
		bonusRatio = 0.15;
		saleRatio = 0.2;
		this.agentID = agentID;
		this.parkingNum = parkingNum;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "발렛 파킹 번호는 " + parkingNum + "입니다";  
	}

	public int getAgentID(){
		return agentID;
	}
	
	public int getParkingNumber() {
		return parkingNum;
	}
}