package wrapperTest;

public class WrapperTask {

	public static void main(String[] args) {
		//1, 12.5, 86.6F, 'Z', "Hi", false
		//위 6개의 값을 6칸 배열에 담기
		
//		String[] ar = new String[6];
//		Object a = 1;
//		Object b = 12.5;
//		Object c = 86.6F;
//		Object d = 'z';
//		Object e = "hi";
//		Object f = false;
		
		//클래스 타입으로 묶을 때 > 오토박싱이 됨.
		//모든 클래스의 부모타입으로 upcasting.
		Object[] datas = {1, 12.5, 86.6F, 'Z', "Hi", false}; //autoboxing, upcasting
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
				
		
		
	}

}
