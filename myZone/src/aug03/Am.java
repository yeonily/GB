package aug03;

import java.util.Scanner;

public class Am {

// 1~n까지의 합을 구해주는 메소드
	// 메소드 선언, 매개변수(n까지)
	// 총합을 담을 변수 선언
	// 0부터 n까지 반복문
	// 변수에 총합 담기
	// 총합 리턴
	int plus(int number) {
		int total = 0;
		for (int i = 0; i < number; i++) {
			total += i + 1;
		}
		return total;
	}

	
// 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	//메소드 선언, 매개변수(정수값)	
	//숫자에 1더해서 리턴
	int change (int number) {
		return ++number;
	}
	
	
// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	//메소드 선언, 매개변수(문자열)
	//결과값을 담을 변수 선언
	//0부터 문자열길이만큼 반복
	//문자열에서 추출한 문자를 변수에 담기
	//문자가 대문자라면
	//소문자로 바꾸고 결과값에 누적대입
	//문자가 소문자라면
	//대문자로 바꾸고 결과값에 누적대입
	//그외
	//그대로 결과값에 대입
	//결과값 리턴
	String change(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90) {
				result += (char)(c + 32);
			}else if(c >= 97 && c <= 122) {
				result += (char)(c - 32);
			}else {
				result += c;
			}
		}
		return result;
	}
	
	
// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	//메소드 선언, 매개변수(문자열, 원하는 문자)
	//개수 변수 선언
	//0부터 문자열 길이만큼 반복문
	//문자열에서 추출한 문자가, 원하는 문자와 같다면
	//개수+1
	//개수 리턴
	int getCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	
// 5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
	//메소드 선언, 매개변수(정수배열, 원하는 번째 숫자)
	//배열에서 원하는 칸의 값 리턴 >> 리턴타입은 int
	int getValue(int[] nums, int ordinal) {
		return nums[ordinal - 1];
	}
	
	
// 한글을 정수로 바꿔주는 메소드(일공이사 -> 1024), indexOf() 사용	
	//메소드 선언, 매개변수(문자열)
	//인덱스번호로 사용할 문자열, 결과변수 선언
	//0부터 문자열의 길이만큼 반복문
	//입력받은 문자열의 문자를 추출하여 그 문자의 인덱스 값을 결과변수에 누적대입
	//결과값 리턴, indexOf 타입은 int 이므로 형변환
	int changeNum(String hangleNum) {
		String hangle = "공일이삼사오육칠팔구", result = "";
		for (int i = 0; i < hangleNum.length(); i++) {
			result += hangle.indexOf(hangleNum.charAt(i));
		}
		return Integer.parseInt(result);
	}
	
	
// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	//메소드 선언, 매개변수(정수 배열)	
	//결과 배열 선언
	//결과 배열 0번 칸(최대값)에 매개변수 0번 칸 대입
	//결과 배열 1번 칸(최소값)에 매개변수 0번 칸 대입
	//1부터 배열의 길이만큼 반복문
	//결과 배열 0번칸이 정수배열 칸보다 작다면 그 값을 결과 배열에 대입
	//결과 배열 1번칸이 정수배열 칸보다 크다면 그 값을 결과 배열에 대입
	//결과값 리턴
	int[] getMaxAndMin(int[] arData) {
		int[] results = new int[2];
		results[0] = arData[0];
		results[1] = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(results[0] < arData[i]) {
				results[0] = arData[i];
			}
			if(results[1] > arData[i]) {
				results[1] = arData[i];
			}
		}
		return results;
	}
	
	
// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void로 하되, 출력 없이 사용하는 부분에 결과를 전달한다)
	//메소드 선언, 매개변수(정수배열, 결과배열)
	//결과배열 0번 칸(최대값)에 매개변수 0번 칸 대입
	//결과배열 1번 칸(최소값)에 매개변수 0번 칸 대입
	//1부터 정수배열 길이만큼 반복문
	//결과 배열 0번칸이 정수배열 칸보다 작다면 그 값을 결과 배열에 대입
	//결과 배열 1번칸이 정수배열 칸보다 크다면 그 값을 결과 배열에 대입
	void getMaxAndMin(int[] arData, int[] results) {
		results[0] = arData[0];
		results[1] = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(results[0] < arData[i]) {
				results[0] = arData[i];
			}
			if(results[1] > arData[i]) {
				results[1] = arData[i];
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Am am = new Am();
		
		am.plus(5); //return타입이 있는 경우 : 값으로 보기
		System.out.println(am.plus(10));
		
		boolean result = am.change(10) % 2 == 0;
		System.out.println(result ? "홀수에서 짝수로 바뀜" : "짝수에서 홀수로 바뀜");
		
		System.out.println(am.change("skdjfSDF:03"));
		
		System.out.println(am.getCount("banana", 'a')+"개");
		
		int[] arData = {1, 2, 5, 3, 4};
		System.out.println(am.getValue(arData, 4));
		
		System.out.println(am.changeNum("구팔칠이"));
		int resultNum = am.changeNum("이삼구");
		System.out.println(resultNum - 5);
		
		int[] results = new int[2];
				results = am.getMaxAndMin(arData);
		
			for (int i = 0; i < results.length; i++) {
				System.out.println(results[i]);
			}
			
			
		am.getMaxAndMin(arData, results);	
		System.out.println("최대값 : " + results[0]);
		System.out.println("최소값 : " + results[1]);
			
	}

}
