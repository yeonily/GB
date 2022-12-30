package classTest;

class Test {
	int data;
	
	//기본생성자
	public Test() {;}//일부러 비워놓은 거야라고 알려주는 것 외국에서 많이 사용

	//초기화생성자
	public Test(int data) {
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
	
}

public class ClassArray {//클래스 배열

	public static void main(String[] args) {
		Test[] arTest = new Test[12]; // 12칸의 null값
		
		for (int i = 0; i < arTest.length; i++) {
//			System.out.println(arTest[i]);
			arTest[i] = new Test(i + 1);//생성자
						//1~12까지 들어감
		}
		
		for (int i = 0; i < arTest.length; i++) {
			
			arTest[i].printData();
		}
		arTest[10].printData();
		
		
	}

}
