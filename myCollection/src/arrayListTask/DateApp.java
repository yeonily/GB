package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {
//	이상형 정보를 담을 DB
	public static ArrayList<Love> loves = new ArrayList<Love>();
	
//	1.이상형 추가
	public void plus(Love love) {
		loves.add(love);
	}
	
//	2.사용자가 입력한 나이인 이상형 목록 조회
//	public void search(int age) {
//		//db에 있는 나이와 입력한 나이가 같은지 확인
//		//같은 나이의 사람 출력
//		
//	}
	
	public ArrayList<Love> getList(int age) {
		ArrayList<Love> selected = new ArrayList<Love>();
		
		for (Love love : loves) {
			if(love.getAge() == age) {
				selected.add(love);
			}
		}
		return selected;
	}
	
	
//	3.이상형의 나이 수정
//	  이상형의 번호를 추가하고 번호로 조회한다
//	  이름이 똑같으면 어떻게 수정하지? > 구분점이 필요하다! 고유한 값이 필요하다!
//	  번호를 받아서 번호로 조회하고 그 이상형의 나이를 바꾸자!
//	public void update(Love love) { //수정완료 때 누르는 버튼임. 이미 수정할 나이가 들어가 있음.
//		for (Love lover : loves) {
//			if(lover.getIndex() == love.getIndex()) {
//				loves.set(loves.indexOf(lover), love); //객체를 통채로 변경(아예 새로운 객체로 바뀜)
//			}
//		}
//	}
	
	public void update(Love love) {//처음부터 전체 정보를 받아오기
		for (Love db : loves) {
			if(db.getIndex() == love.getIndex()) {
				db.setAge(love.getAge()); //기존 객체의 필드 변경
				break;
			}
		}
		
	}
	
	
	
//	4.이상형의 나이 순으로 정렬하기
	public void sort() {
//		이상형의 나이만 담을 ArrayList
		ArrayList<Integer> ages = new ArrayList<Integer>();
//		오름차순으로 정렬된 이상형 정보를 담을 ArrayList
		ArrayList<Love> loves = new ArrayList<Love>(); //오름차순 된 리스트
		
		for (Love love : DateApp.loves) { //이름같을 경우 클래스명붙여주기
//			이상형의 나이만 담아주기
			ages.add(love.getAge());
		}
		
//		나이 오름차순 정렬
		Collections.sort(ages);//오름차순
		
		for (int i = 0; i < DateApp.loves.size(); i++) {
//			정렬된 나이 ArrayList에서 첫 번째 나이부터 비교
			
			 for (Love love : DateApp.loves) {
		            if(ages.get(i) == love.getAge()) {

				
//				찾았다면 순서대로 loves에 담아주기
		            loves.add(love);
		            }
			}
		}
//		오름차순으로 정렬된 전체 정보를 DB에 저장
		DateApp.loves = loves; //기존의 주소에서 정렬된 주소로 바뀜
		
	}
	
	//1.나이정렬
	//2.정렬된 나이로 필드를 정렬
	//3.DB에 저장
	
	
	
}
