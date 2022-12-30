package arrayTest;

public class ArrTest {

	public static void main(String[] args) {
		int[][] arrData = {{3,4,5,6}, {1,2,9,0}, {7,8,9,5}}; //3행 4열
//		int length = arrData.length * arrData[0].length; // 행*열 > 전체 길이
		
//		System.out.println(arrData.length); //행길이
//		System.out.println(arrData[0].length); //열길이
		
//		for (int i = 0; i < length; i++) {
//			System.out.println(arrData[i / 4][i % 4]);
//		}
		
		for (int i = 0; i < arrData.length; i++) {//행의 길이
			for (int j = 0; j < arrData[i].length; j++) {//열의 길이
				System.out.println(arrData[i][j]);
			}
		}
		
		
		
		
		
		
	}

}
