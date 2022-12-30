package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 5개 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		
		Scanner sc = new Scanner(System.in);
		
		String msg = "번째 정수 입력 : ", temp = null;
		int i = 0;
		//5개 정수니까 5칸 배열
		int[] nums = new int[5];
		
		while(true) {
		System.out.print(++i + msg);
		temp = sc.next();
		
		//입력받은 값이 q라면 반복문 탈출
		if(temp.equals("q")) {break;}
		
			try {
				//위에서 ++i 했으니까, i-1번째 칸 > 0부터 시작, 입력값을 int타입으로 바꿔서 대입
				nums[i-1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("입력하기 전에 생각이란 걸 해봤나요? 제대로 입력하세요. 정수입력하세요.");
				//잘못했으면 인덱스 번호 -1 하기(안 건너뛰게)
				i--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개만 입력가능합니다.");
				
				//그 동안 입력받은 값 보여주기
				for (int j = 0; j < nums.length; j++) {
					System.out.print(nums[j]+ " ");
				}
				//더 이상 반복할 필요가 없으니까 break로 반복문 탈출
				break;
			} catch (Exception e) {
				System.out.println("?"); // 알 수 없는 오류
				//잘못했으면 인덱스 번호 -1 하기
				i--;
			}
		
		}
		
		//배열 안에 숫자가 잘 들어가 있는지 어떻게 알지??
	}

}
