package aug01;

import java.util.Scanner;

public class Pm {

	public static void main(String[] args) {
// 1~10까지 배열에 담고 출력
		// 10칸 배열 선언
		// 0부터 배열의 길이만큼 반복문
		// 배열 칸마다 +1하기
		int[] ar1 = new int[10];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = i + 1;
		}

		// 0부터 배열의 길이만큼 반복문
		// 배열의 값 출력하기
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}

		
// 10~1까지 중 짝수만 배열에 담고 출력
		// 짝수 == 2의 배수
		// 5칸 배열 선언
		//0부터 배열길이까지 반복문
		//배열 칸에 10~1 중 짝수값 넣기
		int[] ar2 = new int[5];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = (5-i) * 2;
		}
		
		//0부터 배열길이까지 반복문
		//배열 출력
		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}
		
		
//1~100까지 배열에 담은 후 홀수만 출력
		//100칸 배열 선언		
		//0부터 배열길이만큼 반복문
		//각 방에 1부터 100까지 순서대로 담는다
		int[] ar3 = new int[100];
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = i+1;
		}
		
		//0부터 배열길이만큼 반복문
		//2로 나눈 나머지가 1일 때
		//배열 출력
		for (int i = 0; i < ar3.length; i++) {
//			if(ar3[i] % 2 == 1) {
//				System.out.println(ar3[i]);
//			}
			
			if(ar3[i] % 2 == 0) {
				continue;
			}
			System.out.println(ar3[i]);
		}
		
		//2로 나눈 나머지가 0일 때 즉시 다음 반복
		//배열 출력
		
		
		
//1~100까지 배열에 담은 후 짝수의 합 출력
		//100칸 배열 선언
		//총합 변수 선언 초기화
		//0부터 배열길이만큼 반복문
		//각 배열 값에 +1하기
		int[] ar4 = new int[100];
		int total = 0;
		for (int i = 0; i < ar4.length; i++) {
			ar4[i] = i+1;
		}
		
		//0부터 배열길이만큼 반복문
		//2로 나눈 나머지가 1일 때 즉시 다음 반복
		//총합에 각각의 배열 더하고 대입
		for (int i = 0; i < ar4.length; i++) {
			if(ar4[i] % 2 == 1) {
				continue;
			}
			if(ar4[i] % 2 == 0) {
				total += ar4[i];
			}
		}
		System.out.println(total);
		
		//2로 나눈 나머지가 0일 때 
		//총합에 각각의 배열 더하고 대입
		
		//총합 출력
		
		
//A~F까지 배열에 담고 출력
		//6칸 char배열 선언
		char[] ar5 = new char[6];
		//0부터 배열길이만큼 반복문
		//배열에 값 넣기
		for (int i = 0; i < ar5.length; i++) {
			ar5[i] = (char)(i+65);
		}
		//'A'부터 'G'까지 반복문
		//배열에 값 넣기
		for (char i = 'A'; i < 'G'; i++) {
			ar5[i - 65] = i; 
		}
		
		//65부터 71까지 반복문
		//배열에 값 넣기
		for (char i = 65; i < 71; i++) {
			ar5[i - 65] = i;
		}
		
		//0부터 배열길이만큼 반복문
		//배열 출력
		for (int i = 0; i < ar5.length; i++) {
			System.out.println(ar5[i]);
		}
		
//A~F까지 중 C 제외하고 배열에 담은 후 출력
		//5칸 char배열 선언
		//0부터 배열 길이만큼 반복문
		//배열에 값 넣기(삼항연산자 사용)
		char[] ar6 = new char[5];
		for (int i = 0; i < ar6.length; i++) {
			ar6[i] = (char)(i > 1 ? i + 66 : i + 65);
		}
		
		//0부터 배열 길이만큼 반복문
		//배열 출력
		for (int i = 0; i < ar6.length; i++) {
			System.out.println(ar6[i]);
		}
		
//5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		//입력 메소드 
		//5칸 int배열 선언
		//5개 정수 입력 메세지 선언
		//최대값, 최소값 선언
		Scanner sc = new Scanner(System.in);
		int[] ar7 = new int[5];
		String inputM = "5개 정수 입력 : ";
		int max = 0, min = 0;
		
		//메세지 출력
		//0부터 배열 길이만큼 반복문
		//배열에 값 입력
		System.out.print(inputM);
		for (int i = 0; i < ar7.length; i++) {
			ar7[i] = sc.nextInt();
		}
		
		//최대값에 0번째 방 대입
		//최소값에 0번째 방 대입
		max = ar7[0];
		min = ar7[0];
		
		//1부터 배열 길이만큼 반복문 (0번째 대입되어 있는 상태이므로)
		//최대값이 다음 인덱스값보다 작으면 그 값을 최대값으로 대입
		//최소값이 다음 인덱스값보다 크면 그 값을 최소값으로 대입
		for (int i = 1; i < ar7.length; i++) {
			if(max < ar7[i]) {max = ar7[i];}
			if(min > ar7[i]) {min = ar7[i];}
		}
		
		//최대값 출력
		//최소값 출력
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
//사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		//값도 모르고 칸도 아직 모름
		//입력메소드 임포트
		//int배열 선언
		//배열 개수 메세지, n번째 정수 메세지 선언
		//총합 선언
		//평균 선언
		int[] ar8 = null;
		String arM = "배열의 수 : ", numM = "번째 수 : ";
		int sum = 0;
		double avg = 0.0;
		
		//정수 개수 메세지 출력
		//사용자가 입력한 정수만큼 배열 칸 할당
		System.out.print(arM);
		ar8 = new int[sc.nextInt()];
		
		//0부터 배열 칸만큼 반복문
		//칸마다 n번째 정수 입력할 수 있도록 메세지 출력
		//사용자가 입력한 정수를 배열 순서대로 넣는다
		for (int i = 0; i < ar8.length; i++) {
			System.out.print(i+1+numM);
			ar8[i] = sc.nextInt();
		}
		
		//0부터 배열 길이만큼 반복문
		//총합에 각 배열값 더하고 대입
		for (int i = 0; i < ar8.length; i++) {
			sum += ar8[i];
		}
		
		//총합을 배열 길이만큼 나누고 실수형 형변환해서 평균 대입
		//소수점 둘째짜리까지 나누기 위해서, String 클래스의 format 메소드를 사용한다
		//평균 출력
		avg = (double)sum / ar8.length;
		avg = Double.parseDouble(String.format("%.2f", avg));
		System.out.println(avg);
		
		
		
	}

}
