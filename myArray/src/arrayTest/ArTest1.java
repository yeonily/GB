package arrayTest;

public class ArTest1 {

	public static void main(String[] args) {
		//정수 5개가 담긴 int 배열
		int[] arData = {2, 4, 5, 6, 8}; // 5칸이 힙메모리에 할당됨(new 연산자 생략)
		//배열명을 출력하면 시작주소값 출력
		System.out.println(arData);
		//배열명.length를 출력하면 배열의 길이값 출력
		System.out.println(arData.length);
		
		//0번 방값 + 7
//		System.out.println(arData[0] + 7); // 값
		//1번 방값
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
		
		//arData배열의 길이만큼 배열의 값을 보는 반복문
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		
		// 5,4,3,2,1 넣고 출력
		//배열의 길이 만큼 반복하는 반복문
		for (int i = 0; i < arData.length; i++) {
			//배열에 5,4,3,2,1 대입
			arData[i] = 5-i;
			//각각의 배열값 출력
			System.out.println(arData[i]);
		}
		
		
		
		
	}

}
