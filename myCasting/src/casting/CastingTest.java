package casting;

class Car{
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
}

class SuperCar extends Car{
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("지붕 열기");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		//up casting
		Car noOptionFerrari = new SuperCar();
		//모든 자식은 부모타입이므로 양 쪽 같은 타입
		//업캐스팅(자식타입에만 있는 코드는 없어지고, 오버로딩된 것은 자식값으로 들어감)
		noOptionFerrari.engineStart();
		//자식에서 재정의된 값이 들어감
		
//		SuperCar brokenFerrari = new Car();
//		//자식타입에 부모를 담으려고 해서 타입이 달라서
//		String a = 10; << 이거랑 똑같음
		
		//오류
//		SuperCar brokenFerrari = (SuperCar) new Car();
		//강제 형변환으로 타입 맞춰주기, BUT 메모리에 할당되지 않아서 오류
		
		//down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		//강제 형변환으로 타입 맞춰주기, 다운캐스팅
		//supercar로 형변환 되면서 메모리가 다 채워짐.
		//자식타입에서 새롭게 만든 코드들도 사용 가능
		fullOptionFerrari.openRoof();
		
		
//		matiz instanceof Car : true
		System.out.println(matiz instanceof Car);
//		matiz instanceof SuperCar : false
		System.out.println(matiz instanceof SuperCar);
//		ferrari instanceof Car : true
		System.out.println(ferrari instanceof Car);
//		ferrari instanceof SuperCar : true
		System.out.println(ferrari instanceof SuperCar);
//		noOptionFerrari instanceof Car : true
		System.out.println(noOptionFerrari instanceof Car);
//		noOptionFerrari instanceof SuperCar : true
		System.out.println(noOptionFerrari instanceof SuperCar); //noOptionFerrari 자식값이 들어가 있음, SuperCar가 SuperCar타입인지 묻는 것임
																	//타입은 카타입으로 변화가 되었지만 쓸때는 SuperCar 값이기 때문에 true가 나옴
							//└저장공간, new SuperCar() 주소값이 담겨 있으므로 
							//업캐스팅 객체는 두 타입 모두 정답
//		fullOptionFerrari instanceof Car : true
		System.out.println(fullOptionFerrari instanceof Car);
//		fullOptionFerrari instanceof SuperCar : true
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
		
		
		
		
		
	}

}
