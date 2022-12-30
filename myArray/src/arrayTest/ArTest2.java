package arrayTest;


public class ArTest2 {

	public static void main(String[] args) {
		//10칸의 int배열 선언
		int[] arData = new int[10];
		
		// 1 ~ 10 넣고 출력
		for (int i = 0; i < 10; i++) {
			arData[i] = i;
		}
		//대입하는 부분
		
		// 영역별로 분리하는 스타일
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i] + 1);
		}
		//출력하는 부분
		
	}

}
