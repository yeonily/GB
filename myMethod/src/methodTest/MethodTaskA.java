package methodTest;


public class MethodTaskA {
   
//   1~10까지 println()으로 출력하는 메소드
	//메소드 선언
   void printFrom1To10() {
	   //1~10까지 반복문
      for (int i = 0; i < 10; i++) {
    	  //1~10까지 출력
         System.out.println(i + 1);
      }
   }
   
//   "홍길동"을 n번 println()으로 출력하는 메소드
   //메소드 선언, 매개변수 필요(n번)
   void printHong(int count){
	   //0부터 n번까지 반복문
      for (int i = 0; i < count; i++) {
    	  //"홍길동"출력
         System.out.println("홍길동");
      }
   }
   
//   이름을 n번 println()으로 출력하는 메소드
   //메소드 선언, 매개변수 필요(이름, n번)
   void printName(String name, int count){
	   //0부터 n번까지 반복문
      for (int i = 0; i < count; i++) {
    	  //이름 출력
         System.out.println(name);
      }
   }
   
//   세 정수의 뺄셈을 해주는 메소드
   //메소드 선언, 매개변수(세 정수)
   int substract(int firstNumber, int middleNumber, int lastNumber){
	   //세 정수의 뺄셈값 리턴
      return firstNumber - middleNumber - lastNumber;
   }
   
//   두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다)
   //메소드 선언, 매개변수(두 정수)
   int[] divide(int num1, int num2){
	   //리턴 값이 2개이므로 배열에 담기, 배열 선언
      int[] results = null;
      
      //분모가 0이 아니라면
      if(num2 != 0) {
    	  //배열 칸수 생성
         results = new int[2];
         
         //배열 0칸에 몫 대입
         results[0] = num1 / num2;
         //배열 1칸에 나머지 대입
         results[1] = num1 % num2;
      }
      //결과값 리턴
      return results;
   }
   
   
//   ---------------------
// 1~n까지의 합을 구해주는 메소드
   //메소드 선언, 매개변수(n까지)
   int getTotalFrom1(int end){
	   //총합을 담을 변수 선언
	   int total = 0;
	   //0부터 n까지 반복문
	   for (int i = 0; i < end; i++) {
		   //변수에 총합 담기
		total += i + 1;
	}
	   //총합 리턴
	   return total;
   }
   
// 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
   //메소드 선언, 매개변수(정수값)
   int change(int number){
	   //숫자에 1더해서 리턴
	   return ++number;
   }
   
// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   //메소드 선언, 매개변수(문자열)
   String changeString(String string){
	   //결과값을 담을 변수 선언
	   String result = ""; //누적연산되기때문에 null로 초기화하면 안 됨
	   //0부터 문자열길이만큼 반복
	   for (int i = 0; i < string.length(); i++) {
		   //문자열에서 추출한 문자를 변수에 담기
		char c = string.charAt(i);
		//문자가 대문자라면
		if(c >= 65 && c <= 90){
			//소문자로 바꾸고 결과값에 누적대입
			result += (char)(c + 32);
			//문자가 소문자라면
		}else if(c >= 96 && c <= 122) {
			//대문자로 바꾸고 결과값에 누적대입
			result += (char)(c - 32);
			//그외
		}else {
			//그대로 결과값에 대입
			result += c; 
		}
	}
	   //결과값 리턴
	return result;
   }
   
// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
   //메소드 선언, 매개변수(문자열, 원하는 문자)
   int getCount(String string, char c) {
	   //개수 변수 선언
	   int count = 0;
	   //0부터 문자열 길이만큼 반복문
	   for (int i = 0; i < string.length(); i++) {
		   //문자열에서 추출한 문자가, 원하는 문자와 같다면
		if(string.charAt(i) == c) {
			//개수+1
			count++;
		}
	}
	   //개수 리턴
	   return count;
   }
   
// 5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
   //메소드 선언, 매개변수(정수배열, 원하는 번째 숫자)
   int getValue(int[] nums, int ordinal) {
	   //배열에서 원하는 칸의 값 리턴
	   return nums[ordinal - 1];
   }
   
// 한글을 정수로 바꿔주는 메소드(일공이사 -> 1024), indexOf() 사용
// "공일이삼사오육칠팔구".indexOf("일"); --> 1(인덱스번호 리턴)
// "ABC".indexOf("A"); // 0
   //메소드 선언, 매개변수(문자열)
   int changeToInteger(String hangle) {//외부에서는 한글을 받아야 함.
	   //인덱스번호로 사용할 문자열, 결과변수 선언
	   String hangleOriginal = "공일이삼사오육칠팔구", result = "";
	   
	   //0부터 문자열의 길이만큼 반복문
	   for (int i = 0; i < hangle.length(); i++) {
		   //hangle.charAt(i) -> 문자
		   //hangleOriginal.indexOf(문자) -> 문자의 인덱스 번호(int) 값
		//입력받은 문자열의 문자를 추출하여 그 문자의 인덱스 값을 결과변수에 누적대입
		result += hangleOriginal.indexOf(hangle.charAt(i));
	}
	   //결과값 리턴, indexOf 타입은 int 이므로 형변환
	   return Integer.parseInt(result);
   }
   
   
// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   //메소드 선언, 매개변수(정수 배열)
   int[] getMaxAndMin(int[] nums) {
	   //결과 배열 선언
	   int[] results = new int[2];
	   //결과 배열 0번 칸(최대값)에 매개변수 0번 칸 대입
	   results[0] = nums[0];//최대값
	   //결과 배열 1번 칸(최소값)에 매개변수 0번 칸 대입
	   results[1] = nums[0];//최소값
			   
		//1부터 배열의 길이만큼 반복문
		for (int i = 1; i < nums.length; i++) {
			//결과 배열 0번칸이 정수배열 칸보다 작다면 그 값을 결과 배열에 대입
			if(results[0] < nums[i]) {results[0] = nums[i];}
			//결과 배열 1번칸이 정수배열 칸보다 크다면 그 값을 결과 배열에 대입
			if(results[1] > nums[i]) {results[1] = nums[i];}
		}
		//결과값 리턴
		return results;
   }
   
   
// 어려움 ★★★★★
// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void로 하되, 출력 없이 사용하는 부분에 결과를 전달한다)
//	매개변수는 2개 전달해야 한다.
//	예) getMaxandMin();
//		여기서부터 최대값, 최소값 사용 가능
//	getMaxandMin(arData, results);
//	results[0], results[1];
   
  
   void test(int[] data) {
	   data[0] = 10;
   }
   //영역의 구분 없이 다른 영역의 값을 접근하기 위해서 주소를 사용
   //c언어 : 하드웨어 접근가능, 개발자를 믿는 언어, 버그, 해킹 할 때 사용(저장공간의 주소값 활용)
   //자바 : 하드웨어 접근불가
   
