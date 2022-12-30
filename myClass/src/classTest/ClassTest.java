package classTest;

class A {
	
//	int data = 100;
	int data;
	
	A(){}
	
	//직접 생성자 선언 >> 기본 생성자 없어져서 만들어줘야 함.
	A(int data){
		this.data = data;
	}

	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		//내가 만든 클래스의 필드에 접근할 때는 그 클래스 타입으로 객체화를 하고
		//A클래스의 객체를 여러개 만들 수 있음. 클래스는 한번만 선언
		A a = new A(); //매개변수가 필드에 있는 변수의 초기화 값임. 초기화를 생성자로 함. 
		//a는 주소값 대입 >> 객체
		//값이 들어가 있으면 >> 변수
		
		System.out.println(a.data);
		//객체화를 통해 만든 객체를 통해 마침표로 접근을 해서 값을 수정, 사용 가능
		a.data = 10; // 주소에 있는 데이터에 10을 대입 
		a.printData();
		
	}

}
