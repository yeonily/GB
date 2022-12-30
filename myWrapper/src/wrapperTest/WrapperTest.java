package wrapperTest;

public class WrapperTest {

	public static void main(String[] args) {
		int data_i = 10; //기본 자료형(4바이트)
//		boxing
//		Integer data_I = new Integer(data_i);
								//디프리케이티드(이제 쓰지 마세요, 이 방법을 권장하지 않습니다)
//		Integer data_I = Integer.valueOf(data_i); // 이 방식을 훨씬 더 자주 쓴다.
		
//		auto boxing
		Integer data_I = data_i;
		
		
//		unboxing
//		data_i = data_I.intValue();
		
//		auto unboxing
		data_i = data_I;
		
		
		
		
	}

}
