package classTest;

public class Quiz {
	
	//문제, 정답, 먹이개수, 잭팟 선언
	String question;
	String answer;
	int feedCount;
	boolean jackpot;
	
	//기본 생성자
	public Quiz() {;}
	
	
	//일반문제는 어차피 false니까 오버로딩을 하는 게 편함
	public Quiz(String question, String answer, int feedCount) {
		this.question = question;
		this.answer = answer;
		this.feedCount = feedCount;
	}


	//잭팟문제 생성자
	public Quiz(String question, String answer, int feedCount, boolean jackpot) {
		super();
		this.question = question;
		this.answer = answer;
		this.feedCount = feedCount;
		this.jackpot = jackpot;
	}

	
	

}
