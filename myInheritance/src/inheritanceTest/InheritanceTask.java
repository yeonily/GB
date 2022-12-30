package inheritanceTest;

class Car{
	//브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	
	//기본 생성자
	public Car() {}
	
	//초기화 생성자
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//열쇠로 시동 킴
	void engineOn() {
		System.out.println("열쇠로 시동 킴");
	}
	//열쇠로 시동 끔
	void engineOff() {
		System.out.println("열쇠로 시동 끔");
		
	}
	
}

//자동차 상속받음
class SuperCar extends Car{
	//모드
	String mode;
	
	//자식 기본 생성자는 부모의 기본 생성자를 호출한다.
	//부모에 기본 생성자가 없으면 자식의 기본 생성자는 오류가 발생한다.
	public SuperCar() {
		super();
	}
	
	//초기화 생성자
	public SuperCar(String brand, String color, int price, String mode) {
		//부모의 생성자 중 3개의 값을 전달하는 생성자 호출
		super(brand, color, price);
		this.mode = mode;
	}

	//음성으로 시동 킴
	@Override
	void engineOn() {
		super.engineOn(); //메소드임, 꼭 맨 위에 위치할 필요 없음.
		System.out.println("음성으로 시동 킴");
	}
	
	//음성으로 시동 끔
	@Override
	void engineOff() {
		System.out.println("음성으로 시동 끔");
	}
	
	//지붕 열기
	void openRoof() {
		System.out.println("지붕 열기");
	}
	//지붕 닫기
	void closeRoof() {
		System.out.println("지붕 닫기");
		
	}
}


public class InheritanceTask {
	public static void main(String[] args) {
		//SuperCar 객체 만들기(객체화)
		SuperCar rollsroyce = new SuperCar();
//		Car sonata = new Car();

		rollsroyce.engineOn();
		rollsroyce.engineOff();
		rollsroyce.openRoof();
		rollsroyce.closeRoof();
		
		
	}
}