   //메소드 선언, 매개변수(정수배열, 결과배열)
   void getMaxAndMin(int[] nums, int[] results) {//주소는 절대로 중복이 안됨
	   //결과배열 0번 칸(최대값)에 매개변수 0번 칸 대입
	   results[0] = nums[0];//최대값
	   //결과배열 1번 칸(최소값)에 매개변수 0번 칸 대입
	   results[1] = nums[0];//최소값
			   
	    //1부터 정수배열 길이만큼 반복문
		for (int i = 1; i < nums.length; i++) {
			//결과 배열 0번칸이 정수배열 칸보다 작다면 그 값을 결과 배열에 대입
			if(results[0] < nums[i]) {results[0] = nums[i];} //해당 주소에 최대값이 담김
			//결과 배열 1번칸이 정수배열 칸보다 크다면 그 값을 결과 배열에 대입
			if(results[1] > nums[i]) {results[1] = nums[i];} //해당 주소에 최소값이 담김
		}
   }
   
   public static void main(String[] args) {
	   //메소드의 소속 알려주기
	   MethodTaskA mt = new MethodTaskA();
      
	   //선언한 메소드 사용하기
//      mt.printFrom1To10();
//      mt.printHong(10);
//      mt.printName("한동석", 10);
//      System.out.println(mt.substract(5, 4, 2));
	   
//	   //divide 메소드 리턴값은 int배열이므로 배열 선언해서 리턴값 대입 
//      int[] results = mt.divide(10, 0);
//      //메세지 변수 선언(초기화 시, 대입할 땐 null / 누적 연산할 땐 "")
//      String msg = null;
//      //메세지는 리턴값이 null일 때 "0으로 나눌 수 없습니다", null이 아닐 때는 몫과 나머지 값 대입
//      msg = results == null ? "0으로 나눌 수 없습니다." : "몫 : " + results[0] + "\n나머지 : " + results[1];
//      
//      //메시지 출력
//      System.out.println(msg);
//      
//      
//      int[] data = {20};
//      
//      mt.test(data);
//      System.out.println(data[0]);
	   
	   mt.getTotalFrom1(10); //1~10까지의 합 > int 리턴
	   System.out.println(mt.getTotalFrom1(10));
	   
	   boolean result = mt.change(1) % 2 == 0; 
	   //짝수이면 false -> 10에서 11로 바뀜
	   //홀수이면 true -> 11에서 12로 바뀜
	   System.out.println(result ? "홀수에서 짝수로" : "짝수에서 홀수로");	
	   
	   System.out.println(mt.changeString("sknfSLKDFN!@#123"));
	   
	   System.out.println(mt.getCount("apple", 'p')+"개"); // return타입 : int
	   
	   int[] arData = {11,2,40,5,6};
	   System.out.println(mt.getValue(arData, 5));
	   
	   System.out.println(mt.changeToInteger("구팔칠"));
	   int result1 = mt.changeToInteger("삼오일사이"); // return타입 : int
	   //메소드 결과를 값으로 볼 줄 알아야 함.
	   System.out.println(result1 - 42);
	   
	   int[] results = new int[2]; //결과를 담을 변수
	   mt.getMaxAndMin(arData, results);
	   System.out.println("최대값 > " + results[0]);
	   System.out.println("최소값 > " + results[1]);
	   
      
      
   }
}

