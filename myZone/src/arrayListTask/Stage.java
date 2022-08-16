package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class Stage {
//	가수들을 저장할 DB 선언
	public static ArrayList<Singer> singers = new ArrayList<Singer>();
	
//	1.가수추가
	public void add(Singer singer) {
		singers.add(singer);
	}
	
//	2.가수삭제
//	가수의 이름으로 삭제한다
//	가수의 이름을 외부에서 전달받는다
//	DB에서 가수의 이름을 검색한다
//	가수의 이름이 검색되면 해당 객체를 저장한다.
//	저장한 객체를 DB에서 삭제한다.
	public void delete(String name) {
		for (Singer singerdb : singers) {
			if(singerdb.getName().equals(name)) {
				singers.remove(singerdb);
				break;
			}
		}
		
//		for (int i = 0; i < singers.size(); i++) {
//			if(singers.get(i).getName().equals(name)) {
//				singers.remove(singers.get(i));
//			}
//		}
	}
//	3.가수의 나이가 평균 나이보다 낮은 지 검사
//	평균나이 먼저 계산
//	가수들의 나이 비교
	public double avgCheck() {
		int total = 0;
		double avg = 0.0;
		for (Singer singerdb : singers) {
			total += singerdb.getAge();
		}
		avg = Double.parseDouble(String.format("%.2f", total / (double)singers.size()));
		return avg;
	}
	
	public boolean agecompare(int age) {
		return age < avgCheck();
	}
	
//	1.사용자가 입력한 나이인 가수 목록 조회
//	db에 있는 나이와 입력한 나이가 같은지 확인
//	같은 나이의 사람 출력
	public ArrayList<Singer> ageListSearch(int age) {
		ArrayList<Singer> list = new ArrayList<Singer>();
		for (Singer singerdb : singers) {
			if(singerdb.getAge() == age) {
				list.add(singerdb);
			}
		}
		return list;
	}
//	2.사용자가 입력한 포지션인 가수 목록 조회
	public ArrayList<Singer> positionListSearch(String position) {
		ArrayList<Singer> list = new ArrayList<Singer>();
		for (Singer singerdb : singers) {
			if(singerdb.getPosition().equals(position)) {
				list.add(singerdb);
			}
		}
		return list;
	}
	
	
//	3.가수의 나이 수정
//	  가수의 번호를 추가하고 번호로 조회한다
	public void ageUpdate(Singer singer) {
		for (Singer singerdb : singers) {
			if(singerdb.getNumber() == singer.getNumber()) {
				singerdb.setAge(singer.getAge());
				break;
			}
		}
	}
	
//	4.가수의 나이 순으로 정렬하기
	//1.나이정렬
	//2.정렬된 나이로 필드를 정렬
	//3.DB에 저장
	public void ageSort() {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ArrayList<Singer> singers = new ArrayList<Singer>(); //오름차순된 정보들
		for (Singer singerdb : Stage.singers) {
			ages.add(singerdb.getAge());
		}
		Collections.sort(ages);//오름차순
		
		for (int i = 0; i < Stage.singers.size(); i++) {
			for (Singer singerdb : Stage.singers) {
				if(ages.get(i) == singerdb.getAge()) {
					singers.add(singerdb);
				}
			}
		}
		Stage.singers = singers; //기존에 있던 정보들(주소)에 오름차순된 정보들(정렬된 주소)을 넣어주기
	}
	
	
//	5.가수의 이름 가나다 순으로 정렬하기
//	!!!!!오류!!!!! sort가 한글은 안되나?? 다시 보기,

	public void nameSort() {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Singer> singers = new ArrayList<Singer>();
		
		for (Singer singerdb : singers) {
			names.add(singerdb.getName());
		}
		Collections.sort(names);
		
		for (int i = 0; i < Stage.singers.size(); i++) {
			for (Singer singerdb : Stage.singers) {
				if(names.get(i).equals(singerdb.getName())) {
					singers.add(singerdb);
				}
			}
		}
		Stage.singers = singers;
		
	}
	
//	6.가수의 번호 순으로 정렬하기
	public void numSort() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Singer> singers = new ArrayList<Singer>(); //오름차순된 정보들
		for (Singer singerdb : Stage.singers) {
			nums.add(singerdb.getNumber());
		}
		Collections.sort(nums);//오름차순
		
		for (int i = 0; i < Stage.singers.size(); i++) {
			for (Singer singerdb : Stage.singers) {
				if(nums.get(i) == singerdb.getNumber()) {
					singers.add(singerdb);
				}
			}
		}
		Stage.singers = singers; //기존에 있던 정보들(주소)에 오름차순된 정보들(정렬된 주소)을 넣어주기
	}
	
	
	
	
//	1.어떤 그룹인지 검사(문자열로 리턴)
//	예) 태연 입력 시 "소녀시대" 리턴
	public String groupCheck(String name) {
		String group = null;
		for (Singer singerdb : singers) {
			if(singerdb.getName().equals(name)) {
				group = singerdb.getGroup();
			}
		}
		return group;
	}
	
//	2.사용자가 원하는 포지션의 목록 조회(포지션은 한 가지만 입력가능)
//	예) 댄서 입력 시 댄서만 조회
	public ArrayList<Singer> positionSearch(String position) {
		ArrayList<Singer> positions = new ArrayList<Singer>();
		for (Singer singerdb : singers) {
			if(singerdb.getPosition().equals(position)) {
				positions.add(singerdb);
			}
		}
		return positions;
	}
	
//	3.가수 포지션 수정
//	예) 댄서 -> 보컬
	public void positionUpdate(Singer singer) {
		for (Singer singerdb : singers) {
			if(singerdb.getPosition().equals(singer.getPosition())) {
				singerdb.setPosition(singer.getPosition());
			}
		}
	}
	
	
	
	
	
	
//	4.사용자가 원하는 그룹의 포지션 개수 조회
//	예) 소녀시대, 오마이걸
//	댄서 입력 시 4명
	public int countCheck(String position) {
		ArrayList<Singer> selected = new ArrayList<Singer>();
		for (Singer singerdb : singers) {
			if(singerdb.getPosition().equals(position)) {
				selected.add(singerdb);
			}
		}
		return selected.size();
	}
	
	
	
	
	
	
}
