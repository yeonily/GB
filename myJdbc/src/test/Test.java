package test;

import java.text.ParseException;
import java.util.Scanner;

import dao.UserDAO;
import vo.UserVO;

public class Test {
   public static void main(String[] args) {
	   
//	   Connection connection = null;
//		try {
////			연결 객체 가져오기
//			connection = DBConnecter.getConnection();
//
////			여기서 하는 것들
////			쿼리문
////			가져온 결과가지고 놀기
////			리턴할지 말지
////			결과가지고 연산
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {//외부 장치랑 연결했을 때 finally로 닫아주자!
////			만약 드라이버가 열려 있다면,
//			if(connection != null) {//null이 아닐 때(열려있다는 뜻) close해야 함. //null인 경우, 열리지 않았음.
//				try {
////					닫아준다.
//					connection.close(); // 닫다가 문제가 생기면 안 닫힌 채로 종료가 되므로
//				} catch (SQLException e) {
////					드라이버를 닫다가 오류가 발생하면, 예외 던지기를 사용하여 직접 예외를 발생시켜주고,
////					프로세스를 강제 종료시킨다.
//					throw new RuntimeException(e.getMessage()); // 프로세스를 바로 종료하기 위해서 일부러 예외를 발생시킴.
//							//해당 Exception 필드를 메모리에 할당함.(new) -> 받을 주소가 없으니까 바로 종료됨.
//				}
//			}
//		}	
	   
//	   아이디 중복검사
	   UserDAO userDAO = new UserDAO();
//	   if(userDAO.checkId("KJY")) {
//		   System.out.println("중복된 아이디 있음");
//	   }else {
//		   System.out.println("사용 가능한 아이디");
//	   }
	   //대소문자 구분함.
	   
//	   회원가입
	   UserVO userVO = new UserVO();
//	   userVO.setUserId("KJM");
//	   userVO.setUserName("김장미");
//	   userVO.setUserPassword("5678");
//	   userVO.setUserPhone("010-5678-5678");
//	   userVO.setUserNickname("김장");
//	   userVO.setUserEmail("KJM@gmail.com");
//	   userVO.setUserRecommenderId("KJY");
//	   
//	   userDAO.insert(userVO);
	   
//	   로그인
//	   System.out.println(userDAO.login("KJY", "1234"));//KJY의 회원번호 리턴
	   
//	   회원 탈퇴
//	   userDAO.delete(41);
	   
//	   아이디 찾기
//	   System.out.println(userDAO.findId("010-5678-5678"));
	   
//	   비밀번호 변경
//	   Scanner sc = new Scanner(System.in);
//	   String userId = null, userPassword = null;
//	   System.out.print("아이디 : ");
//	   userId = sc.next();
//	   if(userDAO.checkId(userId)) {
//		   System.out.println("존재하는 아이디 입니다");
//		   System.out.print("새로운 비밀번호 : ");
//		   userPassword = sc.next();
//		   userDAO.updatePassword(userId, userPassword);
//		   System.out.println("비밀번호 변경 완료");
//		   
//		   System.out.println("다시 로그인 하세요");
//		   System.out.print("아이디 : ");
//		   userId = sc.next();
//		   System.out.print("비밀번호 : ");
//		   userPassword = sc.next();
//		   
//		   if(userDAO.login(userId, userPassword) != 0) {
//			   System.out.println("로그인 성공");
//		   } else {
//			   System.out.println("로그인 실패");
//		   }
//	   }
	   
//	   정보 수정
	   int userNumber = userDAO.login("KJY", "1234");
	   if(userNumber != 0) {
		   try {
			userVO = userDAO.selectUser(userNumber);
			userVO.setUserName("김지연");
			userDAO.update(userVO);
//			System.out.println(userVO);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	   }
	   
	   
	   
	   
	   
   	}
}

