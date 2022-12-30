package jobTask;

import java.util.Scanner;

public class Street {
   public static void main(String[] args) {
	  //옥장판 판매원 객체화
      OakSeller seller = new OakSeller();
      //입력 메소드 임포트
      Scanner sc = new Scanner(System.in);
      
      //메뉴 메세지 선언
      String msg = "1.판매하기\n2.승진하기\n3.내 정보\n4.나가기";
      //메뉴선택 값을 담을 변수, 판매 결과값을 담을 변수 선언
      int choice = 0, resultSold = 0;
      
      //무한 반복문
      while(true) {
    	 //메세지 출력
         System.out.println(msg);
         //입력값을 변수에 대입
         choice = sc.nextInt();
         //나가기 입력 시 반복문 탈출
         if(choice == 4) {break;}
         
         //메뉴 선택 값에 따른 조건문
         switch(choice) {
         //1번 판매하기
         case 1: //판매하기
        	//판매 메소드 사용해서 리턴값을 변수에 대입
            resultSold = seller.sell();
            
            //리턴값에 대한 조건문
            switch(resultSold) {
            //0번 성공
            case 0 : //성공
            	//판매 성공 출력
               System.out.println("휴~ 옥장판 판매 성공!");
               //조건문 탈출
               break;
            //1번 대성공
            case 1 : //대성공
            	//판매 대성공 출력
               System.out.println("아자뵤~! 옥장판 판매 대성공!");
               //조건문 탈출
               break;
            //-1번 실패
            case -1 ://실패
            	//실패 출력
               System.out.println("앗");
               //실패횟수가 3번이거나 직급이 사원이 아닌 경우
               if(seller.count == 3 && seller.positionNumber != 0) {
            	   //좌천 메소드 사용
                  seller.demote();
                  //직급 배열에서 직급번호 인덱스를 사용해서, 좌천됨을 출력
                  System.out.println(seller.table[seller.positionNumber] + "으로 좌천되었습니다...");
               }
               //조건문 탈출
               break;
            }
            //통장 잔고 출력
            System.out.println("내 통장 잔고 : " + seller.income + "만원");
            
            //조건문 탈출
            break;
         //2번 승진하기
         case 2: //승진하기
        	 //다이아일 경우
            if(seller.positionNumber == 2) {
            	//승진할 수 없습니다 출력
               System.out.println("승진하실 수 없습니다.");
               //조건문 탈출
               break;
            }
            //승진 메소드를 사용할 경우
            if(seller.promote()) {
            	//판매 실패 횟수 0 대입
               seller.count = 0;
               //직급00으로 승진되었습니다 출력
               System.out.println(seller.table[seller.positionNumber] + "(으)로 승진하셨습니다!!!!");
               //통장 잔고 출력
               System.out.println("내 통장 잔고 : " + seller.income + "만원");
               //조건문 탈출
               break;
            }
            //승진메소드 false경우, 승진 실패 출력 
            System.out.println("승진 실패....");
            //통장 잔고 출력
            System.out.println("내 통장 잔고 : " + seller.income + "만원");
            //조건문 탈출
            break;
         //3번 내 정보
         case 3: //내 정보
        	//이름 출력
            System.out.println("이름 : " + seller.name);
            //직급 출력
            System.out.println("직급 : " + seller.table[seller.positionNumber]);
            //통장 잔고 출력
            System.out.println("내 통장 잔고 : " + seller.income);
            //판매 성공률 출력
            System.out.println("판매 성공률 : " + seller.successRating + "%");
            //조건문 탈출
            break;
         }
      }
      
   }
}
