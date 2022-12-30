package bank;

public class Bank {
	//2차원 배열, 은행이 3개, 고객이 100명
	//은행은 모든 DB를 공유해야 함 >> static(정적 변수)
//	은행이 3개, 각 은행별 고객 100명씩 유치 가능
   public static Bank[][] arrBank = new Bank[3][100];
//   은행별 가입 회원 수
   //계좌 개설하고 나서 +1
   // 신한은행 +1 : arCount[0] = 값+1
   public static int[] arCount = new int[3];
   
   //전역변수 선언
   //직접 접근할 수 없도록 private으로 막아줌
   private String name;
   private String account;
   private String phoneNumber;
   private String password;
   private int money;
   
   //기본생성자
   public Bank() {;}

   //초기화생성자
   public Bank(String name, String account, String phoneNumber, String password, int money) {
      this.name = name;
      this.account = account;
      this.phoneNumber = phoneNumber;
      this.password = password;
      this.money = money;
   }

   //게터세터
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

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
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
   
 
   
   @Override
   public String toString() {
	   return "Bank [name=" + name + ", account=" + account + ", phoneNumber=" + phoneNumber + ", password=" + password
			   + ", money=" + money + "]";
   }
   
   
//   static을 붙여서 선언한 메소드
//   객체화 없이 사용해야 할 때가 있기 때문
//   객체화 없이 사용하면 편하기 때문
   


//   계좌번호 중복검사
   //메소드 선언 매개변수로 계좌번호를 입력받기
   //모든 은행의 계좌번호를 확인해야 하니까 static
//   외부에서 생성된 계좌번호를 전달받는다.
   public static Bank checkAccount(String account) {
	  //은행 객체 선언
      Bank bank = null;
      //행의 길이만큼 반복(은행 개수)
      for (int i = 0; i < arrBank.length; i++) { //은행 수만큼 반복
    	  //j를 따로 사용해야 하기 때문에 밖에서 선언
         int j = 0; //for문 영역 밖에서 사용하기 위해 이 곳에 선언
         for (j = 0; j < arCount[i]; j++) { //각 은행별 가입된 회원 수 만큼 반복
        	 //사용자의 계좌가 입력한 계좌랑 같다면
            if(arrBank[i][j].account.equals(account)) { // 각 회원들의 계좌번호와 생성된 계좌번호를 비교한다.
            	//객체에 대입
               bank = arrBank[i][j];//만약 일치하는 계좌번호가 있다면 해당 객체를 bank에 담아준다.
               //반복문 탈출
               break;//더 이상 반복을 진행할 필요가 없다.
            }
         }
//         위에서 강제로 break를 했다면 j가 arCount[i]까지 증가하지 못하기 때문에
//         위에서 break 후 밖에 있는 for문도 break 해준다.
         if(j != arCount[i]) {break;} 
      }
      //객체 리턴
      return bank;
   }

//   핸드폰 번호 검사
 	//메소드 선언 매개변수로 폰번호를 입력받기
   //모든 은행의 폰번호를 확인해야 하니까 static
   public static Bank checkPhoneNumber(String phoneNumber) {
	 //은행 객체 선언
      Bank bank = null;
    //행의 길이만큼 반복(은행 개수)
      for (int i = 0; i < arrBank.length; i++) {
    	//j를 따로 사용해야 하기 때문에 밖에서 선언
         int j = 0;
         //각 은행별 가입된 회원 수 만큼 반복
         for (j = 0; j < arCount[i]; j++) {
        	//사용자가 입력한 폰번호가 객체의 폰번호와 같다면 
        	 System.out.println("로그"+arrBank[i][j]);
            if(arrBank[i][j].phoneNumber.equals(phoneNumber)) {
            	//객체에 대입
               bank = arrBank[i][j];
               //반복문 탈출
               break;
            }
         }
         //밖에 있는 for문도 탈출
         if(j != arCount[i]) {break;}
      }
      //객체 리턴
      return bank;
   }
//   로그인
   //메소드 선언, 매개변수로 계좌와 비밀번호 받음
   //모든 은행에서 공유해야 하므로 static
//   외부에서 입력받은 계좌번호와 비밀번호를 전달받는다.
   public static Bank login(String account, String password) {
	   //bank 객체에서 계좌번호 중복검사한 내용 대입
//	   계좌번호는 checkAccount에 전달한다.
//	   1) 계좌가 있다면 해당 회원의 전체 정보를 가져온다.
//	   2) 계좌가 없다면 null을 가져온다.
      Bank bank = checkAccount(account);
      //객체가 비어 있지 않다면, > 존재, 중복있음
//      계좌번호가 존재한다면,
      if(bank != null) {
    	  //비밀번호가 동일하다면
//    	  그 회원의 비밀번호와 입력받은 비밀번호를 비교한다.
         if(bank.password.equals(password)) {
        	 //객체 리턴
//        	 로그인 성공 시, 회원의 전체 정보를 리턴한다.
            return bank;
         }
      }
      //null값 리턴
//      로그인 실패 시 null을 리턴한다.
      return null;
   }
//   입금
   public void deposit(int money) {
	   //계좌에 돈 더해주기
      this.money += money;
   }
//   출금
   public void withdraw(int money) {
	   //계좌에 돈 빼주기
      this.money -= money;
   }
//   잔액조회
   public int showBalance() {
	   //계좌 리턴하기
      return money;
   }
   
}





