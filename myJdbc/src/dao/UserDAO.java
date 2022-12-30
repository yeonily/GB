package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import vo.UserVO;

public class UserDAO {
	
	private final int KEY = 3;
	
	//모두 jar파일에 있음, 전역변수로 선언해야 모든 메소드에서 사용 가능
	public Connection connection; //연결 객체
	public PreparedStatement preparedStatement; //쿼리(SQL문) 객체
	public ResultSet resultSet; //결과 테이블 객체
	
	
//		아이디 중복검사
	//중복이다 아니다만 검사하면 됨.
	public boolean checkId(String id) {
//		MYUSER_ID 컬럼에서 사용자가 입력한 id 검사
		String query = "SELECT COUNT(MYUSER_ID) FROM TBL_MYUSER WHERE MYUSER_ID = ?"; // 매개변수가 들어갈 자리에는 ? 써주면 됨.
		boolean check = false;
		try { //쿼리가 잘못 됐을 수 있으니 try-catch로 잡아주기
//			연결 객체 가져오기
			connection = DBConnecter.getConnection();
//			작성한 쿼리문을 preparedStatement에 전달
			preparedStatement = connection.prepareStatement(query); // query는 preparedStatement객체로 바뀜. (iterator처럼)
//			? 채우기(좌에서 우로 1부터 1씩 증가)
			preparedStatement.setString(1, id); //JDBC에서 index는 무조건 1부터 시작, 첫번째 ?에 id로 replace
//			쿼리 실행
			resultSet = preparedStatement.executeQuery(); //쿼리 실행, SELECT문은 무조건 executeQuery 사용
			
//			while(resultSet.next()) {//행 먼저 가져오기, 더 이상 가져올 행이 없을 때 false(리턴타입: boolean) 
//				resultSet.getInt(1); //행 가져오기, COUNT는 int타입이니까, getInt() >> COUNT 결과 값, 집계함수는 결과가 무조건 1개
//													//오버로딩 : 컬럼인덱스 번호(int) 또는 컬럼명(String) 쓰면 됨.
//			}
			
//			결과 행 1개 가져오기
			resultSet.next(); //반복 돌릴 필요 없음.
//			결과 첫번째 열 1개 가져오기
//			1이라면 사용자가 입력한 아이디가 1개 조회된 것이기 때문에 중복된 아이디이다.
			check = resultSet.getInt(1) == 1; // id 있으면 true, id 없으면 false 
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("checkId()에서 쿼리문 오류");
		} finally {
			try {
//				연결 객체 모두 닫기
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { // 여기서 Exception이 뜨면 
				throw new RuntimeException(e.getMessage());// throw날려서 프로세스 종료해주기
			}
		}
		return check;
	}
	
//		회원가입
	public void insert(UserVO userVO) {
		//쿼리문 작성
		String query = "INSERT INTO TBL_MYUSER"
				+ "(MYUSER_NUMBER, MYUSER_ID, MYUSER_NAME, MYUSER_PASSWORD, MYUSER_PHONE, MYUSER_NICKNAME, MYUSER_EMAIL, MYUSER_ADDRESS,"
				+ "MYUSER_BIRTH, MYUSER_GENDER, MYUSER_RECOMMENDER_ID)"
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			//연결 객체 가져오기
			connection = DBConnecter.getConnection();
			//작성한 쿼리문을 preparedStatement에 전달
			preparedStatement = connection.prepareStatement(query);
			//? 채우기
			preparedStatement.setString(1, userVO.getUserId());
			preparedStatement.setString(2, userVO.getUserName());
			preparedStatement.setString(3, userVO.getUserPassword());
			preparedStatement.setString(4, userVO.getUserPhone());
			preparedStatement.setString(5, userVO.getUserNickname());
			preparedStatement.setString(6, userVO.getUserEmail());
			preparedStatement.setString(7, userVO.getUserAddress());
			preparedStatement.setString(8, userVO.getUserBirth());
			preparedStatement.setString(9, userVO.getUserGender());
			preparedStatement.setString(10, userVO.getUserRecommenderId());
			//쿼리 실행(INSERT니까 executeUpdate())
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert()에서 쿼리문 오류");
		} finally {
			try {
				//사용한 연결 객체 모두 닫기
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}
		//쿼리 실행하면 되니까 return 필요 없음.
	}
	
//		로그인
	public int login(String userId, String userPassword) { // 로그인한 정보를 계속 써야 하니까 PK인 회원 번호를 리턴
		//쿼리 작성
		String query = "SELECT MYUSER_NUMBER FROM TBL_MYUSER WHERE MYUSER_ID = ? AND MYUSER_PASSWORD = ?";
		//리턴 변수 선언(로그인한 회원 번호 담을 변수)
		int userNumber = 0;
		try {
			//연결 객체 가져오기
			connection = DBConnecter.getConnection();
			//작성한 쿼리문을 preparedStatement에 전달
			preparedStatement = connection.prepareStatement(query);
			//? 채우기
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPassword);
			//쿼리 실행
			resultSet = preparedStatement.executeQuery(); // SELECT니까 executeQuery
			
			//결과 행이 있을 때 결과 행 가져오기
			if(resultSet.next()){//결과 행이 있을 때만 열에 접근
				//결과 열 가져오기, 로그인한 회원 번호 리턴 변수에 넣기
				userNumber = resultSet.getInt(1);//resultSet.getInt("MYUSER_NUMBER"); 써도 됨.
			}
			
		} catch (SQLException e) {
			System.out.println("login()에서 쿼리문 오류");
		} finally {
			try {
				//사용한 연결 객체 모두 닫기
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}
		//회원 번호 리턴
		return userNumber;
	}
	
//		암호화
	public String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY);
		}
		return encryptedPassword;
	}
	
