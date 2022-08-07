package aug02;

public class Pm {
	
//  1~10까지 println()으로 출력하는 메소드
	//메소드 선언
	//1~10까지 반복문
	//1~10까지 출력
	void print1to10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
//  "홍길동"을 n번 println()으로 출력하는 메소드
	//메소드 선언, 매개변수 필요(n번)
	//0부터 n번까지 반복문
	//"홍길동"출력
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}
	
	
//  이름을 n번 println()으로 출력하는 메소드
	//메소드 선언, 매개변수 필요(이름, n번)
	//0부터 n번까지 반복문
	//이름 출력
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
//  세 정수의 뺄셈을 해주는 메소드
	//메소드 선언, 매개변수(세 정수)
	//세 정수의 뺄셈값 리턴
	int sub(int num1, int num2, int num3) {
		return num1-num2-num3;
	}
	
	
//  두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다)
	//메소드 선언, 매개변수(두 정수)
	//리턴 값이 2개이므로 배열에 담기, 배열 선언
	int[] divide(int num1, int num2) {
		int[] res = null;
		
		if(num2 != 0) {
			res = new int[2];
			
			res[0] = num1 / num2;
			res[1] = num1 % num2;
			
		}
		return res;
	}
	
	//분모가 0이 아니라면
	//배열 칸수 생성
	
	//배열 0칸에 몫 대입
	//배열 1칸에 나머지 대입
	
	//결과값 리턴
	
	
	public static void main(String[] args) {
		//메소드의 소속 알려주기
		Pm pm = new Pm();
		//선언한 메소드 사용하기
		pm.print1to10();
		pm.printHong(2);
		pm.printName("나비", 3);
		System.out.println(pm.sub(6, 1, 1));
		
		//divide 메소드 리턴값은 int배열이므로 배열 선언해서 리턴값 대입 
		int[] res = pm.divide(20, 0);
		//메세지 변수 선언(초기화 시, 대입할 땐 null / 누적 연산할 땐 "")
		String msg = null;
		//메세지는 리턴값이 null일 때 "0으로 나눌 수 없습니다", null이 아닐 때는 몫과 나머지 값 대입
		msg = res == null ? "0으로 나눌 수 없습니다" : "몫 : "+res[0]+"\n나머지 : "+res[1];
		
		//메시지 출력
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
