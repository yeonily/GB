package ambiguityTest;
//모호성2
//부모클래스에 있는 메소드와 인터페이스의 디폴트 메소드가 똑같은 경우:
public class ClassB extends ClassA implements InterA{
//부모클래스의 우선순위가 더 높다 >> 같은 메소드가 있을 경우, 무조건 부모클래스에 있는 메소드가 실행됨
	
	@Override
		public void printData() {
			super.printData();
			//굳이 ClassA.super.printData(); 써주지 않아도 자동으로 부모클래스의 메소드가 실행됨
			//위처럼 쓰면 오류 생김
		}
	
	
	//InterA의 메소드를 사용하고 싶을 때 > super앞에다가 interA. 
//	@Override
//	public void printData() {
//		InterA.super.printData();
//	}
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.printData();
		
	}
}
