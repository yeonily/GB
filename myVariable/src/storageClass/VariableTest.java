package storageClass;

public class VariableTest {
	int data = 10; // 전역변수(class가 가장 큰 영역)
	static int data_s = 10;
	
	void increaseData() {
//		int data = 10; //지역변수 >> 만날 때마다 메모리에서 해제가 되기 때문
//		System.out.println(this.data); //지역변수, 더해지지 않고 사용할 때마다 계속 초기화됨
		System.out.println(++data);
	}
	
	static void increaseData_s() { //static 키워드를 붙이면 무조건 1개 만들어짐
		System.out.println(++data_s);
	}

}
