package BankReview;

import java.util.Random;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		String msg = "1.기업은행\n2.산업은행\n3.우리은행\n4.나가기";
		String menu = "1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.계좌번호 찾기\n6.은행 선택 메뉴로 이동";
		String name = null, account = "", phoneNumber = null, password = "";
		int money = 0, bankNumber = 0, choice = 0;
		String[] bankName = {"기업은행", "산업은행", "우리은행"};
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Bank bank = null;
		
		while(true) {
			account = "";
			System.out.println(msg);
			bankNumber = sc.nextInt();
			if(bankNumber == 4) {break;}
			
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				if(choice == 6) {break;}
				
				switch(choice) {
				case 1://계좌개설
					Bank[] arBank = {new Kiup(), new Sanup(), new Woori()};
					
					while(true) {
						for (int i = 0; i < 12; i++) {
							account += r.nextInt(10);
							//1~10까지 랜덤한 수가 12개 반복해서 12자리 계좌 생김
						}
						if(Bank.checkAccount(account) == null) {break;}
					}
					
					account = bankNumber - 1 + account;
					//맨 앞에 은행번호를 추가, 인덱스 번호와 맞추기 위해서 -1
					arBank[bankNumber - 1].setAccount(account);
					//계좌번호 개설 완료
					
					System.out.print("예금주 : ");
					name = sc.next();
					arBank[bankNumber - 1].setName(name);
					
					while(true) {
						System.out.print("핸드폰 번호 : ");
						phoneNumber = sc.next();
						
						int i = 0;
						for (i = 0; i < phoneNumber.length(); i++) {
							char c = phoneNumber.charAt(i);
							if(c < 48 || c > 57) {
								break;
							}
						}
						
						if(Bank.checkAccount(phoneNumber) != null) {
							System.out.println("중복된 핸드폰 번호입니다");
							continue;
						}
						
						if(!phoneNumber.startsWith("010")) {
							System.out.println("010부터 시작해주세요");
							continue;
						}
						break;
					}
					arBank[bankNumber - 1].setPhoneNum(phoneNumber);
					
					password = "";
					while(password.length() != 4) {
						System.out.print("비밀번호 : ");
						password = sc.next();
					}
					arBank[bankNumber - 1].setPassword(password);
					
					//DB에 넣는 작업
					Bank.bankDB[bankNumber - 1][Bank.bankLength[bankNumber - 1]] = arBank[bankNumber - 1];
					Bank.bankLength[bankNumber - 1]++;
					
					System.out.println("계좌 개설 완료");
					System.out.println(bankName[bankNumber -1] + "의 계좌번호 : " + account);
					
					break;
				case 2://입금하기
					System.out.print("계좌번호 : ");
					account = sc.next();
					
					if(account.charAt(0) - 48 != bankNumber - 1 ) {
						System.out.println("계좌를 개설한 은행에서만 입금 서비스를 이용할 수 있습니다.");
						break;
					}
					
					System.out.print("비밀번호 :");
					password = sc.next();
					bank = Bank.login(account, password);
					
					if(bank != null) {
						System.out.print("입금액 : ");
						money = sc.nextInt();
						if(money < 0) {
							System.out.println("금액이 잘못 입력되었습니다");
							break;
						}
						bank.deposit(money);
						break;
					}
					System.out.println("계좌번호나 비밀번호를 다시 확인해주세요");
							
					break;
				case 3://출금하기
					System.out.print("계좌번호 : ");
					account = sc.next();
					
					System.out.print("비밀번호 :");
					password = sc.next();
					bank = Bank.login(account, password);
					
					if(bank != null) {
					System.out.print("출금액 : ");
					money = sc.nextInt();
					if(money < 0) {
						System.out.println("금액이 잘못 입력되었습니다");
						break;
						}
					if(bank.walletSearch() - money < 0) {
						System.out.println("잔액이 부족합니다");
						break;
						}
						
					bank.withdraw(money);
					break;
				}
				System.out.println("계좌번호나 비밀번호를 다시 확인해주세요");
					break;
				case 4://잔액조회
					System.out.print("계좌번호 : ");
					account = sc.next();
					
					System.out.print("비밀번호 :");
					password = sc.next();
					bank = Bank.login(account, password);
					
					if(bank != null) {
						System.out.println("현재 잔액 : "+bank.walletSearch()+"원");
					}
					break;
				case 5://계좌번호 찾기
					System.out.print("핸드폰 번호 : ");
					phoneNumber = sc.next();
					
					bank = Bank.phoneNumCheck(phoneNumber);
					
					if(bank != null) {
						System.out.print("비밀번호 : ");
						password = sc.next();
						if(bank.getPassword().equals(password)) {
							while(true) {
								account = "";
								for (int i = 0; i < 12; i++) {
									account += r.nextInt(10);
								}
								if(Bank.checkAccount(account) == null) {break;}
								
								account = bankNumber - 1 + account;
							}
							bank.setAccount(account);
							
							System.out.println("고객님의 계좌번호를 새롭게 발급해드렸습니다");
							System.out.println("고객님의 새로운 계좌번호는 "+account+"입니다.");
							System.out.println("분실 시, 계좌번호 찾기 서비스를 다시 이용해주세요");
						}
					}
					break;
				default:
					System.out.println("다시 입력해주세요");
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
