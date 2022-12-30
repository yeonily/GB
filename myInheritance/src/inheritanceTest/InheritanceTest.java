package inheritanceTest;

class A{
	String name = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	//상속!! 자식클래스에서 없는 필드는 부모에서 찾을 수 있어야 한다
	
	//기본 생성자
	public B() {
		super(); //클래스 뒤에 super(부모)호출, 무조건 메모리에 먼저 올라감
		name = "B";
		System.out.println("자식");
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		
		//객체화 : B (자식) 필드를 메모리에 올림
		B b = new B();
		b.printName(); //A클래스에서 선언
		b.printData(); //B클래스에서 선언
		
	}
}
