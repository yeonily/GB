package interfaceTest;

public interface Pet {
	//인터페이스(틀)는 상수와 추상메소드만 존재한다
	
	final static int eyes = 2; 
	//Pet은 인터페이스, 구현이 다 안 된 상태, 메모리에 못 올라가니깐 static을 붙여줘서 메모리에 올려버리기(컴파일러가)
	//static은 컴파일러가 메모리에 올려줌 >> 사용 가능
	
	int nose = 1;//상수밖에 사용을 못하니까 final static 생략됨
	
	//추상 메소드 : 바디가 없음
	public abstract void bang();
	public void giveYourHand(); //abstract 생략
	public void bite();
	public void sitDown();
	public void waitNow();
	public void getNose();
	
	
	
	
}
