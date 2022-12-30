package arrayListTask;

import java.util.ArrayList;

public class Market {
//	과일들을 저장할 DB 선언
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	//static
	//모든 객체가 공유하기 위해서
	//객체화하지 않고 사용하기 위해서
	
//	1.과일추가
	//매개변수로 어떤 과일을 추가할 지 받아와야 함.
	public void plus(Fruit fruit) {
		fruits.add(fruit); //DB에 넣기
	}
	
//	2.과일삭제
//	과일의 이름으로 삭제한다
//	과일의 이름을 외부에서 전달받는다
//	DB에서 과일의 이름을 검색한다
//	과일의 이름이 검색되면 해당 객체를 저장한다.
//	저장한 객체를 DB에서 삭제한다.
	
//	public void delete(String name) {
//		if(fruits.contains(name)) {
//			fruits.remove(0);
//		}
//	}
	
	public void delete(String name) {
		
		//(빠른 for문은 값에 접근해서 사용하는 것)
		//빠른 for문에서 반복자 자리에 있는 객체의 데이터에 변화가 생기면
		//반복에 대한 기준점이 수정되는 것이므로 오류가 발생한다.
		
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {
				fruits.remove(fruit);
				break;//반복 탈출 시키면 오류 안남
				//또는 try-catch문으로 예외를 잡아주면 됨.
			}
		}
		
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(name)) {
				fruits.remove(fruits.get(i));
			}
		}
	}
	
//	3.과일의 가격이 평균 가격보다 낮은 지 검사
//	public double checkAvg() {
//		double avg = 0.0;
//		int total = 0;
//		for (Fruit fruit : fruits) {
//			total += fruit.getPrice();
//		}
//		avg = total / fruits.size();
//		return avg;
//	}
//
//	//매개변수로 받은 과일의 가격이
//	//평균가격보다 낮은지 확인
//	public boolean check(int price) {
//		if(price < checkAvg()) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean compare(int price) {
		return price < getAverage();
	}
	
	public double getAverage() {
		int total = 0;
		double avg = 0.0;
		
		for (Fruit fruit : fruits) {
			total += fruit.getPrice();
		}
		return avg = Double.parseDouble(String.format("%.2f", total / (double)fruits.size()));
	}
	
	
	
	
	
	
	
	
	
	
}


