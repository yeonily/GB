package objectTest;

import java.util.Random;

class Student{
	int number;
	String name;
	
	//기본 생성자
	public Student() {}

	//초기화 생성자
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	//실무에서도 클래스를 만들었다면, 반드시 toString 재정의 해야 함.
	@Override
	public String toString() {
		return number + ") " + name;
	}
	
}



public class ToStringTest {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r);
		System.out.println(r.toString());
		//객체를 출력하니까 문자열 값이 나옴(toString 리턴값이 String)
		//@뒤에는 주소값
		//객체명 출력할 때 toString() 생략되어 있었음

		//부모클래스의 필드는 재정의 가능
		
		
		Student std = new Student(1, "한동석");
		System.out.println(std); // 뒤에 toString이 생략된 것임
		
		//객체명만 입력해도 초기화가 됐는지 안 됐는지 그 값이 나왔으면 좋겠음 
		// >> toString 재정의해서 사용(내가 원하는 값이 출력되게끔 재정의)
		
	}

}
