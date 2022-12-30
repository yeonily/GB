package myBank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	private String name;
	private String accountNum;
	private String phoneNum;
	private String password;
	private int account;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	void deposit(int money) {
		account += money;
	}
	
	void withdraw(int money) {
		account -= money;
	}
	
	void checkAccount() {
		System.out.println(account);
	}
		
	void doubleCheckAccountNum() {
		
	}
	
	void login() {
		
	}
	
	void doubleCheckPhoneNum() {
		
	}
	
	
	public static void main(String[] args) {
		String[][] customers = new String[3][100]; //은행이 3개, 회원 100명
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Bank bank = new Bank();
		
		String menuMsg = "1.계좌개설\n2.입금\n3.출금\n4.잔액조회\n5.계좌번호찾기\n6.나가기";
		String depositMsg = "입금하실 금액을 입력해주세요";
		String withdrawMsg = "출금하실 금액을 입력해주세요";
		int choice = 0, money = 0;
		
		while(true) {
			System.out.println(menuMsg);
			choice = sc.nextInt();
			if(choice == 6) {break;}
			
			switch(choice) {
			case 1://계좌개설
				break;
			case 2://입금
				System.out.println(depositMsg);
				money = sc.nextInt();
				bank.deposit(money);
				break;
			case 3://출금
				System.out.println(withdrawMsg);
				money = sc.nextInt();
				bank.withdraw(money);
				break;
			case 4://잔액조회
				bank.checkAccount();
				break;
			case 5://계좌번호찾기(새로운계좌발급, 핸드폰번호로 찾기)
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}
	
}

