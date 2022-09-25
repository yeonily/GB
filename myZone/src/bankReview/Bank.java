package BankReview;

public class Bank {
	//은행은 3개를 선언한다.
	//모든 은행 고객을 관리하는 DB(static)를 2차원 배열로 선언.
	public static Bank[][] bankDB = new Bank[3][100];
	public static int[] bankLength = new int[3];
	
	//은행(부모)
	//예금주
	//계좌번호(로그인 시 사용될 아이디)
	//핸드폰번호
	//비밀번호
	//통장잔고
	
	private String name;
	private String account;
	private String phoneNum;
	private String password;
	private int money;
	
	public Bank() {;}
	
	public Bank(String name, String account, String phoneNum, String password, int money) {
		this.name = name;
		this.account = account;
		this.phoneNum = phoneNum;
		this.password = password;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	//모든 은행은 출금, 입금, 잔액조회, 계좌개설, 계좌번호 중복검사(static), 로그인(static), 핸드폰번호 중복검사(static) 서비스가 있다.
	//화면쪽 메뉴는 계좌개설, 입금하기, 출금하기, 잔액조회, 
	//계좌번호 찾기(새로운 계좌 발급, 핸드폰번호로 찾기), 나가기로 구성되어 있다.
	
	//입금
	public void deposit(int money) {
		this.money += money;
	}
	
	//출금
	public void withdraw(int money) {
		this.money -= money;
	}
	
	//잔액조회
	public int walletSearch() {
		return money;
	}
	

//  계좌번호 중복검사
	public static Bank checkAccount(String account) {
	   //메소드 선언 매개변수로 계좌번호를 입력받기
	   //모든 은행의 계좌번호를 확인해야 하니까 static
		//은행 객체 선언
		//행의 길이만큼 반복(은행 개수)
		//j를 따로 사용해야 하기 때문에 밖에서 선언
		//각 은행별 가입된 회원 수 만큼 반복
		//사용자의 계좌가 입력한 계좌랑 같다면
		//객체에 대입
		//반복문 탈출
		Bank bank = null;
		for (int i = 0; i < bankDB.length; i++) {
			int j = 0;
			for (j = 0; j < bankLength[i]; j++) {
				if(bankDB[i][j].account.equals(account)) {
					bank = bankDB[i][j];
					break;
				}
			}
//      위에서 강제로 break를 했다면 j가 bankLength[i]까지 증가하지 못하기 때문에
//      위에서 break 후 밖에 있는 for문도 break 해준다.
			if(j != bankLength[i]) {
				break;
			}
		}
		//객체 리턴
		return bank;
	}
	
	
//  로그인
  //메소드 선언, 매개변수로 계좌와 비밀번호 받음
  //모든 은행에서 공유해야 하므로 static
	public static Bank login(String account, String password) {
		//bank 객체에서 계좌번호 중복검사한 내용 대입
		Bank bank = checkAccount(account);
		//객체가 비어 있지 않다면, > 존재, 중복있음
		//비밀번호가 동일하다면
		//객체 리턴
		if(bank != null) {
			if(bank.password.equals(password)) {
				return bank;
			}
				
		}
		//null값 리턴
		return null;
	}
	
//  핸드폰 번호 검사
	//메소드 선언 매개변수로 폰번호를 입력받기
	//모든 은행의 폰번호를 확인해야 하니까 static
	public static Bank phoneNumCheck(String phoneNumber) {
		 //은행 객체 선언
		Bank bank = null;
	    //행의 길이만큼 반복(은행 개수)
    	//j를 따로 사용해야 하기 때문에 밖에서 선언
        //각 은행별 가입된 회원 수 만큼 반복
		//사용자가 입력한 폰번호가 객체의 폰번호와 같다면 
		//객체에 대입
		//반복문 탈출
		for (int i = 0; i < bankDB.length; i++) {
			int j = 0;
			for (j = 0; j < bankLength.length; j++) {
				if(bankDB[i][j].phoneNum.equals(phoneNumber)) {
					bank = bankDB[i][j];
					break;
				}
			}
			//밖에 있는 for문도 탈출
			if(j != bankLength[i]) {
				break;
			}
		}
		//객체 리턴
		return bank;
	}
	
	

	
}
