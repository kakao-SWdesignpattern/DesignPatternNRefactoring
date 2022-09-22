package template.before;

public class HybridCar {
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void drive() {
		System.out.println("사람이 조작하거나 자율 주행을 합니다.");
		System.out.println("사람이 핸들로 방향을 바꾸거나 자동으로 바뀝니다.");
	}

	public void stop() {
		System.out.println("스스로 멈추거나 사람이 브레이크를 밟습니다.");		
	}
}
