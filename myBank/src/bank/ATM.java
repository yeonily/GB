package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		/*
		 * 1.계좌개설 
		 * - 13자리 랜덤 계좌번호
		 * - 기존 고객의 계좌번호와 중복이 없는 번호로 개설해야 한다.
		 * - 핸드폰 번호는 숫자만 입력하도록 하고, 문자가 포함되면 안 되고 0~9사이의 정수여야 한다.
		 * - 비밀번호 4자리로만 입력하도록 한다.
		 * 
		 * 2.입금하기 
		 * - 계좌를 개설한 은행에서만 입금 가능
		 *
		 * 3.출금하기 
		 * 4.잔액조회 
		 * 5.계좌번호 찾기 
		 * 6.나가기
		 */
		
		//은행 선택
		String msg = "1.신한은행\n2.국민은행\n3.기업은행\n4.나가기";
		//메뉴 변수 선언
		String menu = "1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.계좌번호 찾기\n6.은행 선택 메뉴로 이동";
		//이름, 계좌, 폰번호, 비밀번호 변수 선언
		String name = null, account = "", phoneNumber = null, password = "";
		//돈, 은행번호, 선택값 담을 변수 선언
		int money = 0, bankNumber = 0, choice = 0;
		//은행 종류 배열로 선언
		String[] bankName = {"신한은행", "국민은행", "기업은행"};
		//규칙성이 없는 값에 규칙을 부여하자 >> 배열
		
		//입력메소드
		Scanner sc = new Scanner(System.in);
		//랜덤메소드
		Random r = new Random();
		//bank 객체 선언
		Bank bank = null; // 로그인된 계좌를 넣기
		
		//무한반복
		while(true) {
			//시작할 때마다 초기화
			account = "";
			//은행 출력
			System.out.println(msg);
			//입력값 은행 번호에 대입
			bankNumber = sc.nextInt();
			//4번 입력 시 반복 탈출
			if(bankNumber == 4) {break;}
			
			//무한반복
			while(true) {
				//메뉴 출력
				System.out.println(menu);
				//입력값 선택 변수에 대입
				choice = sc.nextInt();
				//6번 입력 시 반복 탈출
				if(choice == 6) {break;}
				
				//입력값에 따른 결과 실행
				switch(choice) {
				case 1: //계좌개설
					//은행배열에 각 은행 생성자 넣기, 업캐스팅
					Bank[] arBank = {new Shinhan(), new Kookmin(), new Kiup()};
					
					//무한반복
					while(true) {
						//0~12까지 반복
					for (int i = 0; i < 12; i++) {//12자리
						//계좌에 랜덤한 숫자 넣기
					account += r.nextInt(10); //0~9까지 랜덤한 수
					}
					
//					쓸데없이 객체화를 해야 할 때에는 빨리 static으로 전환한다!
//					Bank bank = new Bank();
//					bank.checkAccount();
					//계좌 중복검사했을 때, 이전에 계좌가 개설되지 않았다면 반복문 탈출
					if(Bank.checkAccount(account) == null) {break;}//중복이 없을 때까지 반복 후
					}
					
					//은행번호를 맨 앞에 1자리 추가
					account = bankNumber - 1 + account;
					//bankNumber - 1 : 인덱스 번호와 맞추기 위해서 
					
					//초기화, 계좌번호 설정
					arBank[bankNumber - 1].setAccount(account);
							//인덱스 번호는 입력값보다 1작음
					
					//예금주 입력
					System.out.print("예금주 : ");
					//입력값을 이름에 대입
					name = sc.next();
					
					//초기화, 이름 설정
					arBank[bankNumber - 1].setName(name);
					
					//무한반복
					while(true) {
						//폰번호 입력메세지 출력
						System.out.print("핸드폰 번호['-' 제외] : ");
						//입력값을 폰 번호 변수에 대입
						phoneNumber = sc.next();
						
	//					숫자만 있는지
						int i = 0;
						//폰번호 길이만큼 반복
						for (i = 0; i < phoneNumber.length(); i++) {
							//폰번호를 문자로 추출해서 변수에 담기
							char c = phoneNumber.charAt(i);
							//변수가 숫자라면
							if(c < 48 || c > 57) {
								//반복문 탈출
								break;
							}
						}
						//폰번호 길이가 아니라면
						if(i != phoneNumber.length()) {
							//숫자만 입력해주세요
							System.out.println("숫자만 입력해주세요");
							//다음 반복으로
							continue;
						}
						
	//					입력한 문자열 값이 11자리인지
						//폰번호 길이가 11자리가 아니라면
						if(phoneNumber.length() != 11) {
							//핸드폰 번호를 입력해주세요
							System.out.println("핸드폰 번호를 입력해주세요");
							//다음 반복으로
							continue;
						}
	
	//					핸드폰 번호가 중복되었는지
						if(Bank.checkPhoneNumber(phoneNumber) != null) {//중복이 있다면
							System.out.println("중복된 핸드폰 번호입니다");
							continue;
						}
						
	//					010으로 시작하는 지
						if(!phoneNumber.startsWith("010")) {
							System.out.println("010부터 시작해주세요");
							continue;
						}
						//폰번호 while문 탈출
						break;
					}
					
					
					//초기화, 폰번호 설정
					arBank[bankNumber - 1].setPhoneNumber(phoneNumber);
					
//					do {
//						System.out.print("비밀번호 : ");
//						password = sc.next();
//					} while(password.length() != 4); 

					//비밀번호에 초기값
					password = "";
					//비밀번호 길이가 4가 아니라면
					while(password.length() != 4) {
						//비밀번호 입력메세지 출력
						System.out.print("비밀번호 : ");
						//입력값 비밀번호에 담기
						password = sc.next();
					}
					
					//초기화, 비밀번호 설정
					arBank[bankNumber - 1].setPassword(password);
					
								//은행을 먼저 고르고 //가입회원수 칸에						//은행배열 안에 넣기(은행 배열안에는 각 은행의 생성자)
					Bank.arrBank[bankNumber - 1][Bank.arCount[bankNumber - 1]] = arBank[bankNumber - 1];
					//가입회원 수 +1
					Bank.arCount[bankNumber - 1]++;
					
					//안내멘트 출력
					System.out.println("축하합니다. 감사합니다. 사랑합니다.");
					System.out.println("더 노력하는 "+bankName[bankNumber - 1]+"이 되겠습니다!");
					System.out.println("고객님의 계좌번호는 "+ account +" 입니다.");
					System.out.println("분실 시 계좌번호 찾기 서비스를 이용해주세요~!");
					//반복문 탈출
					break;
				case 2: //입금하기
					//계좌번호 입력메세지 출력
					System.out.print("계좌번호 : ");
					//입력값을 계좌에 대입
					account = sc.next();
					
					//계좌에서 첫번째 번호가 은행번호와 다르다면
					if(account.charAt(0) - 48 != bankNumber -1 ) {
						//계좌 개설한 은행에서만 서비스 가능
						System.out.println("계좌를 개설한 은행에서만 입금 서비스를 이용할 수 있습니다");
						//반복문 탈출
						break;
					}
					//비밀번호 입력메세지 출력
					System.out.print("비밀번호 : ");
					//입력값을 비밀번호에 대입
					password = sc.next();
					//로그인 메소드 사용해서 그 값은 뱅크에 대입
					bank = Bank.login(account, password);
					
					//로그인 성공 시
					if(bank != null) {
						//입금액 입력 메세지 출력
						System.out.print("입금액 : ");
						//입력 값을 돈 변수에 대입
						money = sc.nextInt();
						//만약 돈이 0보다 작으면
						if(money < 0) {
							//금액이 잘못 입력되었습니다
							System.out.println("금액이 잘못 입력되었습니다");
							//반복문 탈출
							break;
						}
						//입금 메소드 사용
						bank.deposit(money);
						//반복문 탈출
						break;
					}
					//로그인 실패 시, 계좌번호나 비밀번호를 다시 확인해주세요
					System.out.println("계좌번호나 비밀번호를 다시 확인해주세요");
					//반복문 탈출
					break;
				case 3: //출금하기
					//계좌번호 입력메시지
					System.out.print("계좌번호 : ");
					//계좌번호 대입
					account = sc.next();
					//비밀번호 입력메세지
					System.out.print("비밀번호 : ");
					
					//로그인 메소드 사용해서 그 값은 뱅크에 대입
					bank = Bank.login(account, password);
					//로그인 성공 시 
					if(bank != null) {
						//출금액 입력
						System.out.print("출금액 : ");
						//돈에 대입
						money = sc.nextInt();
						//돈이 0보다 작으면
						if(money < 0) {
							//금액이 잘못 입력되었습니다
							System.out.println("금액이 잘못 입력되었습니다");
							//반복문 탈출
							break;
						}
						
//						if(bank instanceof Kookmin) {money *= 1.5;}
						//국민은행의 경우에는 수수료를 더해주어야 함 > 삼항연산자로 표현
						if(bank.showBalance() - (bank instanceof Kookmin ? money * 1.5 : money) < 0) {
							//금액이 부족합니다
							System.out.println("금액이 부족합니다");
							//반복문 탈출
							break;
						}
						//출금메소드 실행
						bank.withdraw(money);
						//반복문 탈출
						break;
					}
					//로그인 실패 시, 계좌번호나 비밀번호를 다시 확인해주세요
					System.out.println("계좌번호나 비밀번호를 다시 확인해주세요");
					//반복문 탈출
					break;
				case 4: //잔액조회
					//계좌번호 입력
					System.out.print("계좌번호 : ");
					//계좌에 대입
					account = sc.next();
					//비밀번호 입력
					System.out.print("비밀번호 : ");
					password = sc.next();
					
					//로그인 메소드 사용
					bank = Bank.login(account, password);
					//로그인 성공
					if(bank != null) {
						//현재 잔액 출력
						System.out.println("현재 잔액 : "+bank.showBalance()+"원");
					}
					//반복문 탈출
					break;
				case 5: //계좌번호 찾기
					//번호 입력
					System.out.print("핸드폰 번호 : ");
					//폰번호에 대입
					phoneNumber = sc.next();
					
					//핸드폰 번호 검사 메소드 사용
					bank = Bank.checkPhoneNumber(phoneNumber);
					
					//로그인 성공 시
					if(bank != null) {
						//비밀번호 입력
						System.out.print("비밀번호 : ");
						//비밀번호 대입
						password = sc.next();
						//원래 비밀번호와 입력한 비밀번호가 같다면
						if(bank.getPassword().equals(password)) {
							//무한반복
							while(true) {
								//계좌에 초기값 넣기
								account = "";
								//계좌에 랜덤한 숫자 넣어주기
								for (int i = 0; i < 13; i++) {
									account += r.nextInt(10);
								}
								//계좌번호 중복검사 메소드 사용 후 null이라면 탈출>>중복된 계좌번호가 없음
								if(Bank.checkAccount(account) == null) {break;}
							}
							//계좌번호 새롭게 설정
							bank.setAccount(account);
							
							//안내멘트 출력
							System.out.println("고객님의 계좌번호를 새롭게 발급해드렸습니다");
							System.out.println("고객님의 새로운 계좌번호는 "+account+"입니다.");
							System.out.println("분실 시, 계좌번호 찾기 서비스를 다시 이용해주세요");
						}
					}
					//반복문 탈출
					break;
				default:
					//다시입력해주세요
					System.out.println("다시 입력해주세요");
					break;
				}
				
			}
			
		}
	}

}