//		회원탈퇴
		//실제 웹에서는 status를 줘서 탈퇴상태인지? 확인해야 함. / status 컬럼을 추가해야 함.
		//탈퇴 했을 때 1, 7일 지났을 때 2 >> 1일 때는 복구가능, 2일 때는 복구 불가능, 복구된 계정은 0, 이런 식으로 해야 함.
		//지금은 delete로 하겠음.
	
	public void delete(int userNumber) {//회원번호(PK)로 탈퇴
		//쿼리 작성
		String query = "DELETE FROM TBL_MYUSER WHERE MYUSER_NUMBER = ?";
		try {
			//연결 객체 가져오기
			connection = DBConnecter.getConnection();
			//작성한 쿼리문을 preparedStatment에 전달
			preparedStatement = connection.prepareStatement(query);
			//? 채우기
			preparedStatement.setInt(1, userNumber);
			//쿼리 실행 : DELETE -> executeUpdate
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("delete() 쿼리문 오류");
		} finally {
			try {
				//사용한 연결 객체 모두 닫기
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}
		
	}
	
	
//		아이디 찾기(전화번호로 찾기)
	public String findId(String userPhone) {//핸드폰 번호는 UK이기 때문에 중복이 없어서 찾을 수 있음.
		//쿼리 작성
		String query = "SELECT MYUSER_ID FROM TBL_MYUSER WHERE MYUSER_PHONE = ?";
		//리턴할 아이디 담을 변수 선언
		String userId = null;
		try {
			//연결 객체 가져오기
			connection = DBConnecter.getConnection();
			//작성한 쿼리를 preparedStatement에 전달
			preparedStatement = connection.prepareStatement(query);
			//? 채우기(첫번째 ?에 매개변수 넣기)
			preparedStatement.setString(1, userPhone);
			//쿼리 실행하고 resultSet에 넣기
			resultSet = preparedStatement.executeQuery();
			
			//행이 있을 때만
			if(resultSet.next()) {
				//첫 번째 열을 가져와서 리턴 변수에 담기
				userId = resultSet.getString(1); //SELECT에서 MYUSER_ID밖에 없음.
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findId() 쿼리문 오류");
		} finally {
			try {
				//사용한 연결 객체 모두 닫기
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}
		//회원 아이디 리턴
		return userId;
	}
	
//		비밀번호 변경
	//비밀번호 찾기 쿼리는 아이디 찾기 쿼리와 동일하니 아이디 찾고 나서 비밀번호 변경하는 메소드 만들기
	public void updatePassword(String userId, String userPassword) {
		String query = "UPDATE TBL_MYUSER SET MYUSER_PASSWORD = ? WHERE MYUSER_ID = ? ";
		String password = null;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userPassword);
			preparedStatement.setString(2, userId);
			preparedStatement.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("updatePassword() 쿼리문 오류");
		} finally {
			try {
				//사용한 연결 객체 모두 닫기
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}
	}
	
//		회원정보 수정
	public void update(UserVO userVO) throws ParseException{
		String query = "UPDATE TBL_MYUSER "
				+ "SET MYUSER_NAME=?, MYUSER_PASSWORD=?, MYUSER_PHONE=?, MYUSER_NICKNAME=?, MYUSER_ADDRESS=?, MYUSER_BIRTH=?, MYUSER_GENDER=? "
				+ "WHERE MYUSER_NUMBER=? ";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
				
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userVO.getUserName());
			preparedStatement.setString(2, userVO.getUserPassword());
			preparedStatement.setString(3, userVO.getUserPhone());
			preparedStatement.setString(4, userVO.getUserNickname());
			preparedStatement.setString(5, userVO.getUserAddress());
			preparedStatement.setString(6, sdf.format(sdf.parse(userVO.getUserBirth())));
			preparedStatement.setString(7, userVO.getUserGender());
			preparedStatement.setInt(8, userVO.getUserNumber());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("update()에서 쿼리문 오류");
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}

	}
//		회원정보 조회
	public UserVO selectUser(int userNumber) throws ParseException {
		String query = "SELECT MYUSER_NUMBER, MYUSER_ID, MYUSER_NAME, MYUSER_PASSWORD, MYUSER_PHONE, MYUSER_NICKNAME, MYUSER_EMAIL, MYUSER_ADDRESS, "
				+ "MYUSER_BIRTH, MYUSER_GENDER, MYUSER_RECOMMENDER_ID FROM TBL_MYUSER "
				+ "WHERE MYUSER_NUMBER = ? ";
		UserVO userVO = new UserVO();
		int i = 0;
		//생일이 DB에서 Date타입이므로 자바에서도 형식 맞춰줘야 함.
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			userVO.setUserNumber(resultSet.getInt(++i)); 
			userVO.setUserId(resultSet.getString(++i));
			userVO.setUserName(resultSet.getString(++i));
			userVO.setUserPassword(resultSet.getString(++i));
			userVO.setUserPhone(resultSet.getString(++i));
			userVO.setUserNickname(resultSet.getString(++i));
			userVO.setUserEmail(resultSet.getString(++i));
			userVO.setUserAddress(resultSet.getString(++i));
			userVO.setUserBirth(sdf.format(sdf.parse(resultSet.getString(++i))));
			userVO.setUserGender(resultSet.getString(++i));
			userVO.setUserRecommenderId(resultSet.getString(++i));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectUser() 쿼리문 오류");
		} finally {
			try {
				//사용한 연결 객체 모두 닫기
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) { 
				throw new RuntimeException(e.getMessage());
			}
		}
		return userVO;
	}
//		추천수
	
//		나를 추천한 사람
	
//		내가 추천한 사람
		



}
