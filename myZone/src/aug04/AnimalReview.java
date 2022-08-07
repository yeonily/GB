package aug04;

import java.util.Random;

public class AnimalReview {
	
	//변수 선언(이름, 나이, 먹이, 먹이개수, 생명)
	String name;
	int age;
	String feed;
	int feedCount;
	int life;
	
	//기본생성자 선언
	public AnimalReview() {}

	//생성자, 초기화생성자 선언
	public AnimalReview(String name, int age, String feed, int feedCount, int life) {
		this.name = name;
		this.age = age;
		this.feed = feed;
		this.feedCount = feedCount;
		this.life = life;
	}
	
	
	
	//eat 메소드
	//먹이개수-1, 생명+1;
	void eat() {
		feedCount--;
		life++;
	}
	
	//sleep 메소드
	//생명+1;
	void sleep() {
		life++;
	}
	
	//walk 메소드, 매개변수(퀴즈배열)
	QuizReview walk(QuizReview[] quizes) {
		//생명-1;
		life--;
		
		//랜덤 메소드 임포트
		Random r = new Random();
		//일반문제를 담아줄 변수
		QuizReview quiz = null;
		//확률을 위한 10칸 배열 선언 
		int[] percent = new int[10];
		//10%확률
		int rating = 10;
		
		//원하는 확률/10만큼 반복
		//배열에 1 대입
		for (int i = 0; i < rating / 10; i++) {
			percent[i] = 1;
		}
		
		//랜덤수를 뽑아서 1이 나온다면, 10% 확률이라면
		//퀴즈의 길이만큼 반복
		//잭팟퀴즈니? 
		//true > 퀴즈 리턴
		if(percent[r.nextInt(percent.length)] == 1) {
			for (int i = 0; i < quizes.length; i++) {
				if(quizes[i].jackpot) {
					return quizes[i];
				}
			}
		}
		
		
		//10%가 아니라면 일반 문제 리턴
		//언제 잭팟이 안나올지 몰라, 몇번 반복돌지 몰라, while문
		//랜덤한 문제 뽑아서 변수에 대입
		//잭팟이 false이면 조건문이 true니까 반복문 탈출(break), 일반문제 리턴
		//잭팟이면 true니까 false가 되면서 if문 안에 안 들어가고 다음 반복
		while(true) {
			quiz = quizes[r.nextInt(quizes.length)];
			if(!quiz.jackpot) {
				break;
			}
		}
		return quiz;
		
	}
}
