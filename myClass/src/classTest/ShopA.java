package classTest;

import java.util.Scanner;

class SuperCar {
	// 변수 선언, 전역변수는 자동으로 초기화됨
//   브랜드, 색상, 가격 (인스턴스 변수)
	// 브랜드 선언
   String brand;
   // 컬러 선언
   String color;
   // 가격 선언
   int price;
   
   //비밀번호 선언
   String password;
   
   //차 상태 확인하는 변수 선언
   //엔진 상태, 외부에서 전달받는 값이 아닌, 내부적으로 사용되는 변수
   boolean check;

   //기본생성자, 저장된 비밀번호 값 대입
   //기본생성자
   public SuperCar() {
	   //초기 비밀번호는 0000으로 초기화
      password = "0000";
   }
   
   //사용자가 입력받은 비밀번호를 매개변수로 갖는 생성자
   public SuperCar(String password) {
	   //저장된 비밀번호가 입력한 비밀번호랑 같다
	   //초기 비밀번호를 변경하고 싶을 때 사용하면 됨.
      this.password = password;
   }

   //변수를 전부 초기화할 수 있는 생성자
   public SuperCar(String brand, String color, int price, String password) {
      this.brand = brand;
      this.color = color;
      this.price = price;
      this.password = password;
   }
   
//   시동 켜기
//   시동의 상태를 확인하고 
//   시동이 꺼져있다면, "시동 켜기" 출력
//   이미 시동이 켜져있다면, "시동이 이미 켜져있습니다" 출력
   //engineStart 메소드 선언
   boolean engineStart() {
	   //check는 false
	   //if문은 참일 때 실행
	   //조건을 참으로 만들어줘야하니까 !check = true > 시동이 켜진 것임
	   //시동이 꺼져있을 때만 조건식에 들어가야 함
	   //false일 때 true로 바뀌면서 if문 안에 문장을 실행한다
      if(!check) {//check가 false일 때 들어옴
    	 //시동을 키고
    	 //시동이 꺼져있다면, 시동을 켜준다(check를 true로 바꿔준다)
         check = true;
         //시동 켜기 성공(true 리턴)
         return true; // 킨 값이 true로 리턴
      }
      //시동 켜기 실패(false 리턴)
      return false; // 조건식에 안 들어가면 false
   }
   
//   시동 끄기
//   시동의 상태를 확인하고 
//   시동이 켜져있다면, "시동 끄기" 출력
//   이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다" 출력
   //engineStop 메소드 선언
   boolean engineStop() {
	   //차 시동이 켜져있다면(true)
	   //check가 true일 경우 들어옴
      if(check) {//시동이 켜져 있을 때 들어옴
    	 //차 시동을 끄고
    	 //시동 끄기
         check = false;
         //시동 끄기 성공
         return true; //끈 값이 true로 리턴
      }
      //시동 끄기 실패(이미 꺼져 있음)
      return false; //조건식에 안들어가면 false
   }
   
//   [심화]
//   시동을 켜기 위해서는 비밀번호 4자리를 입력해야 한다.
//   입력한 비밀번호가 3회 연속 실패하면 "경찰 출동" 메세지를 출력한다. >> 메소드에서는 비밀번호가 같은지만 확인
   //비밀번호 체크하는 메소드
   //외부에서 사용자가 입력한 비밀번호를 매개변수로 전달받는다.
   boolean checkPassword(String password) {
	   //저장된 비밀번호와 입력된 비밀번호를 비교하여 리턴하기(맞으면 true, 틀리면 false)
	   //this.password : 자동차 비밀번호
	   //password : 입력받은 비밀번호
	   //두 개를 비교해서 일치하면 true, 일치하지 않으면 false
      return this.password.equals(password);
   }
   
}

