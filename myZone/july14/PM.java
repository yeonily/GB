package july14;

import java.util.Scanner;

public class PM {

	public static void main(String[] args) {
		
//상수		
			final int SIZE = 100; // 상수 >> 변수명을 대문자로!
				
//형변환		
			//자동 형변환 
			System.out.println(11/5.0); // 실수형으로 출력
			
			//강제 형변환
			System.out.println(11/(double)9); // 11/9.0 -> 1.2
			System.out.println((double)11/9); // 11.0/9 -> 1.2
			System.out.println((double)(11/9)); // (double)1 -> 1.0
			System.out.println((int)8.43+2.59); // 8+2.59 -> 10.59
			System.out.println((int)(8.43+2.59)); // (int)11.02 -> 11
			System.out.println((int)8.43+(int)2.59); // 8+2 -> 10
			
			//아스키코드
			char alphabet = 'a';
			System.out.println(alphabet+1); //문자형도 정수형으로 자동 형변환
			// 97+1 >> 98
			
			//문자열+문자열 >> 연산x 연결!
			System.out.println("안녕"+"반가워");
			System.out.println("안녕"+123);
			System.out.println("2 x 4 = " + (2*4));
			//괄호 없으면 연결, 괄호 있으면 연산
				
			//문자열 -> 다른 자료형
			Integer.parseInt("10"); // 10(정수형)
			Double.parseDouble("3.14"); // 3.14(실수형)
			System.out.println(Integer.parseInt("9")+1); //10
			System.out.println(Double.parseDouble("3.14")+5); //8.14
			System.out.println(Double.parseDouble("3.14")+5.4); //8.54
			//8.540000000000001...???

//암호화
			String pw = "AbCde*";
			String encryptedPw = "";
			String decryptedPw = "";
			final int KEY = 5;
			
			for (int i = 0; i < pw.length(); i++) {
				encryptedPw += (char)(pw.charAt(i) * KEY);
			}
			System.out.println(encryptedPw);
			
			for (int i = 0; i < pw.length(); i++) {
				decryptedPw += (char)(encryptedPw.charAt(i) / KEY);
			}
			System.out.println(decryptedPw);
				
//초기화
			int a = 0;
			double b = 0.0;
			char c = ' ';
			String d = "";
			
//입력메소드
			Scanner sc = new Scanner(System.in); // 값을 입력하는 것
			//String name = "김지연" >> 같은 구조, 자료형 변수명 = 값;
			
			String name = "", lastname = "";
			//이름입력하는 출력메소드
			System.out.print("이름 입력 : ");
			//이름 변수에 담기
			name = sc.next();
			//성 변수에 담기
			lastname = sc.next();
			//'이름'+'성'님 환영합니다 출력
			System.out.println(name+lastname+"님 환영합니다");
			
//task1.next()
			//첫번째정수, 두번째정수, 결과 선언
			int onenum = 0, twonum = 0, res = 0;
			//첫번째메세지, 두번째메세지 선언
			String oneMsg = "첫번째 정수 입력 : ", twoMsg = "두번째 정수 입력 : ";
			
			//첫번째메세지 출력
			System.out.print(oneMsg);
			//첫번째 정수에 값 입력
			onenum = Integer.parseInt(sc.next());
			//두번째메세지 출력
			System.out.print(twoMsg);
			//두번째 정수에 값 입력
			twonum = Integer.parseInt(sc.next());
			//결과변수에 정수 합하기
			res = onenum + twonum;
			//서식문자 사용하여 결과 출력하기
			System.out.printf("%d + %d = %d", onenum, twonum, res);
			
//task2.next()
			//첫번째정수, 두번째정수, 세번째정수, 결과 선언
			int firstnum = 0, twicenum = 0, thirdnum = 0, result = 0;
			//정수 입력 메세지 선언
			String inputMsg = "정수 3개 입력해주세요(예, 1 2 3)";
			//정수 입력 메세지 출력
			System.out.print(inputMsg);
			//첫번째정수 입력
			firstnum = Integer.parseInt(sc.next());
			//두번째정수 입력
			twicenum = Integer.parseInt(sc.next());
			//세번째정수 입력
			thirdnum = Integer.parseInt(sc.next());
			//결과변수에 정수 곱하기
			result = firstnum * twicenum * thirdnum;
			//서식문자 사용해서 결과 출력하기
			System.out.printf("%d * %d * %d = %d", firstnum, twicenum, thirdnum, result);
			
			
			
	}

}
