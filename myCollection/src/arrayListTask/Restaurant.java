package arrayListTask;

import java.util.ArrayList;

public class Restaurant {
//	음식 정보를 담을 DB 선언
	public static ArrayList<Food> foods = new ArrayList<Food>();
	
//	1.음식 추가
	public void add(Food food) {
		foods.add(food);
	}
	
//	2.양식인지 중식인지 일식인지 한식인지 검사(문자열로 리턴)
//	예) 스파게티 입력 시 "양식" 리턴
//	public String check(String name) {
//		String kind = null;
//		for (Food db : foods) {
//			if(db.getName().equals(name)){
//				kind = db.getKind();
//			}
//		}
//		return kind;
//	}
	
	public String checkKinds(String name) {//수정은 무조건 객체, 하나만 필요하면 하나만 전달해도 됨.
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getKind();
			}
		}
		return null;
	}
	
//	3.사용자가 원하는 종류의 음식 목록 조회(종류는 한 가지만 입력가능)
//	예) 한식 입력 시 한식만 조회
//	public ArrayList<Food> listSearch(String kind) {
//		ArrayList<Food> selected = new ArrayList<Food>();
//		for (Food db : foods) {
//			if(db.getKind().equals(kind)) {
//				selected.add(db);
//			}
//		}
//		return selected;
//	}
	
	public ArrayList<Food> getFoods(String kind) {
		ArrayList<Food> results = new ArrayList<Food>();
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				results.add(food);
			}
		}
		return results;
	}
	
//	4.음식의 종류 수정(가격 10% 상승)
//	예) 한식 -> 중식, 음식 가격은 10% 상승
//	public void update(Food food) {
//		for (Food db : foods) {
//			if(db.getName().equals(food.getName())) {
//				db.setKind(food.getKind());
//				db.setPrice((int)(food.getPrice() * 1.1));
//			}
//		}
//	}
	
	public void updateKind(Food food) {//수정할 때는 객체로 받아야 함.
		for (Food temp : foods) {
			if(temp.getName().equals(food.getName())) {
				temp.setKind(food.getKind());
				temp.setPrice((int)(temp.getPrice() * 1.1));
				break;
			}
		}
	}
	
//	5.사용자가 원하는 종류의 음식 개수 조회
//	예) 불고기, 제육볶음, 파스타, 초밥
//	한식 입력 시 2개
//	public int countCheck(String kind) {
//		ArrayList<Food> selected = new ArrayList<Food>();
//		for (Food db : foods) {
//			if(db.getKind().equals(kind)) {
//				selected.add(db);
//			}
//		}
//		return selected.size();
//	}
	
	public int getCount(String kind) {
		//메소드 안에서 지역변수로 써야 함.
//		int count = 0;
//		for (Food food : foods) {
//			if(food.getKind().equals(kind)) {
//				count++;
//			}
//		}
//		return count;
		return getFoods(kind).size();
	}
	
	
	
	
	
}
