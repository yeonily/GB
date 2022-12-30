package collectionTask;

public class ForEachTest {

	public static void main(String[] args) {
		int[][] arrData = {{10, 30, 80}, {11, 22, 33}};
//		각 학생의 총점과 평균 출력
		int total = 0;
		double avg = 0.0;
	
		for (int[] arData : arrData) {
			total = 0; //총점을 초기화 해줘야 함.
			for (int score : arData) {
				total += score;
			}
			avg = total / (double)arData.length;
			avg = Double.parseDouble(String.format("%.2f", avg));
			
			System.out.println(total);
			System.out.println(avg);
			//두번째 반복 돌기 전에 총점, 평균까지 다 구할 수 있음.
		}
		
		
		
//		int[] test = {1,2,3};
//		for (int t : test) {
//			System.out.println(t);
//		}
		
		
	}

}
