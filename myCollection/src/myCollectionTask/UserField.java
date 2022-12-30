package myCollectionTask;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	ArrayList<User> db = new ArrayList<>();
	
	public void idCheck(String id) {
		//id를 매개변수로 받아서
		//db에 있는 아이디와 동일하다면
		//다른 아이디를 만드세요
		//동일하지 않다면
		//아이디를 사용해도 됩니다
		
		if(db.contains(id)) {
			System.out.println("다른 아이디를 만드세요");
		};
		System.out.println("아이디를 사용해도 됩니다");
	}
	
	public void join() {
		//
	}
	
	public void login(String id, String password) {
		//아이디와 비밀번호를 매개변수로 받아서
		//db에 있는 아이디와 비밀번호가 동일하다면
		//로그인 성공
	}
	
	public void encrypt() {//비밀번호 암호화
		
	}
	
	public void changePw() {//비밀번호 찾기 서비스할 때 비밀번호 변경으로 바로 들어가기
		
	}
	
	public void sendSms() {//API사용하기

	    String api_key = "#ENTER_YOUR_OWN#";
	    String api_secret = "#ENTER_YOUR_OWN#";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01000000000");
	    params.put("from", "01000000000");
	    params.put("type", "SMS");
	    params.put("text", "Coolsms Testing Message!");
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	}
	}
}
