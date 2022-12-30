package arrayTest;

import java.util.Scanner;

public class ArTaskA {

	public static void main(String[] args) {
		
//브론즈
		//1~10까지 배열에 담고 출력
		//10칸 배열 선언
//		int[] arData = new int[10];
		//0부터 배열의 길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
		//배열 칸마다 +1하기
//			arData[i] = i+1;
//		}
//
		//0부터 배열의 길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
		//배열의 값 출력하기
//			System.out.println(arData[i]);	
//		}
		
		//10~1까지 중 짝수만 배열에 담고 출력
		//짝수 == 2의 배수
		//5칸 배열 선언
//		int[] arData = new int[5];
//		
		//0부터 배열길이까지 반복문
//		for (int i = 0; i < arData.length; i++) {
		//배열 칸에 10~1 중 짝수값 넣기
//			arData[i] = (5 - i) * 2;
//		}
//		
		//0부터 배열길이까지 반복문
//		for (int i = 0; i < arData.length; i++) {
		//배열 출력
//			System.out.println(arData[i]);
//		}
		
		
		//1~100까지 배열에 담은 후 홀수만 출력
//		//100칸 배열 선언		
//		int[] arData = new int[100];
//		
		//0부터 배열길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {//배열의 길이만큼 반복(100번), 0~99
//			//각 방에 1부터 100까지 순서대로 담는다
//			arData[i] = i+1;
//		}
//		
		//0부터 배열길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
		   	//2로 나눈 나머지가 1일 때
//			if(arData[i] % 2 == 1) {//홀수만 출력
			//배열 출력
//				System.out.println(arData[i]);
//			}
//			
				//2로 나눈 나머지가 0일 때 즉시 다음 반복
////			if(arData[i] % 2 == 0) {//짝수는 출력x
////				continue;
////			}
				//배열 출력
////			System.out.println(arData[i]);
//		}
		
//실버
		//1~100까지 배열에 담은 후 짝수의 합 출력
		//100칸 배열 선언
//		int[] arData = new int[100];
		//총합 변수 선언 초기화
//		int total = 0;
		//0부터 배열길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
		//각 배열 값에 +1하기
//			arData[i] = i + 1;
//		}
//		
		//0부터 배열길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
			//2로 나눈 나머지가 1일 때 즉시 다음 반복
//			if(arData[i] % 2 == 1) {
//				continue;
//			}
			//총합에 각각의 배열 더하고 대입
//			total += arData[i];
//				
				//2로 나눈 나머지가 0일 때 
////			if(arData[i] % 2 == 0) {
				//총합에 각각의 배열 더하고 대입
////				total += arData[i];
////			}
//		}
		//총합 출력
//		System.out.println(total);
		
		
		//A~F까지 배열에 담고 출력
		//6칸 char배열 선언
//		char[] arData = new char[6];
//		
			//0부터 배열길이만큼 반복문
////		for (int i = 0; i < arData.length; i++) {
				//배열에 값 넣기
////			arData[i] = (char)(65 + i);
////		}
//			
			//'A'부터 'G'까지 반복문
////		for(char i = 'A'; i < 'G'; i++) {
			//배열에 값 넣기
////			arData[i - 65] = i;
////		}
//		
		//65부터 71까지 반복문
//		for(char i = 65; i < 71; i++) {
			//배열에 값 넣기
//			arData[i - 65] = i;
//		}
//		
		//0부터 배열길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
			//배열 출력
//			System.out.println(arData[i]);
//		}
		
		
		//A~F까지 중 C 제외하고 배열에 담은 후 출력
		//5칸 char배열 선언
//		char[] arData = new char[5];
		//0부터 배열 길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
			//배열에 값 넣기(삼항연산자 사용)
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
		//0부터 배열 길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
			//배열 출력
//			System.out.println(arData[i]);
//		}
		
//골드
		//5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		//입력 메소드 
		Scanner sc = new Scanner(System.in);
		//5칸 int배열 선언
//		int[] arData = new int[5];
		//5개 정수 입력 메세지 선언
//		String msg = "5개 정수를 입력하세요, ex)1 2 3 4 5";
		//최대값, 최소값 선언
//		int max = 0, min = 0;
//
		//메세지 출력
//		System.out.println(msg);
		//0부터 배열 길이만큼 반복문
//		for (int i = 0; i < arData.length; i++) {
			//배열에 값 입력
//			arData[i] = sc.nextInt();
//		}
//		
		//최대값에 0번째 방 대입
//		max = arData[0];
		//최소값에 0번째 방 대입
//		min = arData[0];
//		
		//1부터 배열 길이만큼 반복문 (0번째 대입되어 있는 상태이므로)
//		for (int i = 1; i < arData.length; i++) {
			//최대값이 다음 인덱스값보다 작으면 그 값을 최대값으로 대입
//			if(max < arData[i]) { max = arData[i]; }
			//최소값이 다음 인덱스값보다 크면 그 값을 최소값으로 대입
//			if(min > arData[i]) { min = arData[i]; }
//		}
//		
		//최대값 출력
//		System.out.println("최대값 : "+max);
		//최소값 출력
//		System.out.println("최소값 : "+min);
		
//다이아
		//사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		//값도 모르고 칸도 아직 모름
		//입력메소드 임포트
		//int배열 선언
		int[] arData = null;
		//정수 개수 메세지, n번째 정수 메세지 선언
		String countMessage = "정수 개수 : ", msg = "번째 정수 : ";
		//총합 선언
		int total = 0;
		//평균 선언
		double avg = 0.0;
		
		//정수 개수 메세지 출력
		System.out.print(countMessage);
		//사용자가 입력한 정수만큼 배열 칸 할당
		arData = new int[sc.nextInt()];
		
		//0부터 배열 칸만큼 반복문
		for (int i = 0; i < arData.length; i++) {
			//칸마다 n번째 정수 입력할 수 있도록 메세지 출력
			System.out.print(i + 1 + msg);//연산, 연결
			//사용자가 입력한 정수를 배열 순서대로 넣는다
			arData[i] = sc.nextInt();
		}
		
		//0부터 배열 길이만큼 반복문
		for (int i = 0; i < arData.length; i++) {
			//총합에 각 배열값 더하고 대입
			total += arData[i];
		}
		
		//총합을 배열 길이만큼 나누고 실수형 형변환해서 평균 대입
		avg = (double) total / arData.length;
		//소수점 둘째짜리까지 나누기 위해서, String 클래스의 format 메소드를 사용한다
		avg = Double.parseDouble(String.format("%.2f", avg));
		//평균 출력
		System.out.println(avg);
				
	}

}
