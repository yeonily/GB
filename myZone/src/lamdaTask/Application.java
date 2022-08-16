package lamdaTask;

import java.util.Scanner;

//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOper를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결

public class Application {
//	외부에서 연산자 한 개를 전달받는다.
	//덧셈뺄셈을 하려고 만든 게 아니라 덧셈을 할 준비, 뺄셈을 할 준비
	//calculator메소드를 사용하면 사용자가 전달한 연산자에 맞게끔 Calc가 구현이 되어 있는 것!
	//calc를 calculator에서 구현한 것
	
	//매개변수로 연산자를 받아와서 그 연산자에 맞게 익명메소드 구현하기
	public static Calc calculator(String oper) {
		//calculator라는 메소드를 Calc라는 객체에 담은 다음에 calculator.calc(,) 두 정수 담으면 됨. 
		//calc메소드를 사용하기 전에 구현부터 해야 하니까 calculator라는 메소드를 먼저 써야함.
		Calc c = null;
		
		switch (oper) {
		case "+":// 전달받은 연산자가 +일 때
			c = (n1, n2) -> n1 + n2; //Calc타입
			break;
		case "-":
			c = (n1, n2) -> n1 - n2;
			break;
		}
		
		//사용한 전체를 Calc타입의 c로 보기
		return c;
	}

	public static void main(String[] args) {
//			전체 수식에서 +와 -만 분리하는 메소드로 구현
		OperCheck operCheck = (ex) -> {
			//operCheck 메소드는 메인메소드에서 구현을 함. 왜? 전체수식이 필요하니까
			//전체수식은 (ex) 로 전달받음, operCheck에 담는 이유는 람다식을 선언하는 거니까(구현 중)
			//람다식은 필드를 구현하는 것임. 구현 = 선언
			//사용은 operCheck.checkOper() 식임.
			String temp = ""; //연산자만 들어갈 문자열 만들어주기
			
			//전체 수식에서 연산자만 골라서 문자열에 담고
			for (int i = 0; i < ex.length(); i++) {
				char c = ex.charAt(i); //전체 수식 내용 각각이 c에 담김
				if(c == '-' || c == '+') {//연산자만 추출해서 
					temp += c; //temp에 담아주기
				}
			}
			//문자열 배열로 리턴
			return temp.split("");
		};
		
		
		String msg = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String exMsg = "예)9+7-5";
		String expression = null; //전체수식 담는 변수
		String[] opers = null; //연산자만 담는 배열
		String[] nums = null; //정수만 담는 배열
		int number1 = 0, number2 = 0; //첫번째 정수, 두번째 정수 변수 선언
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		System.out.println(exMsg);
		//사용자에게 전체 수식을 입력받는다.
		expression = sc.next();
		//연산자만 쏙쏙 분리하기 >> operCheck 메소드를 통해서
		
		//OperCheck 인터페이스에 있는 추상메소드 checkOper
		//OperCheck 타입의 operCheck 객체를 만들 때 메소드가 구현이 되어 있어야 하니까
		//람다식을 사용해서 구현한 것.
		//이제 operCheck 객체에 있는 checkOper 메소드를 사용하고자 함. 전체수식을 매개변수로.
		//리턴값이 연산자가 담긴 배열임.
//		위에서 구현한 연산자 추출 메소드에 전체 수식을 전달한다.
		opers = operCheck.checkOper(expression);
		
		//전체수식에서 연산자를 기준으로 정수만 추출해야 함.
		nums = expression.split("\\+|\\-"); //분리된 정수만 담긴 배열
		
		number1 = Integer.parseInt(nums[0]); //0번째 방에 있는 정수
		for (int i = 0; i < opers.length; i++) {
			number2 = Integer.parseInt(nums[i + 1]);
//			calculator(opers[i]) : calc가 구현된 필드의 주소값, Calc타입의 값
//			calculator(opers[i]).calc(number1, number2); : 통채로가 num1과 num2의 연산결과
			number1 = calculator(opers[i]).calc(number1, number2); 
			
		}
				
		System.out.println(number1);
		
		
		
		
		
	}

}
