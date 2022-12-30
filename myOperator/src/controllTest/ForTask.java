package controllTest;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
		
		//브론즈
				//1~100까지 출력
				//100~1까지 출력
				//1~100까지 중 짝수만 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(100-i);
		}
		
		for (int i = 0; i < 100; i++) {
			if(i%2 == 0) {
				System.out.println(i+2);
			}
		}
		
		System.out.println("---------------");
		
		//실버
				//1~10까지 합 출력
				//1~n까지 합 출력
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i+1;
		}
		System.out.println(total);
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("n값 입력 : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sum += i+1;
		}
		System.out.println(sum);
		
		System.out.println("---------------");

		//골드
				//A~F까지 출력
		
		for (int i = 0; i < 6; i++) {
			System.out.print((char)(i+65));
		}
		System.out.println();
		
				//A~F까지 중 C제외하고 출력
		for (int i = 0; i < 5; i++) {
			if(i<2) {
				System.out.print((char)(i+65));
			}else {				
				System.out.print((char)(i+65+1));
			}
		}
		
		System.out.println("\n---------------");
		
		//다이아
		
			//0 1 2 3 0 1 2 3 0 1 2 3 출력
		for (int i = 0; i < 12; i++) {
			if(i<4) {
				System.out.print(i);
			}else if(i / 4 == 1) {
				System.out.print(i-4);
			}else {
				System.out.print(i-8);
			}
			
		}
		
		System.out.println();
		
			//aBcDeFgHiJ....Z 출력
		for (int i = 0; i < 26; i++) {
			
			//홀수 소문자
			//짝수 대문자
			if(i % 2 != 1) {
				System.out.print((char)(i+97));
			}else if(i % 2 == 1){
				System.out.print((char)(i+65));
			}
		}
		
		
		
	}

}
