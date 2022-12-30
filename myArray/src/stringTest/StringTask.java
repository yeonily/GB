package stringTest;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
//      사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
		Scanner sc = new Scanner(System.in);
		String msg = "입력 : ", data = "", change = "";
		
		System.out.print(msg);
		data = sc.nextLine();
		
		for (int i = 0; i < data.length(); i++) {
			if(data.charAt(i) >= 'a' && data.charAt(i) <= 'z'){
				change += (char)(data.charAt(i) - 32);
			}else if(data.charAt(i) >= 'A' && data.charAt(i) <= 'Z') {
				change += (char)(data.charAt(i) + 32);
			}else {
				change += data.charAt(i);
			}
			
		}
		System.out.println(change);
      
//      정수를 한글로 변경
//      예) 1024
//        -> 일공이사 
		
		String korNumber = "공일이삼사오육칠팔구", beforeValue = "", afterValue = "";
		System.out.print(msg);
		beforeValue = sc.nextLine();
		for (int i = 0; i < beforeValue.length(); i++) {
			afterValue += korNumber.charAt(beforeValue.charAt(i)-48); 
		}
		System.out.println(afterValue);
		
	}

}
