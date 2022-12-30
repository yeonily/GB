package methodTest;

import java.util.Scanner;

public class MethodTask {
	//1부터 10까지 println()으로 출력하는 메소드
	void printTen() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	//"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int printNum) {
		for (int i = 0; i < printNum; i++) {
			System.out.println("홍길동");
		}
	}
	
	//이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int number) {
		for (int i = 0; i < number; i++) {
			System.out.println(name);
		}
	}
	
	//세 정수의 뺄셈을 해주는 메소드
	int minus(int num1, int num2, int num3) {
		return num1-num2-num3;
	}
	
	//두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다)
	int[] div(int num1, int num2) {
		int[] result = new int[2];
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다");
		}else {
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		return result; 
	}
	
	
	
//  1~n까지의 합을 구해주는 메소드
	int sum(int number) {
		int total = 0;
		for (int i = 0; i < number; i++) {
			total += i+1;
		}
		return total;
	}
	
//  홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int change(int number) {
		return number + 1;
	}
	
//  문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeAlpha(String data) {
		String change = ""; 
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if(c >= 'a' && c <= 'z'){
				change += (char)(c - 32);
			}else if(c >= 'A' && c <= 'Z') {
				change += (char)(c + 32);
			}else {
				change += c;
			}
		}
		return change;
	}
	
//  문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	//apple p가 몇개니
	int count(String data, char alpha) {
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if(data.charAt(i) == alpha) {
				count++;
			}
		}
		return count;
	}
	
//  5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
	int countNum(int num1, int num2, int num3, int num4, int num5, int index) {
		int[] nums = {num1, num2, num3, num4, num5};
		int number = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(i == index-1) {//배열이 count 번째일 때
				number = nums[i];
			}
		}
		return number;
	}
	
	int countNum(int[] ar, int index) {
		int[] nums = ar;
		int number = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(i == index-1) {
				number = nums[i];
			}
		}
				
		return number;
	}
	
//  한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024), indexOf() 사용
	String change(String data) {
		String number = "공일이삼사오육칠팔구", changed = "";
		for (int i = 0; i < data.length(); i++) {
			changed += number.indexOf(data.charAt(i))+"";
		}
		return changed;
	}
	
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] maxMin(int num1, int num2, int num3, int num4, int num5) {
		int[] nums = {num1, num2, num3, num4, num5};
		int max = nums[0]; 
		int min = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if(max < nums[i]) {max = nums[i];}
			if(min > nums[i]) {min = nums[i];}
		}
		
		int[] result = {max, min}; 
		
		return result;
	}
	
	int[] getMaxandMin(int[] ar) {
		int[] nums = ar;
		int max = nums[0]; 
		int min = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if(max < nums[i]) {max = nums[i];}
			if(min > nums[i]) {min = nums[i];}
		}
		
		int[] result = {max, min}; 
		
		return result;
	}
	
	
//	어려움★★★★★
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void로 하되, 출력 없이 사용하는 부분에 결과를 전달한다)
//	매개변수는 2개 전달해야 한다.
//	예) getMaxandMin();
//		여기서부터 최대값, 최소값 사용 가능
//		getMaxandMin(arData, results);
//		results[0], results[1];
	
	void getMaxandMin(int[] arData, int[] results) {
		int[] nums = arData;
		int max = nums[0]; 
		int min = nums[0];
		int[] res = results;
		
		for (int i = 1; i < nums.length; i++) {
			if(max < nums[i]) {max = nums[i];}
			if(min > nums[i]) {min = nums[i];}
		}
		
		res[0] = max; 
		res[1] = min; 
		
	}
	
	
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
		
//		mt.printTen();
//		mt.printHong(2);
//		mt.printName("d" ,6);
//		int result = mt.minus(5, 10, -1);
//		int[] result = mt.div(9, 0);
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//			
//		}
		
		System.out.println(mt.sum(10));
		System.out.println(mt.change(110516));
		System.out.println(mt.changeAlpha("asdfoCOKDF12"));
		System.out.println(mt.count("apple", 'p'));
		System.out.println(mt.countNum(10, 20, 30, 40, 50, 3));
		
		String message = "5개 정수 입력 : ";
		int[] nums = new int[5];
		System.out.print(message);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(mt.countNum(nums, 5));
		
		System.out.println(mt.change("일이육"));
		
		int[] output = mt.maxMin(5, 10, 20, 9, 1);
		System.out.println("최대값 : " +output[0]);
		System.out.println("최소값 : " +output[1]);
		
		
		String msg = "번째 정수 입력 : ";
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(i+1+msg);
			numbers[i] = sc.nextInt();
		}
		int[] maxMin = mt.getMaxandMin(numbers);
		System.out.println("최대값 : " +maxMin[0]);
		System.out.println("최소값 : " +maxMin[1]);
		
		
		int[] ar = new int[5];		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(i+1+msg);
			ar[i] = sc.nextInt();
		}
		int[] results = {0, 0};
		mt.getMaxandMin(ar, results);
		System.out.println("최대값 : " +results[0]);
		System.out.println("최소값 : " +results[1]);
		
	}

}
