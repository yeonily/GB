package access1;

public class Access1 {
	int data1 = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	//상위과정에서 기본생성자가 없으면 객체화가 안됨 > 기본생성자 직접 만들기! 
	public Access1() {}
	
	//초기화를 안 하더라도 기본생성자 만들기
	public Access1(int data4) {
		this.data4 = data4;
	}


	public int getData4() {
		return data4;
	}


	public void setData4(int data4) {
		this.data4 = data4;
	}
	
	
	
	

}
