package aug04;

import java.util.Scanner;

class SuperCar{
	//브랜드, 색상, 가격 선언 (인스턴스 변수)
	String brand;
	String color;
	int price;
	//비밀번호 선언
	String password;
	
	//차 상태 확인하는 변수 선언
	boolean check;
	
	//기본생성자, 저장된 비밀번호 값 대입
	//초기 비밀번호는 0000으로 초기화
	public SuperCar(){
		this.password = "0000";
	}
	
	//사용자가 입력받은 비밀번호를 매개변수로 갖는 생성자
	//저장된 비밀번호가 입력한 비밀번호랑 같다
	public SuperCar(String password){
		this.password = password;
	}

	//변수를 전부 초기화할 수 있는 생성자
	public SuperCar(String brand, String color, int price, String password) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
	
	
	//engineStart 메소드 선언
	//check가 false일 때 들어옴
	//시동이 꺼져있다면, 시동을 켜준다(check를 true로 바꿔준다)
	//시동 켜기 성공(true 리턴)
	//시동 켜기 실패(false 리턴)
	boolean engineStart() {
		if(!check) {
			check = true;
			return true;
		}
		return false;
	}
	
	//engineStop 메소드 선언
	//시동이 켜져 있을 때 들어옴
	//시동 끄기 성공
	//시동 끄기 실패(이미 꺼져 있음)
	boolean engineStop() {
		if(check) {
			check = false;
			return true;
		}
		return false;
	}
	
	
	//비밀번호 체크하는 메소드
	//외부에서 사용자가 입력한 비밀번호를 매개변수로 전달받는다.
	//저장된 비밀번호와 입력된 비밀번호를 비교하여 리턴하기(맞으면 true, 틀리면 false)
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
}

public class ShopReview {
	public static void main(String[] args) {
		//SuperCar라는 추상적인 개념을 ferriari라는 구체적인 객체로 객체화
		SuperCar ferriari = new SuperCar();
		
		//시동을 키고, 끄는 메세지, 비밀번호 입력 메세지, 비밀번호 선언, 초기화
		String msg = "1.시동켜키\n2.시동끄기", pwMsg = "비밀번호 입력 : ", password = null;
		//입력 메소드 임포트
		Scanner sc = new Scanner(System.in);
		//입력받은 값을 담을 변수, 횟수 선언
		int choice = 0, count = 0;
		//엔진이 꺼졌을 때 종료하기 위한 변수 선언
		boolean stopedEngine = false;
		
		//한번은 무조건 실행
		//시동 키고 끄는 메세지 출력
		//입력값을 변수에 담기
		do{
			System.out.println(msg);
			choice = sc.nextInt();
		
		
		//얼마나 반복될 지 알 수 없을 때 쓰는 반복문
		//1번 상황
			switch(choice) {
			case 1:
				//시동이 꺼져있다면
				//비밀번호 입력 메세지 출력
				//입력값을 변수에 대입
				//입력한 비밀번호가 저장된 비밀번호와 같다면
				//엔진키는 메소드 사용
				//비밀번호 시도 횟수 초기화
				//시동켜짐 출력
				if(!ferriari.check) {
					System.out.print(pwMsg);
					password = sc.next();
					if(ferriari.password.equals(password)) {
						ferriari.engineStart();
						count = 0;
						System.out.println("시동 켜짐");
					}else {
						count++;
						System.out.println("비밀번호 오류 "+count+"회");
						if(count == 3) {
							System.out.println("경찰 출동");
						}
					}
					break;
				}
				
				//입력된 비밀번호가 저장된 비밀번호와 같지 않다면
				//비밀번호 시도 횟수 1 증가
				//비밀번호 시도 횟수 및 비밀번호 오류 메세지 출력 
				//시도가 연속 3번째라면
				//경찰 출동 출력
				//반복문 탈출
				
				//if문에 안들어갈 경우 = 시동이 켜져있는 경우
				//이미 시동이 켜져있습니다 출력
				//반복문 탈출
				System.out.println("이미 시동이 켜져있습니다");
				break;
			case 2:
				//2번 상황 
				//엔진이 꺼졌으면,
				//시동끄기를 시도한 결과를 stopedEngine Flag에 담아준다.
				//시동꺼짐 출력
				//반복문 탈출
				if(stopedEngine = ferriari.engineStop()) {
					System.out.println("시동 꺼짐");
					break;
				}
				
				//if문에 들어가지 않음 > 이미 시동꺼짐 출력
				//반복문 탈출
				System.out.println("이미 시동이 꺼져있습니다");
				break;
			}
		
		
		//반복이 종료되는 경우 : 엔진이 꺼지거나, 비밀번호 시도 횟수가 3번일 때, 
		}while(!stopedEngine && count != 3);
		
		
		
		
	}
}
