package aug04;

import java.util.Scanner;

public class ZooReview {
	public static void main(String[] args) {
		//동물 클래스 배열, 동물 캐릭터 초기화
//		AnimalReview animal = new AnimalReview(null, 0, null, 0, 0);
//		int[] animalss = new int[6];
//		int[] animalsss = {1, 2, 3, 4, 3};
		AnimalReview[] animals = {
				new AnimalReview("뽀삐", 1, "뼈다귀", 3, 7),
				new AnimalReview("나비", 2, "생선", 6, 4),
				new AnimalReview("꼬꼬", 3, "모이", 8, 2)
		};
		
		
		//퀴즈 클래스 배열, 퀴즈문제 초기화
		QuizReview[] quizes = {
				new QuizReview("Q1", "1", 1),
				new QuizReview("Q2", "2", 2),
				new QuizReview("Q3", "3", 3),
				new QuizReview("Q4", "4", 4),
				new QuizReview("Q5", "5", 100, true)
		};
		
		//입력 메소드 임포트
		Scanner sc = new Scanner(System.in); 
		
		
		//제목 변수 선언, 캐릭터 선택 메뉴 변수 선언, 액션 메뉴 변수 선언
		String title = "★동물농장★";
		String menuMsg = "캐릭터 선택하기\n1.뽀삐\n2.나비\n3.꼬꼬\n4.종료하기";
		String actionMsg = "1.먹기\n2.자기\n3.산책하기\n4.내 정보\n5.작별인사하기";
		//캐릭터번호 변수, 액션번호 변수 선언
		int animalNumber = 0, actionChoice = 0;
		boolean error = false;
		
		//반복횟수를 알 수 없는 반복문
		//while문에서 오타났을 경우 막아주는 법?????
		while(true) {
		//제목 출력
		//동물 선택 메뉴 출력
		//입력 값을 캐릭터번호 변수에 대입
		//나가기를 누르면 반복문 탈출
			System.out.println(title);
			System.out.println(menuMsg);
			animalNumber = sc.nextInt();
			if(animalNumber == 4) {break;}
//			switch(animalNumber) {
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//				break;
//			default:
//				System.out.println("다시 입력해주세요");
//				break;
//			}
//			if(error) {break;}
		
		//반복횟수를 알 수 없는 반복문
			while(true) {
		//액션 메뉴 출력
		//입력 값을 액션 번호에 대입 
		//작별인사하기를 누르면 반복문 탈출
				System.out.println(actionMsg);
				actionChoice = sc.nextInt();
				if(actionChoice == 5) {break;}
		
		//동물 클래스 배열에서 (배열은 0부터 시작)'캐릭터번호-1'를 인덱스로 사용해서 animal 변수에 대입해서 사용
				AnimalReview animal = animals[animalNumber-1];
				
		//액션 번호(값)에 따라 액션 실행 
				switch(actionChoice) {
				
		//1번 먹기
		//동물의 먹이개수가 0보다 크다면
		//eat 메소드 실행
		//냠냠 출력
		//동물의 체력 출력
		//동물의 먹이개수 출력
		//조건문 탈출
		
		//조건식이 false일 때, 동물의 먹이가 부족해요, 퀴즈를 풀어서 먹이를 획득하세요 출력
		//조건문 탈출
				case 1:
					if(animal.feedCount > 0) {
						animal.eat();
						System.out.println("냠냠");
						System.out.println(animal.name+"의 체력 : "+animal.life);
						System.out.println(animal.name+"의 남은 먹이 개수 : "+animal.feedCount);
						break;
					}
					System.out.println("먹이가 부족해요\n퀴즈를 풀어서 먹이를 획득하세요");
					break;
		
		//2번 잠자기
		//동물이 자는 중 출력
		//0부터 3까지 반복문
		//Thread.sleep(밀리초) 1초마다 멈추기
		//점 출력
		//sleep 메소드 실행
		//줄바꿈
		//조건문 탈출
				case 2:
					System.out.print(animal.name+"이(가) 자는 중 ");
					for (int i = 0; i < 3; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.print("zZ ");
					}
					animal.sleep();
					System.out.println();
					break;
		
		//3번 산책하기
		//생명이 1초과일 때 가능
		//walk메소드 실행해서 리턴값을 퀴즈 타입의 퀴즈 객체에 대입
		//잭팟 퀴즈라면
		//잭팟 문제 표시
		
		//퀴즈 문제 출력
		//퀴즈 답이 사용자가 입력한 값이랑 같으면
		//정답 출력
		//먹이개수가 동물의 기존 먹이개수와 누적됨
		//사용자가 몇 개 먹이 개수 획득했는지 알려주는 문장 출력
		//동물의 현재 먹이 개수 출력
		//조건문 탈출
		
		//문제 틀렸을 때, 오답 출력
		//생명 1 깎임
		//체력이 0인 경우 재우기
		//동물이 자는 중 출력
		//0부터 3까지 반복 > 3번 반복
		//1초마다 멈추기
		//점 출력
		//sleep 메소드 실행
		//줄바꿈
		//조건문 탈출
		
		//체력이 1초과가 아닐 때, 체력이 부족해요 잠을 자고 오세요 출력
		//조건문 탈출
				case 3:
					if(animal.life > 1) {
						QuizReview quiz = animal.walk(quizes);
						if(quiz.jackpot) {
							System.out.println("★☆★☆잭팟문제★☆★☆");
						}
						
						System.out.println(quiz.question);
						if(quiz.answer.equals(sc.next())) {
							System.out.println("정답!!!!!");
							animal.feedCount += quiz.feedCount;
							System.out.println(animal.feed+" "+quiz.feedCount+"개 획득");
							System.out.println(animal.name+"의 현재 "+animal.feed+" 개수 : "+animal.feedCount+"개");
							break;
						}
						
						//break;하기 때문에 else 필요 없음
						System.out.println("땡! 틀렸습니다");
						animal.life--;
						if(animal.life == 0) {
							System.out.print(animal.name+"이(가) 자는 중 ");
							for (int i = 0; i < 3; i++) {
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.print("zZ ");
							}
							animal.sleep();
							System.out.println();
						}
						break;
					}
					System.out.println("체력 부족, 잠을 더 자고 오세요~");
					break;
		
		//4번 동물정보
		//동물 이름 출력
		//동물 나이 출력
		//동물 먹이 출력
		//동물 먹이 개수 출력
		//동물 체력 출력
		//조건문 탈출
				case 4:
					System.out.println("★"+animal.name+"의 정보★");
					System.out.println("이름 : "+animal.name);
					System.out.println("나이 : "+animal.age);
					System.out.println("먹이 : "+animal.feed);
					System.out.println("먹이 개수 : "+animal.feedCount);
					System.out.println("체력 : "+animal.life);
					break;
		
		
		//디폴트
		//다시 입력 출력
		//조건문 탈출
				default:
					error = true;
					System.out.println("다시 입력해주세요");
					break;
				}
			}
			
		}
	}

}
