package classTest;

import java.util.Random;

//class Animals{
//	String name;
//	int age;
//	String food;
//	int foodNum;
//	int life;
//	
//	public Animals () {}
//	
//	public Animals(String rabbit, int age, String carrot, int carrotNum, int life) {
//		super();
//		this.name = rabbit;
//		this.age = age;
//		this.food = carrot;
//		this.foodNum = carrotNum;
//		this.life = life;
//	}
//	
//	void eat() {
//		if(foodNum != 0) {
//			foodNum--;
//			life++;
//		}
//	}
//	
//	void sleep() {
//		
//	}
//	
////	외부에서 모든 문제를 전달받는다.
////	전달받은 문제 중 랜덤한 한 개의 문제만 리턴한다.
//	void walk() {
//		life--;
//		
//	}
//	
//}

public class Animal {
	
	//변수 선언(이름, 나이, 먹이, 먹이개수, 생명)
	String name;
	int age;
	String feed;
	int feedCount;
	int life;
	
	//오버로딩
	//기본생성자 선언
	public Animal() {;}
	
	//생성자, 초기화생성자 선언
	public Animal(String name, int age, String feed, int feedCount, int life) {
		this.name = name;
		this.age = age;
		this.feed = feed;
		this.feedCount = feedCount;
		this.life = life;
	}

	//eat 메소드
	void eat() {
		//먹이가 있는지 없는지는 메인에서 검사
		//먹는 기능만 하면 됨
		//먹이개수-1, 생명+1;
		feedCount--;
		life++;
	}

	//sleep 메소드
	void sleep() {
		//생명+1;
		life++;
	}
	
//외부에서 모든 문제를 전달받는다.
//전달받은 문제 중 랜덤한 한 개의 문제만 리턴한다.
	//walk 메소드, 매개변수(퀴즈배열)
	Quiz walk(Quiz[] quizes) {//여러 개 문제(배열) 중에서 랜덤한 하나의 퀴즈를 리턴
		//생명-1;
		life--;
		
		//랜덤 메소드 임포트
		Random r = new Random();
		//랜덤은 범위(3)를 전달하면 그 전까지의 숫자가 나옴(0-2)
//		return quizes[r.nextInt(quizes.length)]; //퀴즈의 길이-1만큼 나오게 하기 
		Quiz quiz = null; //일반문제를 담아줄 변수
		int[] percent = new int[10]; //10칸 배열
		int rating = 10; //10%확률
		
//		잭팟 문제, 확률은 10% >> 문제의 종류가 추가로 생김
		
//		확률이 10단위라면 10칸 배열을, 1단위라면 100칸 배열을 선언한다.
//		int배열로 선언한 뒤 사용자가 원하는 확률만큼 1로 값을 바꿔준다.
		
//		예) 30% 확률이라면 10칸 배열에 3개의 값만 1로 바꿔준다.
//		따라서 원하는 확률 / 10을 하여 반복횟수를 결정해주고,
//		그 만큼 1이 들어가게 된다.
		
//		위의 배열이 완성되었으면 랜덤한 인덱스 번호로 값에 접근하여
//		1이 나왔을 때에는 원하는 확률로 성공한 것이고,
//		0이 나왔을 때에는 실패한 것이다.
		
		//원하는 확률/10만큼 반복
		for (int i = 0; i < rating/10; i++) { 
			//배열에 1 대입
			percent[i] = 1; 
		}
		
		//랜덤수를 뽑아서 1이 나온다면, 10% 확률이라면
		if(percent[r.nextInt(percent.length)] == 1) {
			//퀴즈의 길이만큼 반복
			for (int i = 0; i < quizes.length; i++) {
				//잭팟퀴즈니? 
				if(quizes[i].jackpot) {
					//true > 퀴즈 리턴
					return quizes[i];
				}
			}
		}
		
		//10%가 아니라면 일반 문제 리턴
		//언제 잭팟이 안나올지 몰라, 몇번 반복돌지 몰라, while문
		while(true) {
			quiz = quizes[r.nextInt(quizes.length)];//랜덤한 문제 뽑아서 변수에 대입
			//잭팟이 false이면 조건문이 true니까 반복문 탈출(break), 일반문제 리턴
			//잭팟이면 true니까 false가 되면서 if문 안에 안 들어가고 다음 반복
			if(!quiz.jackpot) {break;}
		}
		
		return quiz;
	}

}
