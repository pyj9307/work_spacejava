package ch09_gamelevel_1021;

public class UltraLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("말을 타고 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("2단 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("두 바퀴 돕니다.");		
	}
	
	@Override
	public void over1() {
		System.out.println("에너지파를 날립니다.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초고급자 레벨 입니다. *****");
	}

}