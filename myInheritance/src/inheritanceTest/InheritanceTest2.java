package inheritanceTest;

class Human{
	//사람의 공통 요소
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("잠자기");
	}
	
	void walk() {
		System.out.println("두 발로 걷기");
	}
}


class Monkey extends Human{
	  //자식			  //부모(공통 요소 묶기)
	
	//자식클래스에서 새로 만든 메소드
	void 이잡기() {
		System.out.println("이잡기");
	}
	
//	@Override
//	void walk() {
//		System.out.println("네 발 또는 두 발로 걷기");
//	}

	//메소드명 쓰면 자동완성 
	@Override
	void walk() {
		//부모의 코드를 그대로 사용하고자 할 때
		//(기존 코드에서 일부 수정만 필요할 경우)
		super.walk();//부모 먼저 사용
		System.out.println("네 발로 걷기");//자식에서 코드 추가
	}
	
}


public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		//super() 생략
		
		kingkong.walk();
		//자식에서 재정의된 거는 부모 필드 내용을 쓰지 않겠다, 새로 재정의한 필드 사용
		//부모필드 내용을 쓰고 싶으면, 부모를 객체화해서 쓰면 됨
		
		
	}
}
