package castingTest;

public class CastingTest1 {

	public static void main(String[] args) {
		//자동 형변환
		
		System.out.println(11/9); // 정수/정수 = 정수
		System.out.println(11/9.0); // 정수/실수 = 실수

		System.out.println("-------------------");
		//강제 형변환
		System.out.println(11/(double)9);
		System.out.println((double)11/9);
		System.out.println((double)(11/9));
		System.out.println((int)8.43+2.59);
		System.out.println((int)(8.43+2.59));
		System.out.println((int)8.43+(int)2.59);

	
	
	
	}

}
