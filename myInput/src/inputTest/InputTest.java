package inputTest;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = null; //변수 선언 시 초기화를 하자
		String firstName = null;
		//처음에 들어갈 값을 모를 때 >> 넣는 값을 초기값
		//초기값
		//정수 : 0
		//실수 : 0.0
		//문자 : ' '
		//문자열 : null 또는 ""
		
		System.out.print("이름 : ");
//		scan.next(); //사용자가 입력한 문자열 값, 통채로를 값으로 보기
//		System.out.println(scan.next()+"님 환영합니다");
//		name = scan.next();
//		firstName = scan.next();
//		System.out.println(name +firstName+ "님 환영합니다");
		
		name = scan.nextLine();
		System.out.println(name +"님 환영합니다.");
		
		Scanner scan2 = new Scanner(System.in);
		String name1 = scan2.next();
		
		
	}

}
