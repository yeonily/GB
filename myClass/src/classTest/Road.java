package classTest;

class Car {
	//한번만 선언해서 여러번 사용하려고
	//필드(변수, 메소드)
	
	//전역변수는 자동으로 초기화
	String brand;
	String color;
	int price;
	
	//생성자 단축키 : alt + shift + s > o
	public Car(String brand, String color, int price) {
		this.brand = brand; //정확하게 알려줘야 할 때는 적어주어야 함
		this.color = color;
		this.price = price;
	}
	
	

	public Car(String color) {
		//brand에는 자동으로 초기화된 값이 출력됨. 이 생성자를 사용할 때 초기값을 이 영역에서 정해줌
		brand = "자동차"; // this. >> 생략가능
		this.color = color;
	}



//	Car(String brand, String color, int price){
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//	}
	
	void engineStart() {
		System.out.println(brand + " 시동 켜기");
	}

	void engineStop() {
		System.out.println(brand + " 시동 끄기");
	}
}


public class Road {
	//main
	//실행 프로그램을 만들어주는 메소드
	public static void main(String[] args) {
		Car momCar = new Car("Benz", "Black", 10_000);
		Car daddyCar = new Car("BMW", "Blue", 8_000);
		Car myCar = new Car("Red");
		
//		momCar.brand = "Benz";
//		momCar.color = "black";
//		momCar.price = 10_000; //정수사이의 언더바는 컴파일러가 읽지 않음(쉼표 개념)
//		
//		daddyCar.brand = "BMW";
//		daddyCar.color = "Blue";
//		daddyCar.price = 8_000;
		
		momCar.engineStart();
		daddyCar.engineStart();
		myCar.engineStart();
		
		
		
		
	}
	
	
	
}
