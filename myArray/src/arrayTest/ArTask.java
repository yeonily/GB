package arrayTest;

import java.util.Scanner;

public class ArTask {

	public static void main(String[] args) {
		
//브론즈
		//1~10까지 배열에 담고 출력
		int[] ar1 = new int[10];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = i;
		}

		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]+1);	
		}
		
		System.out.println("-----");
		//10~1까지 중 짝수만 배열에 담고 출력
		int[] ar2 = new int[10];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = 10-i;
			if(ar2[i] % 2 == 0) {
				System.out.println(ar2[i]);
			}
 		}
		
		
		System.out.println("-----");
		//1~100까지 배열에 담은 후 홀수만 출력
		int[] ar3 = new int[100];
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = i+1;
		}
		
		for (int i = 0; i < ar3.length; i++) {
			if(ar3[i] % 2 != 0) {
				System.out.println(ar3[i]);
				
			}
		}
		
//실버
		System.out.println("-----");
		//1~100까지 배열에 담은 후 짝수의 합 출력
		int[] ar4 = new int[100];
		int total = 0;
		for (int i = 0; i < ar4.length; i++) {
			ar4[i] = i+1;
		}
		
		for (int i = 0; i < ar4.length; i++) {
			if(ar4[i] % 2 == 0) {
				total += ar4[i];
			}
		}
		System.out.println(total);
		
		System.out.println("-----");
		//A~F까지 배열에 담고 출력
		char[] ar5 = new char[6];
		for (int i = 0; i < ar5.length; i++) {
			ar5[i] = (char)(i+65);
		}
		
		for (int i = 0; i < ar5.length; i++) {
			System.out.println(ar5[i]);
		}
		
		System.out.println("-----");
		//A~F까지 중 C 제외하고 배열에 담은 후 출력
		char[] ar6 = new char[5];
		for (int i = 0; i < ar6.length; i++) {
			if(i<2) {
				ar6[i] = (char)(i+65);
			}else {
				ar6[i] = (char)(i+66);
			}
			
		}
		
		for (int i = 0; i < ar6.length; i++) {
			System.out.println(ar6[i]);
		}
		
//골드
		System.out.println("-----");
		//5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		Scanner sc = new Scanner(System.in);
		int[] ar7 = new int[5];
		int max = 0, min = 0;
		String msg = "5개 정수를 입력하세요, ex)1 2 3 4 5";

		System.out.println(msg);
		for (int i = 0; i < ar7.length; i++) {
			ar7[i] = sc.nextInt();
//			if() {//앞방과 뒷방을 비교하기
				//큰 방이 max에 대입
				//작은 방은 min에 대입
//			}
		}
		
		max = ar7[0];
		min = ar7[0];
		for (int i = 0; i < ar7.length; i++) {
			if(max < ar7[i]) {max = ar7[i];}
			if(min > ar7[i]) {min = ar7[i];}
			
		}
		
		
		System.out.println("최대값 : "+max+"\n최소값 : "+min);
		
//다이아
		System.out.println("-----");
		//사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		int[] ar8 = null;
		String message = "만들 배열의 수 입력 : ";
		String numMessage = "배열의 값 입력 : ";
		int sum = 0;
		double avg = 0.0;
		
		System.out.print(message);
		ar8 = new int[sc.nextInt()];
		for (int i = 0; i < ar8.length; i++) {
			System.out.print(numMessage);
			ar8[i] = sc.nextInt();
			sum += ar8[i];
		}
		
		avg = (double)sum / ar8.length;
		avg = Double.parseDouble(String.format("%.2f", avg));
		System.out.println(avg);
		
		
	}

}
