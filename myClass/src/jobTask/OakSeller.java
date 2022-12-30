package jobTask;

import java.util.Random;

public class OakSeller {
	
	//규칙성이 없는 값을 배열로 묶어서 관리하기
	//직급 배열
   String[] table = {"사원", "팀장", "다이아"};
   //승진할 때 필요한 돈 배열
   int[] pay = {0, 10_000, 100_000};
   //판매수입 배열(직급에 따라 수입금액이 바뀜)
   int[] incomes = {1_000, 3_000, 9_000};
   
   //변수 선언 / 전역변수니까 초기화해주지 않아도 됨
   //직원 이름 변수 선언
   String name;
   //직급은 int 타입으로 선언
   int positionNumber;
   //성공률 선언
   int successRating;
   //수입 선언
   int income;
   //실패 횟수 선언
   int count;
   
   //랜덤 메소드 임포
   Random r = new Random();
   
   //기본 생성자
   public OakSeller() {
	   //this에는 초기값
      this("한동석", 0);
   }
   
   //오버로딩해서 매개변수 있는 생성자 만들기
   public OakSeller(String name, int positionNumber) {
	  //직원 이름에는 매개변수로 받은 값이 들어감
      this.name = name;
      //직급번호에는 매개변수로 받은 값이 들어감
      this.positionNumber = positionNumber;
      //성공률은 초기값 대입 
      this.successRating = 50;
   }
   
   //판매 메소드
   //2가지 이상의 값이 리턴될 경우에는 int로 리턴
   int sell() { //성공 : 0, 대성공 : 1, 실패 : -1
	   //성공한다면
      if(rate(successRating)) { //성공
    	  //실패 횟수는 0 대입
         count = 0;
         //대성공한다면
         if(rate(20)) { //대성공
        	 //직급에 따른 수입의 3배가 수입에 누적대입
            income += incomes[positionNumber] * 3;
            //성공률 5 증가
            successRating += 5;
            //1값 리턴
            return 1;
         }
         //직급에 따른 수입이 누적대입
         income += incomes[positionNumber];
         //성공률 2 감소
         successRating -= 2;
         //0값 리턴
         return 0;
      }
      //실패한다면
      //실패 횟수 1 증가
      count++;
      //수입 2000 감소
      income -= 2_000;
      //-1값 리턴
      return -1;
   }
   
   //좌천 메소드
   void demote() {
	   //직급번호가 낮아짐
      positionNumber--;
   }
   
   //승진 메소드
   boolean promote() {
	   //수입에서 승진에 필요한 금액만큼 빠짐, 승진에 필요한 금액은 승진되는 직급의 인덱스 번호 만큼 필요함
      income -= pay[positionNumber+1];
      //삼항연산자 사용해서 승진할 수 있는 확률 나누기
      //팀장으로 승진할 확률 30%, 다이아로 승진할 확률 10%
      //사원이니? true > 팀장으로 승진할 확률 30%
      //사원이니? false(직급=팀장) > 다이아로 승진할 확률 10%
      if(positionNumber == 0 ? rate(30) : rate(10)) {
    	 //직급번호 높아짐
         positionNumber++;
         //성공하면 boolean값으로 리턴
         return true;
      }
      //실패하면 boolean값으로 리턴
      return false;
   }
   
   //확률 계산 메소드
   //몇 퍼센트로 할 지는 매개변수로 받기
   boolean rate(int rating) {
	   
	  //확률 배열 만들기(1단위)
      int[] percent = new int[100];
      //매개변수로 받은 만큼 반복을 돌리고 배열의 값을 0에서 1로 바꾸기
      for (int i = 0; i < rating; i++) {percent[i] = 1;}
      
      //배열의 길이만큼 랜덤한 값을 받아오고, 그 값이 담긴 배열의 내용이 1이라면 true, 아니라면 false -> 확률개념
      return percent[r.nextInt(percent.length)] == 1;
   }
}

