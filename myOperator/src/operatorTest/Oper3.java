package operatorTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
		//사용자에게 키를 입력받고, 정수라면 정수로 출력
		//실수라면 실수로 출력
		//예) 183 -> 183 출력
		//	 183.5 -> 183.5 출력
		//삼항연산자 사용
		
		//정수인지 실수인지 : 전체에서 진수부를 뺐을 때 0인지 아닌지 검사
//		3.5 - 3 = 0.5 >> 실수
		//3.0 - 3 = 0.0 >> 정수
		
		Scanner sc = new Scanner(System.in);
		
//		
//		
////		int heightInt = 0;
////		heightInt = (int)height;
////		System.out.println(height);
//		
//		double height = 0.0;
//		String message = "키를 입력하세요", result = null;
//		boolean isRight = false;
//		
//		System.out.println(message);
//		height = Double.parseDouble(sc.nextLine());
//		
////		isRight = height - (height / 10) == 0.0;
//		isRight = height - (int)height == 0.0;
////		System.out.println((int)height);
//		result = isRight ? "키 : "+ (int)height : "키 : "+ height;
//		System.out.println(result); 
		
		
		//강사님
		double height = 0.0;
		String message = "키 : ", format = null;
		char newLine = '\n';
		boolean check = false;
		
		
		System.out.print(message);
		height = sc.nextDouble();
		
		check = height - (int)height == 0;
		
//		System.out.println(check ? (int)height : height); // 실수 + 정수는 실수 > 실수 연산은 무조건 실수가 나옴
		//값에 실수가 있으니까 int로 자료형 변환해도 실수가 나옴
		format = check ? "%.0fcm%c" : "%.2fcm%c";
		System.out.printf(format, height, newLine);
		
		
		System.out.println("----개인공부---");
		System.out.printf("%.0f", 1.22); //소수점0번째
		System.out.printf("%.1f", 1.22); //소수점1번째
	}

}
