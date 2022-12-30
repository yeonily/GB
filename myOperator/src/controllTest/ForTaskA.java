package controllTest;

import java.util.Scanner;


public class ForTaskA {

	public static void main(String[] args) {

		// 브론즈
		
		// 1~100까지 출력			
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + 1);
//		}
		
		// 100~1까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//		}

		// 1~100까지 중 짝수만 출력
//		for (int i = 0; i < 50; i++) {//짝수는 50개
//			System.out.println((i + 1)*2);
//		}
		//최소한의 반복을 하는 게 좋음
		
		//실버
		//1~10까지 합 출력
//		int total = 0;
//		for (int i = 0; i < 10; i++) {
//			total += i + 1;
//			//total = total + i + 1;
//			//1 : total = 0 + 1;
//			//2 : total = (0 + 1) + 2;
//		}
//		System.out.println(total);
		
		//1~n까지 합 출력
//		Scanner sc = new Scanner(System.in);
//		String message = "1~n까지의 합\nn : ";
//		int end = 0, total = 0;
//		
//		System.out.print(message);
//		end = sc.nextInt();
//		
//		for (int i = 0; i < end; i++) {
//			total += i + 1;
//		}
//		System.out.println(total);
		
		//골드
		//A~F까지 출력
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)i + 65);
//		}
		
		//A~F까지 중 C제외하고 출력
//		for (int i = 0; i < 5; i++) {
//			System.out.print((char)(i > 1 ? i + 66 : i + 65));
//		}
		
		//다이아
		//0 1 2 3 0 1 2 3 0 1 2 3 출력
//		for (int i = 0; i < 12; i++) {
//			System.out.print(i % 4 + " ");
//		}
		
		//aBcDeFgHiJ....Z 출력
//		for (int i = 0; i < 26; i++) {//알파벳 26개
//			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
//		}
		
		

	}

}
