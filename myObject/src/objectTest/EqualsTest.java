package objectTest;

class Employee{
	int number;
	String name;
	
	public Employee() {;}

	public Employee(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	//주소비교
	//타입비교
	//다운캐스팅해서 값비교

	@Override
	//obj는 Object에 up casting 되었기 때문에 Employee에 새롭게 만든 number와 name은 Object에 없다.
	public boolean equals(Object obj) {
		//주소비교
		if(this == obj) {return true;} // 주소가 같으면 true
		
		//타입비교
		if(obj instanceof Employee) { //사원 타입이니?
			//down casting 해서 number와 name 복구함.
			Employee anotherEmployee = (Employee)obj; 
			
			//번호끼리 비교해서 같은지 다른지 확인
			if(this.number == anotherEmployee.number) {
				return true;
			}
			//이름은 안해도 되나???
		}
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Employee han = new Employee(1, "한동석");
		han.equals(new Employee(1, "한동석")); 
		//Object에서 선언된 equals > 주소값 비교
		
		System.out.println(han.equals(new Employee(1, "한동석")));
		//같은 사람이여도 서로 다른 필드니까 false
		//재정의하면 true
		
		
		
		
		
		//선언방식1 : 필드의 주소가 아니라 상수의 주소를 연산(비교)할 때 쓰겠다.
//		String data1 = "ABC";
//		String data2 = "ABC";
		//선언방식2 : new로 선언하면, 상수의 주소보다 필드의 주소로 먼저 비교하겠다.
//		String data3 = new String("ABC");
//		String data4 = new String("ABC");
//		
		//필드의 주소 비교가 아니라 상수의 주소를 비교하기 때문에 true
//		System.out.println(data1 == data2); //true
//		System.out.println(data1.equals(data2));//true
		//Object에 선언되어 있는 equals는 주소값 비교
		//비교할 때는 필드 안에 있는 값을 비교함
		//문자열 클래스는 equals를 재정의해서 사용 >> 문자열 클래스에서만 equals는 값 비교!!!!
//		System.out.println(data3 == data4); //필드 주소를 비교 해서 false
//		System.out.println(data3.equals(data4)); //값 비교를 하기 때문에 true
		
		//------------------------------------------
		
//		Random r1 = new Random(); 
//		Random r2 = new Random();//필드가 2개 만들어졌으니까, 주소도 2개 만들어짐.
//		
//		System.out.println(r1 == r2); //false
//		System.out.println(r1.equals(r2));//false
//		
//		r1 = r2; //r1에다가 r2의 주소값 대입
//		System.out.println(r1 == r2); //true
//		System.out.println(r1.equals(r2)); //true
		
	}

}