public class ShopA {
   public static void main(String[] args) {
	   //객체화(instance)
	   //SuperCar라는 추상적인 개념을 ferriari라는 구체적인 객체로 
	   //new SuperCar() 생성자
	   //ferrari에는 SuperCar의 주소값이 담겨있다.
      SuperCar ferrari = new SuperCar();
      
      //시동을 키고, 끄는 메세지, 비밀번호 입력 메세지, 비밀번호 선언, 초기화
      String msg = "1.시동켜기\n2.시동끄기", pwMsg = "비밀번호 : ", pw = null;
      //입력 메소드 임포트
      Scanner sc = new Scanner(System.in);
      //입력받은 값을 담을 변수, 횟수 선언
      //choice : 사용자가 입력한 메뉴 번호
      //count : 비밀번호 오류 횟수
      int choice = 0, count = 0;
      //엔진이 꺼졌을 때 종료하기 위한 변수 선언
      //현재 엔진의 상태를 의미(켜져 있는 상태에서 누가 끄면)
      //FLAG : 해당 영역에서 연산된 결과를 다른 영역에서 사용하고자 할 때 
      boolean stopedEngine = false;
      
      //한번은 무조건 실행
      do {
    	 //시동 키고 끄는 메세지 출력
         System.out.println(msg);
         //입력값을 변수에 담기
         choice = sc.nextInt();
         
         //얼마나 반복될 지 알 수 없을 때 쓰는 반복문
         switch(choice) {
         //1번 상황
         case 1: // 시동 켜기
//        	 if(ferrari.engineStart()) {
//        		 System.out.println("시동 켜짐");
//        		 break;
//        	 }
        	 
        	 //ferrari.check > false //시동이 꺼져있다면
        	 //true를 해야 if안에 들어갈 수 있음 >> !ferrari.check
        	 //!ferrari.check > true
        	 //시동이 꺼져있다면
            if(!ferrari.check) { // 시동이 꺼졌을 때 들어옴
            	//비밀번호 입력 메세지 출력
               System.out.print(pwMsg);
               //입력값을 변수에 대입
               pw = sc.next();
               //입력한 비밀번호가 저장된 비밀번호와 같다면
               if(ferrari.checkPassword(pw)) { // 비밀번호 일치할 때 들어옴
            	   //엔진키는 메소드 사용
                  ferrari.engineStart(); // 시동켜주기
                  //비밀번호 시도 횟수 초기화
                  count = 0; // 시동 켜기에 성공했다면 오류 횟수를 초기화 해준다.
                  //시동켜짐 출력
                  System.out.println("시동 켜짐");
                  //입력된 비밀번호가 저장된 비밀번호와 같지 않다면
               }else {
            	   //비밀번호 시도 횟수 1 증가
                  count++; // 오류 횟수 1 증가
                  //비밀번호 시도 횟수 및 비밀번호 오류 메세지 출력 
                  System.out.println("비밀번호 오류 " + count + "회");
                  //시도가 연속 3번째라면
                  if(count == 3) { // 연속 3회 오류 시 들어옴
                	  //경찰 출동 출력
                     System.out.println("경찰 출동");
                  }
               }
               //반복문 탈출
               break; // 즉시 탈출
            }
            
            //if문에 안들어갈 경우 = 시동이 켜져있는 경우
            //이미 시동이 켜져있습니다 출력
            System.out.println("이미 시동이 켜져있습니다.");
            //반복문 탈출
            break;
            
         //2번 상황 
         case 2: // 시동 끄기
        	 //ferrari.engineStop() > true : 시동 꺼짐 / false : 이미 꺼진 상태
        	 //엔진이 꺼졌으면
        	 //엔진이 꺼진 값 = true값 >> 변수에 넣어서 while문 탈출 변수로 사용
        	 //시동끄기를 시도한 결과를 stopedEngine Flag에 담아준다.
            if(stopedEngine = ferrari.engineStop()) {
            	//시동꺼짐 출력
               System.out.println("시동 꺼짐");
               //반복문 탈출
               break;
            }
            
            //if문에 들어가지 않음 > 이미 시동꺼짐 출력
            System.out.println("이미 시동이 꺼져있습니다.");
            //반복문 탈출
            break;
         }
//      }while(ferrari.check);
         //while(data) >> data가 false일 경우 반복 종료
         //반복이 종료되는 경우 : 엔진이 꺼지거나, 비밀번호 시도 횟수가 3번일 때, 
      }while(!stopedEngine && count != 3);
      //stopedEngine은 시동이 켜진 후 시동끄기에 성공하면 true이다
      //시동끄기에 성공하면 반복문을 탈출한다.
      //count는 오류 횟수이다. count가 3이라는 뜻은, 연속 3회 비밀번호 오류인 경우이다.
      //따라서 count가 3일 때 while문을 탈출해야 하고, count가 3일 때 조건식이 false가 되어야 한다.
      
      							//count == 3 >> true / false일 때 반복문 탈출이니까 count != 3 
   }
}
