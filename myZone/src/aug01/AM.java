package aug01;

public class AM {

	public static void main(String[] args) {
		//switch문에서 break로 반복문을 탈출할 수 없다 >> switch를 감싸고 있는 영역을 탈출 불가
		//dowhile문
//			: 초기값은 0이라서 실행되지 않을 수 있으므로
//			  do{} 무조건 1번 실행하고 while(); 실행
		
		
		// 1 ~ 10까지 중 4까지만 출력하기
		//0부터 9까지 반복문
		//i에 1을 더해서 출력하기
		//i가 3이라면 탈출
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			if(i == 3) {
				break;
			}
		}
		
		// 1 ~ 10까지 중 3을 제외하고 출력하기
		//0부터 9까지 반복문
		//i가 2라면 다음 반복 실행
		//i에 1을 더해서 출력하기
		for (int i = 0; i < 10; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(i + 1);
		}
		
		//정수 5개가 담긴 int 배열
		int[] arData = {1, 5, 8, 2, 6};
		//배열명을 출력하면 시작주소값 출력
		System.out.println(arData);
		//배열명.length를 출력하면 배열의 길이값 출력
		System.out.println(arData.length);
		//arData배열의 길이만큼 배열의 값을 보는 반복문
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		// 5,4,3,2,1 넣고 출력
		//배열의 길이 만큼 반복하는 반복문
		//배열에 5,4,3,2,1 대입
		//각각의 배열값 출력
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5-i;
		}//값을 대입하는 부분

		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}//출력하는 부분
		
		
		
		
		
	}

}
