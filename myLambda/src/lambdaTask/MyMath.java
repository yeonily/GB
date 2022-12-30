package lambdaTask;

import java.util.Scanner;

//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOper를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결

public class MyMath {
//	외부에서 연산자 한 개를 전달받는다.
	//덧셈을 할 준비, 뺄셈을 할 준비, calc 구현된 것임.
	public static Calc calculator(String oper) {
		Calc c = null;
		switch(oper) {
		case "+": // 전달받은 연산자가 +일 때
			c = (n1, n2) -> n1+n2; // 메소드가 선언되어 있는 Calc타입 > Calc타입으로 담아주기
			//원래라면 new Calc(){ 익명클래스로 열어야 함 >> 람다식
			break;
		case "-":
			c = (n1, n2) -> n1-n2;
			break;
		}
		
		return c;
		
	}
	

	public static void main(String[] args) {
//		전체 수식에서 +와 -만 분리하는 메소드로 구현
		//람다식은 필드를 구현하는 것 > 선언
								//구현 하고 있으니까 선언
		OperCheck operCheck = (ex) -> {
								//전달받은 수식은 ex에 담음
			String temp = "";
			//전체 수식에서 연산자만 골라서 문자열에 담고
			for (int i = 0; i < ex.length(); i++) {
				char c = ex.charAt(i);
				if(c == '-' || c == '+') {
					temp += c; // 연산자가 문자열 배열에 담김
				}
			}
			//문자열 배열로 리턴
			return temp.split("");
		};
		
		
		String msg = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요";
		String exMsg = "예)9+7-5";
		String expression = null; // 전체 수식 담는 변수
		String[] opers = null; // 수식의 연산자만 담긴 변수
		String[] nums = null;
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		System.out.println(exMsg);
//		사용자에게 전체 수식을 입력받는다.
		expression = sc.next();
//		위에서 구현한 연산자 추출 메소드에 전체 수식을 전달한다.
		opers = operCheck.checkOper(expression); //수식의 연산자만 들어가 있음, 문자열 배열 타입이니까 하나 만들어주기
		nums = expression.split("\\+|\\-"); //분리된 정수만 담긴 배열(정규표현식만 가능, 문자로 표현하기 위해 \\두번써서 \+를 나타냄)
		
//		-1+9+5 >> 연산자를 3개로 봄(방법3)
//1.	expression = (nums[0].equals("") ? "0" : "") + expression;
//1.	nums = expression.split("\\+|\\-"); 
//2.	nums[0] = nums[0].equals("") ? "0" : nums[0];
//3.	number1 = Integer.parseInt(nums[0].equals("") ? opers[0] + nums[1] : nums[0]);
		
		//0번째 칸에 있는 정수를 int타입으로 바꾸고 대입
		number1 = Integer.parseInt(nums[0]);
		
		//opers(연산자)의 길이만큼 반복문
		for (int i = 0; i < opers.length; i++) {
//3.		if(i == 0 && number1 < 0) {continue;} //처음에 음수일 경우에만 건너뛰기
			//다음 칸에 있는 숫자를 int타입으로 바꾸고 대입
			number2 = Integer.parseInt(nums[i+1]);
			
//			calculator(opers[i]) //calc가 구현된 필드의 주소값으로 봐야함, 연산한 결과를 리턴
//			구현된 calc에 두 정수 넣기, 메소드 사용
			number1 = calculator(opers[i]).calc(number1, number2); // 연산결과
								//+ 전달			>> 두 정수 더해줌
		}
		
		//number1에는 연산결과값이 담겨있음
		System.out.println(number1);
		
	}

}
