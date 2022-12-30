package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void test(int data) {
		data = 20;
	}
	
	public static void main(String[] args) {
		int data = 10;
		ArrayListTest.test(data); // 값을 전달받음
		System.out.println(data); // 10
		
//		<?> : 제네릭(이름이 없는), <E> >> E라는 타입
//		객체화 시 타입을 지정하는 기법.
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다. 
//		장점 : 따로 다운 캐스팅을 할 필요가 없다. 
//			  지정할 수 있는 타입에 제한을 줄 수 있다.(상속 사용해서)
		
		ArrayList<Integer> datas = new ArrayList<>();
												//뒷 부분은 생략 가능
		
		datas.add(10);
		datas.add(20);
		datas.add(40);
		datas.add(90);
		datas.add(60);
		datas.add(50);
		datas.add(30);
		datas.add(80);
		
//		System.out.println(datas.size()); // datas는 ArrayList 타입
//		System.out.println(datas.get(0)); // get으로 하나 갖고 왔으면 Integer 타입

//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
//		System.out.println(datas.toString());
		System.out.println(datas); //객체명 출력하면 주소값이 나와야 하는데 ?? >> toString을 재정의했다!! //주소값
//		API보면서 필요한 메소드를 보고 찾아서 써야 함.
		
		//객체에는 주소값이 담겨있음, 필드의 주소값은 중복이 없음, sort에서 그 주소값에 직접 접근해서 정렬함. 리턴없이도 값이 변경되었음.
		Collections.sort(datas);//정렬(오름차순)
		System.out.println(datas);
		
		Collections.reverse(datas);//가운데를 기준으로 순서(오름차순)를 바꾸는 애 > 내림차순
		System.out.println(datas);
		
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		추가(삽입)
//		50뒤에 500삽입
		System.out.println("추가(삽입)");
		//먼저 알고리즘 짜야함. 50이 있는지 없는지 먼저 확인해야 함.
		//50을 가지고 있다면
		if(datas.contains(50)) {//contains() : 값이 있으면 true 리턴
			//삽입 메소드 사용, 50이 있는 인덱스 번호를 가져와서 그 뒤에 500을 삽입
			datas.add(datas.indexOf(50) + 1, 500);
		}
		System.out.println(datas);
		
		
//		수정
//		90을 9로 수정
		System.out.println("수정");
		//90을 가지고 있다면
		if(datas.contains(90)) {
//			datas.set(datas.indexOf(90), 9); //이전 값이 return값임. >> 자료구조에선 POP이라고 함.
			//수정 메소드 사용, 90이 있는 인덱스 번호를 가져와서 9로 값 수정
			System.out.println(datas.set(datas.indexOf(90), 9)+"이 9로 변경되었습니다.");
		}
		System.out.println(datas);
		
//		삭제
//	 	80삭제
//		1.인덱스로 삭제
		System.out.println("1.인덱스로 삭제");
		//80을 가지고 있다면
		if(datas.contains(80)) {
//			datas.remove(datas.indexOf(80));
			//삭제 메소드 사용, 80이 있는 인덱스 번호로 파악해서 그걸 삭제, 제거된 요소가 리턴값
			System.out.println(datas.remove(datas.indexOf(80))+"삭제");
		}
		System.out.println(datas);
		
		
//		2.값으로 삭제
		System.out.println("2.값으로 삭제");
//		if(datas.contains(80)) {
//			datas.remove(Integer.valueOf(80)); // autoboxing 안되니까 직접boxing 해줘야 함.(Object타입으로 알려면 Integer로 바꾸기)
//			//return 값이 boolean , 삭제됐으면 true
//		}
		
		//삭제할 값을 Integer로 박싱을 하고, 그걸 삭제하기 >> 리턴값이 boolean
		if(datas.remove(Integer.valueOf(10))) {
			System.out.println("삭제 완료");
		}
		
		
		System.out.println(datas);
		
		//메소드 설명에서 매개변수, 리턴까지 꼼꼼히 다 읽어보기!
		
		
		
	}

}
