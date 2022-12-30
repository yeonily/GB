package hashMapTest;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJSON = null;
		JSONArray users = new JSONArray(); //arraylist 자료구조랑 똑같음
		
		
		userMap.put("id", "hds1234");
		userMap.put("pw", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		userJSON = new JSONObject(userMap); //JSONObject에 userMap을 전달하면 userMap이 자동으로 JSON형식으로 바뀜. 
//		System.out.println(userJSON.toJSONString()); >> 서버에 전달하면 됨.
		
		//회원이 한명일 때 jsonobject 객체 사용
		//회원이 여러명일 때 jsonarray 객체 사용
		
//		JSONObject
//		JSONArray >> []
//		대괄호 안에는 key값이 없고 value만 있음. array라 index가 있기 때문에 그렇다. 0~n까지 순서대로 value를 담아줌.
//		jsonarray값을 가져오기 위해서는 default key값을 전달해주면 돌아오는 값이 arraylist임.
//		hashmap으로 취급을 하자면 key값은 string, value값은 arraylist임. --> key를 전달했을 때 돌아오는 값이 arraylist
//
//		JSONArray는 arraylist와 똑같기 때문에 JSONObject를 add해주면 됨.
		
		users.add(userJSON);
		
		//put으로 값 수정
		userMap.put("id", "hhh1234");
		userMap.put("pw", "5555");
		userMap.put("name", "김장미");
		userMap.put("age", 25); 
		
		userJSON = new JSONObject(userMap);
		//userJSON이 총 2개 >> JSONArray의 객체인 users에 추가한 것임.
		//users.size == 2
		//users는 array이기 때문에 value값만 있음. 
		users.add(userJSON);
		
		System.out.println(users.toJSONString());//value만 출력, index로 구분
		
							//다운캐스팅
		System.out.println(((JSONObject)users.get(1)).toJSONString());//1번째 방의 전체정보를 JSON형식으로 꺼내서 쓸 수 있음.
		
		
		
		
		
	}

}
