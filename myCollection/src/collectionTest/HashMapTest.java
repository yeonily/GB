package collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
//		아이디, 비밀번호, 이름, 나이
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "hds1234");
		userMap.put("pw", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		System.out.println(userMap.size());//쌍의 갯수 / 쌍(k,v) = Entry
		System.out.println(userMap);//toString 재정의된 상태
		System.out.println(userMap.get("id"));
		//put, get을 주로 사용
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		//한 쌍씩 분리해서 가져오게 됨.
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			System.out.println(entry.getKey() + " : "+entry.getValue()); 
			
		}
		
		Iterator<String> iter2 = userMap.keySet().iterator(); // 키값만 분리해주는 set
		
		System.out.println("----key값만 분리");
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println("----value값만 분리");
		for (Object value : userMap.values()) {
			System.out.println(value);
		} 
		
	}

}
