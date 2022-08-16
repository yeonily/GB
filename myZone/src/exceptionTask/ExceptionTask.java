package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
//	5개의 정수만 입력받기
//	- 무한 입력 상태로 구현
//	- q 입력 시 나가기
//	- 5개 정수는 배열에 담기
//	- if문은 딱 한 번만 사용하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 : ", num = null;
		int[] ar = new int[5];
		int i = 0;
		
		while(true) {
			System.out.print(++i + msg);
			num = sc.next();
			if(num.equals("q")) {break;}
			
				try {
					ar[i-1] = Integer.parseInt(num); // 오류가 발생할 수 있는 문장
				} catch (NumberFormatException e) {
					System.out.println("정수만 입력하세요");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("5개만 입력가능합니다");
					//입력받은 것을 보여주기
					for (int j = 0; j < ar.length; j++) {
						System.out.println(ar[j] + " ");
					}
					break;//더 이상 반복할 필요가 없으니 탈출하기
				} catch (Exception e) {
					System.out.println("예측할 수 없는 오류입니다");
				}
			
			
			
		}
		
		
		

	}

}
