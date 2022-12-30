package classTest;

import java.util.Scanner;

class SuperCar1 {
//	브랜드, 색상, 가격 (인스턴스 변수)
	String brand;
	String color;
	int price;
	int pw;
	
	public SuperCar1(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


	//내부적으로 사용하는 변수
	boolean check; // 자동초기화, 초기값 false(시동 꺼져있다는 뜻)
	 
//  시동 켜기
//  시동의 상태를 확인하고 
//  시동이 꺼져있다면, "시동 켜기" 출력
//  이미 시동이 켜져있다면, "시동이 이미 켜져있습니다" 출력
  
	boolean engineOn(boolean carCheck) {
		if(check == carCheck) {
			carCheck = true;
		}else {
			carCheck = false;
		}
		return carCheck;
	}
	
//  시동 끄기
//  시동의 상태를 확인하고 
//  시동이 켜져있다면, "시동 끄기" 출력
//  이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다" 출력
	
	boolean engineOff(boolean carCheck) {
		if(check != carCheck) {
			carCheck = true;
		}else {
			carCheck = false;
		}
		return carCheck;
	}
	
//	[심화]
//	시동을 켜기 위해서는 비밀번호 4자리를 입력해야 한다.
//	입력한 비밀번호가 3번 연속 실패하면 "경찰 출동" 메시지를 출력한다
	
	boolean inputPw(int pw){
		boolean login = false;
		int count = 0;
				
		for (int i = 0; i < 3; i++) {
			if(this.pw == pw) {
				login = true;
			}else {
				count++;
				if(count == 2)
				login = false;
			}
			
		}
		return login;
	}
	
	
}

public class Shop {
	public static void main(String[] args) {
		
		SuperCar1 sc = new SuperCar1("sonata", "white", 2000);
		Scanner scan = new Scanner(System.in);
		String msg = "비밀번호 4자리 입력 : ";
		int pw = 0;
//		int pw1 = 1234;
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print(msg);
//			pw = scan.nextInt();
//			if(pw1 == pw) {
//				//시동켜기
//				break;
//			}else {
//				if(i != 2) {
//					System.out.println("비밀번호 틀림. 남은 기회 : " + (2-i));
//				}else {
//					System.out.println("경찰출동");
//				}
//			}
//			
//		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(msg);
			pw = scan.nextInt();
			sc.inputPw(pw);
		}
		
		
		
		if(sc.engineOn(true)) {
			
			System.out.println("시동 켜기"); //false //시동이 꺼져있다면, "시동 켜기" 출력
		}else {
			System.out.println("시동이 이미 켜져있습니다"); //true //이미 시동이 켜져있다면, "시동이 이미 켜져있습니다" 출력
		}
		
		if(sc.engineOff(true)) {
			System.out.println("시동 끄기"); //true //시동이 켜져있다면, "시동 끄기" 출력
		}else {
			System.out.println("시동이 이미 꺼져있습니다"); //false //이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다" 출력
		}
		
	}
}
