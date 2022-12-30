package objectTest;

public class HashCodeTest {

	public static void main(String[] args) {
		//상수의 주소를 비교
		String data1 = "ABC";
		String data2 = "ABC";
		//필드의 주소를 비교
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		System.out.println(data1.hashCode());//자바 버전이 똑같으면 똑같은 값이 나옴
		System.out.println(data2.hashCode());
		//ABC의 해쉬코드를 가지고 옴
		//String 클래스에서 안에 들어가 있는 문자열 값의 주소를 리턴할 수 있게끔 재정의하였음.
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		
//		Random r1 = new Random();
//		Random r2 = new Random();
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		
//		System.out.println(r1.hashCode());//JVM에 올라가있는 값
//		System.out.println(r2.hashCode());//JVM에 올라가있는 값
		
	}

}
