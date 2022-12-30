package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DBConnecter;
import dao.UserDAO;
import vo.UserVO;

public class Test {

	public static void main(String[] args) {
		
//		   Connection connection = null;
//			try {
////				연결 객체 가져오기
//				connection = DBConnecter.getConnection();
//	
////				여기서 하는 것들
////				쿼리문
////				가져온 결과가지고 놀기
////				리턴할지 말지
////				결과가지고 연산
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {//외부 장치랑 연결했을 때 finally로 닫아주자!
////				만약 드라이버가 열려 있다면,
//				if(connection != null) {//null이 아닐 때(열려있다는 뜻) close해야 함. //null인 경우, 열리지 않았음.
//					try {
////						닫아준다.
//						connection.close(); // 닫다가 문제가 생기면 안 닫힌 채로 종료가 되므로
//					} catch (SQLException e) {
////						드라이버를 닫다가 오류가 발생하면, 예외 던지기를 사용하여 직접 예외를 발생시켜주고,
////						프로세스를 강제 종료시킨다.
//						throw new RuntimeException(e.getMessage()); // 프로세스를 바로 종료하기 위해서 일부러 예외를 발생시킴.
//								//해당 Exception 필드를 메모리에 할당함.(new) -> 받을 주소가 없으니까 바로 종료됨.
//					}
//				}
//			}	
		
		UserDAO userDAO = new UserDAO();
		//아이디 중복검사
//		System.out.println(userDAO.checkId("hds"));
		//회원가입
		UserVO userVO = new UserVO();
		userVO.setUserId("kkk");
		userVO.setUserName("김장미");
		userVO.setUserPassword("1021");
		userVO.setUserAge("21");
		userVO.setUserBirth("20201021");
		userVO.setUserPhoneNumber("01012341234");
		userVO.setUserStatus(0);
		userDAO.insert(userVO);
		
		
//		로그인
//		System.out.println(userDAO.login("kjy", "1021"));
		
//		아이디 찾기
//		System.out.println(userDAO.findId("01012341234"));
		
	}

}
