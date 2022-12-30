package lambdaTask;

//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOper를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결


public class Application {
	
	//더할지 뺄지 모름, 연산자를 매개변수로 받아오기 
	public static Calc calculator(String oper) {
		Calc c = null;
		switch(oper) {
		case "+":
			c = (n1, n2) -> n1+n2;
			break;
		case "-":
			c = (n1, n2) -> n1-n2;
			break;
		}
		
		return c;
	}

	
	public static void main(String[] args) {
		calculator("3+1-1");
		
		String[] ar = "3+1-1".split("\\+|\\-");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			
		}
		
		
		
	}

}
