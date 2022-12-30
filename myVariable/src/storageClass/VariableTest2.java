package storageClass;

public class VariableTest2 {

	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		VariableTest vt2 = new VariableTest();
		
		//객체화
//		vt.data_s = 500;
//		System.out.println(vt2.data_s);
		//static은 하나있고 모든 객체가 공유하기 때문에
		//변화값이 바로바로 적용됨
		
		//정적필드
		VariableTest.data_s = 500; 
		System.out.println(VariableTest.data_s);
		//생성자 호출안해도 컴파일러가 벌써 메모리에 올림.
		//객체명으로 불러오는 것이 비효율적, static이 선언된 클래스로 불러옴.
		
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt = new VariableTest();
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt.increaseData_s();
//		vt.increaseData_s();
		
//		vt.increaseData();
//		vt.increaseData();
//		vt.increaseData();
//		vt.increaseData();
//		vt.increaseData();
//		vt = new VariableTest(); //new로 메모리에 할당되기 때문에, 새롭게 초기화
//		vt.increaseData();
//		vt.increaseData();
//		vt.increaseData();
//		vt.increaseData();
//		vt.increaseData();

		
	}

}
