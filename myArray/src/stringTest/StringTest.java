package stringTest;

public class StringTest {

	public static void main(String[] args) {
		String data = "ABC";
		//스트링 클래스은 문자 배열이다
		System.out.println(data.length());
		//문자배열의 길이를 갖고 오는 메소드
		
		System.out.println(data.charAt(0));
		//문자열에서 0번째 방에 있는 문자 출력
		
		int[] arData = {1, 2, 3};
		System.out.println(arData.length);
		//배열은 length 상수 사용
		
		data.indexOf("A");
		System.out.println(data.indexOf("A")); // 0
		System.out.println(data.indexOf("Z")); // -1 값을 못 찾았다
		
		
//		String 클래스 안에 있는 문자 배열(value)로 여러 가지 연산을 수행할 수 있다.
//		1.문자열의 길이
		System.out.println(data.length());
//		2.원하는 인덱스의 문자 추출
		System.out.println(data.charAt(1));
//		3.원하는 문자 조회 및 검색
		System.out.println(data.indexOf("Z"));
		
		
	}

}
