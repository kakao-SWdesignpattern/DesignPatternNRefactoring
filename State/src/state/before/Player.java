package state.before;

public class Player {

	public static final int BEGINNER_LEVEL = 1;
	public static final int ADVANCED_LEVEL = 2;
	public static final int SUPER_LEVEL = 3;

	int level;
	
	public Player() {
		level = BEGINNER_LEVEL;
	}
	
	public void jump() {
		
		if(level == BEGINNER_LEVEL) {
			System.out.println("Jump 할 줄 모르지롱.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("높이 jump 합니다.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("아주 높이 jump 합니다.");
		}
	}
	
	public void run() {
		if(level == BEGINNER_LEVEL) {
			System.out.println("천천히 달립니다.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("빨리 달립니다.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("엄청 빨리 달립니다.");
		}
		
	}
	
	public void turn() {
		if(level == BEGINNER_LEVEL) {
			System.out.println("Turn 할 줄 모르지롱.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("Turn 할 줄 모르지롱.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("한 바퀴 돕니다.");	
		}
		
	}
	
	public void play(int time) {
				
		run();
		for(int i =0; i<time; i++) {
			jump();	
		}
		turn();
	}

	public void upgradeLevel(int level) {
		this.level = level;
	}
}
