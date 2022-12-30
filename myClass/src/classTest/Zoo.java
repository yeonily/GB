package classTest;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		//클래스 배열
//		Animal[] animals = new Animal[3];
		//값까지 아는 상태일 때는 중괄호를 열어서 값을 넣어주어 생성자 만들기
		//동물 클래스 배열, 동물 캐릭터 초기화
		Animal[] animals = {
				new Animal("코끼리", 120, "풀", 2, 8), // 10기준으로 밸런스 맞추기
				new Animal("토끼", 3, "당근", 8, 2),
				new Animal("타조", 5, "지렁이", 5, 5)
		};
				
		//퀴즈 클래스 배열, 퀴즈문제 초기화
		Quiz[] quizes = {
				new Quiz("Q. 바나나를 엄마가 사왔어요!\n형이 3개 먹고 내가 5개를 먹었더니 한 개가 남았어요.\n엄마가 사온 바나나는 총 몇 개였을까요?", "9", 10),
	            new Quiz("Q. 다음 어린이 중 누가 착한 행동을 했을까요?\n1. 요구르트를 훔친 철수\n2. 친구를 바닥에 눕힌 영희\n3. 늦게왔으면서 수업에 딴짓까지 해버리는 동석\n4. 엄마 어깨를 안마해주는 유리", "4", 2),
	            new Quiz("Q. 횡단보도를 건널 수 있는 방법을 고르세요.\n1. 빨간불일 때 건넌다.\n2. 뛰어간다\n3. 손을 들고 초록불에 건넌다.\n4. 핸드폰을 보면서 건넌다.", "3", 5),
	            new Quiz("Q. 다음 중 프로그래밍 언어가 아닌 것은?\n1.C언어\n2.JAVA\n3.파이썬\n4.망둥어", "4", 3000, true)
		};
		
		//입력 메소드 임포트
		Scanner sc = new Scanner(System.in);
		
		//제목 변수 선언, 캐릭터 선택 메뉴 변수 선언, 액션 메뉴 변수 선언
		String title = "★ 모여라 셀럽 동물 ★";
		String menuMessage = "안녕하세요 어린이 여러분!\n동물친구를 선택해보세요!\n1.코끼리\n2.토끼\n3.타조\n4.나가기";
		String actionMessage = "1.먹기\n2.잠자기\n3.산책하기\n4.내 정보\n5.작별인사하기";
		//캐릭터번호 변수, 액션번호 변수 선언
		int characterNumber = 0, actionChoice = 0;
		
		//반복횟수를 알 수 없는 반복문
		while(true) {
			//제목 출력
			System.out.println(title);
			//동물 선택 메뉴 출력
			System.out.println(menuMessage);//캐릭터 선택
			//입력 값을 캐릭터번호 변수에 대입
			characterNumber = sc.nextInt();
			//나가기를 누르면 반복문 탈출
			if(characterNumber == 4) {break;}
			
			//반복횟수를 알 수 없는 반복문
			while(true) {
				//액션 메뉴 출력
				System.out.println(actionMessage); //액션 작업
				//입력 값을 액션 번호에 대입 
				actionChoice = sc.nextInt(); //acitonChoice-1 : 인덱스로 사용
				//작별인사하기를 누르면 반복문 탈출
				if(actionChoice == 5) {break;}
				
				//동물 클래스 배열에서 (배열은 0부터 시작)'캐릭터번호-1'를 인덱스로 사용해서 animal 변수에 대입해서 사용
				Animal animal = animals[characterNumber - 1]; //인덱스번호로 배열 값 불러오기
				
				//액션 번호(값)에 따라 액션 실행 
				switch(actionChoice) {
				//1번 먹기
				case 1://먹기
					//동물의 먹이개수가 0보다 크다면
					if(animal.feedCount > 0) {
						//eat 메소드 실행
						animal.eat();
						//냠냠 출력
						System.out.println("냠냠");
						//동물의 체력 출력
						System.out.println(animal.name +"의 체력 : "+animal.life);
						//동물의 먹이개수 출력
						System.out.println(animal.name +"의 먹이 개수 : "+animal.feedCount+"개");
						//조건문 탈출
						break;
					}
					//조건식이 false일 때, 동물의 먹이가 부족해요, 퀴즈를 풀어서 먹이를 획득하세요 출력
					System.out.println(animal.feed+"이(가) 부족해요ㅠㅠ\n퀴즈를 풀어서 먹이를 획득하세요!");
					//조건문 탈출
					break;
				//2번 잠자기
				case 2://잠자기
					//동물이 자는 중 출력
					System.out.print(animal.name+"이(가) 자는 중");
					//0부터 3까지 반복문
					//Thread.sleep(밀리초) 1초마다 멈추기
					for (int i = 0; i < 3; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//점 출력
						System.out.print(".");
					}
					//sleep 메소드 실행
					animal.sleep();
					//줄바꿈
					System.out.println();
					//조건문 탈출
					break;
				//3번 산책하기
				case 3://산책하기
					//생명이 1초과일 때 가능
					if(animal.life > 1) {
						//walk메소드 실행해서 리턴값을 퀴즈 타입의 퀴즈 객체에 대입
						Quiz quiz = animal.walk(quizes); //값을 봐야함, 리턴값이 퀴즈타입, 랜덤한 퀴즈가 리턴되는 것임
						//잭팟 퀴즈라면
						if(quiz.jackpot) {
							//잭팟 문제 표시
							System.out.println("★★★잭팟 문제★★★");
						}
						
						//퀴즈 문제 출력
						System.out.println(quiz.question);
						//퀴즈 답이 사용자가 입력한 값이랑 같으면
						if(quiz.answer.equals(sc.next())) {
							//정답 출력
							System.out.println("정답!!!");
							//먹이개수가 동물의 기존 먹이개수와 누적됨
							animal.feedCount += quiz.feedCount;
							//사용자가 몇 개 먹이 개수 획득했는지 알려주는 문장 출력
							System.out.println(animal.feed+" "+quiz.feedCount+"개 획득!");
							//동물의 현재 먹이 개수 출력
							System.out.println(animal.feed+"개수 : "+animal.feedCount+"개");
							//조건문 탈출
							break;
						}
						//문제 틀렸을 때, 오답 출력
						System.out.println("오답ㅜㅜ");
						//생명 1 깎임
						animal.life--;
						//체력이 0인 경우 재우기
						if(animal.life == 0) {
							//동물이 자는 중 출력
							System.out.print(animal.name+"이(가) 자는 중");
							//0부터 3까지 반복 > 3번 반복
							for (int i = 0; i < 3; i++) {
								//1초마다 멈추기
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								//점 출력
								System.out.println(".");
							}
							//sleep 메소드 실행
							animal.sleep();
							//줄바꿈
							System.out.println();
						}
						//조건문 탈출
						break;
					}
					//체력이 1초과가 아닐 때, 체력이 부족해요 잠을 자고 오세요 출력
					System.out.println("체력이 부족해요 ㅜㅜ 잠을 자고 오세요!");
					//조건문 탈출
					break;
				//4번 동물정보
				case 4:
					//동물 이름 출력
					System.out.println("이름 : "+animal.name);
					//동물 나이 출력
					System.out.println("나이 : "+animal.age+"살");
					//동물 먹이 출력
					System.out.println("먹이 : "+animal.feed);
					//동물 먹이 개수 출력
					System.out.println("먹이 개수 : "+animal.feedCount);
					//동물 체력 출력
					System.out.println("체력 : "+animal.life);
					//조건문 탈출
					break;
				//디폴트
				default:
					//다시 입력 출력
					System.out.println("다시 입력");
					//조건문 탈출
					break;
				}
				
			}
		}
	}
}
