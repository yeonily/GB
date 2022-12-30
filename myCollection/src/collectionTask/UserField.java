package collectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	private final int KEY = 3;
	
//	- 회원 정보를 담을 DB를 ArrayList로 선언
//	배열 > 번호로 구분
//	클래스 > 이름으로 구분
	public static ArrayList<User> users = new ArrayList<User>();
	
	
//	- 아이디 중복검사
	//User를 리턴하면 그 안에 담긴 비밀번호도 쓸 수 있음
	public User checkId(String id) {
		User user = null;
//		DB에 있는 회원 수 만큼
		for (int i = 0; i < users.size(); i++) {
//			회원별 아이디 검사
			if(users.get(i).getId().equals(id)) {
//				일치하는 아이디가 있다면 user에 저장
				user = users.get(i);
				break;
			}
		}
//      null 또는 해당 회원 리턴
		return user;
	}
	
//	- 회원가입
	public void join(User user) {//전체 정보를 다 받으니까 user로 받으면 편함. (전체 정보를 안받아도 user로 전달받아야 작업할 때 편함)
//      암호화
		user.setPassword(encrypt(user.getPassword()));//암호화된 비밀번호로 설정
		//문제가 없이 완벽할 때 메소드 실행됨
//      DB에 저장
		users.add(user); //화면에서 아이디 중복검사를 실행함 
	}
	
//	- 로그인(아이디 중복검사한 거 사용할 수 있음)
	//로그인하고 나서 그 정보로 이용을 하니까 User 리턴함.
	public User login(String id, String pw) {//로그인 성공하면 해당 유저의 정보가 필요하니까 리턴함.
//  아이디 검사
		User user = checkId(id); 
		if(user != null) {//아이디가 있다면
//	         비밀번호 검사
			if(user.getPassword().equals(encrypt(pw))){//비밀번호를 가져옴
//	            로그인 성공(성공 시 로그인된 회원의 정보 리턴)
				return user;
			}
		}
//      로그인 실패
		return null; //비밀번호까지 맞아야 정보가 리턴되어야 함
	}
	
//	- 암호화(아스키코드)
	public String encrypt(String password) {
		String decryptedPassword = "";
		
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			decryptedPassword += (char)(c * KEY);
		}
		return decryptedPassword;
	}
	
//	- 비밀번호 변경(비밀번호 찾기 서비스 > 로그인이 안 됐을 때)
//	public boolean changePassword(User user) { //매개변수로 아이디, 전화번호, 새로 입력한 비밀번호가 들어와야 함.
//		User userOriginal = checkId(user.getId()); //아이디 중복검사를 화면단에서 함. >> 다시
//		if(userOriginal != null) {
//			userOriginal.setPassword(user.getPassword()); // 비밀번호를 입력한 비밀번호로 바꾸기
//			//원래 주소에서 이 주소로 수정해줘야 함.
//			//nullpointException 발생할 수 있음. >> 예외처리
//			return true;
//		}
//		return false;
//	}
	
	public void changePassword(User user) {//사용자가 입력한 값 user
//      외부에서 사용자가 입력한 정보 중, 아이디로 전체 정보 조회
		User userOriginal = checkId(user.getId());//DB에서 조회하기 위한 목적(중복검사X)
//      해당 회원의 비밀번호를 새로운 비밀번호로 변경
		userOriginal.setPassword(encrypt(user.getPassword()));
	}
	
//	- 인증번호 전송
//	인증번호 전송 시 전송된 인증번호가 화면에서 필요하다.
//	따라서 전송한 인증번호를 사용한 화면쪽에서 리턴해준다.
	public String sendSms(String phoneNumber) { //인증번호 6자리
		 String api_key = "#ENTER_YOUR_OWN#";
		    String api_secret = "#ENTER_YOUR_OWN#";
		    Message coolsms = new Message(api_key, api_secret);
		    String getCertificationNumber = getCertificationNumber();

		    // 4 params(to, from, type, text) are mandatory. must be filled
		    HashMap<String, String> params = new HashMap<String, String>();
//	      사용자가 입력한 핸드폰 번호로
		    params.put("to", phoneNumber);
		    params.put("from", "01000000000");
		    params.put("type", "SMS");
//	      인증번호 발송
		    params.put("text", getCertificationNumber);
		    params.put("app_version", "test app 1.2"); // application name and version

		    try {
		      JSONObject obj = (JSONObject) coolsms.send(params);
		      System.out.println(obj.toString());
		    } catch (CoolsmsException e) {
		      System.out.println(e.getMessage());
		      System.out.println(e.getCode());
		}
//	      화면쪽에 발송한 인증번호를 리턴
		return getCertificationNumber;//사용자가 입력한 거랑 화면에서 비교하려고 리턴
	}
	
//	인증번호 6자리 만들기
	private String getCertificationNumber() {//캡슐화
		Random r = new Random();
		String number = "";
		//6자리 : 000000~999999
//		앞에 0이 붙으면 정수이기 때문에 생략된다.
		number = r.nextInt(1000000)+"";
//      생략된 0만큼 앞에 직접 연결시켜주어야 한다.
		for (int i = 0; i < 6 - number.length(); i++) {
			number = "0" + number;
		}
		return number;
	}
	
	
}
