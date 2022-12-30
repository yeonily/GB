package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.UserVO;

public class UserDAO {
//	- 아이디 중복검사
//	- 회원가입(동일한 핸드폰 번호로 3번(탈퇴된 계정 포함)까지만 가입 가능)		
//	- 로그인
//	- 아이디 찾기
//	- 회원정보 수정
//	- 회원번호로 회원 전체 정보 검색
//	- 회원탈퇴(어떤 계정을 탈퇴할 지 선택)
//	- 회원탈퇴 복구(어떤 계정을 복구할 지 선택)
	
	public Connection connection; 
	public PreparedStatement preparedStatement;
	public ResultSet resultSet; 
	
	//아이디 중복검사
	public boolean checkId(String id) {
		String query = "select count(userId) from tbl_user where userId = ?"; // 매개변수가 들어갈 자리에는 ? 써주면 됨.
		boolean check = false;
		try { 
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id); 
			resultSet = preparedStatement.executeQuery(); 
			resultSet.next(); 
			check = resultSet.getInt(1) == 1; 
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("checkId()에서 쿼리문 오류");
		} finally {
			try {
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
		return check;
	}
	
	//가입된 핸드폰 번호 갯수
	private int phoneNumberCount(String phone) {
		String query = "select count(userPhoneNumber) from tbl_user where userPhoneNumber = ? ";
		int count = 0;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, phone);
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			count = resultSet.getInt(1);
//			System.out.println("들어옴");
//			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("phoneNumberCount()에서 쿼리문 오류");
		} finally {
			try {
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
		return count;
	}
	
	//회원가입
	public void insert(UserVO userVO) {
		String query = 	"INSERT INTO tbl_user"
						+ "(userId, userPassword, userName, userAge, userPhoneNumber, userStatus, userBirth)"
						+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userVO.getUserId());
			preparedStatement.setString(2, userVO.getUserPassword());
			preparedStatement.setString(3, userVO.getUserName());
			preparedStatement.setString(4, userVO.getUserAge());
			preparedStatement.setString(5, userVO.getUserPhoneNumber());
			preparedStatement.setInt(6, userVO.getUserStatus());
			preparedStatement.setString(7, userVO.getUserBirth());
			
			//같은 폰번호가 3개 이하라면 회원가입 진행
			if(phoneNumberCount(userVO.getUserPhoneNumber()) <= 3) {
//				System.out.println("들어옴");
				preparedStatement.executeUpdate();
			} else {
				//아니라면 회원가입 실패
				System.out.println("동일 번호로 가입 횟수 초과, 회원가입 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert()에서 쿼리문 오류");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류");
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
	
	//로그인
	public int login(String userId, String userPassword) {
		String query = "select userNumber from tbl_user where userId = ? and userPassword = ? ";
		int userNumber = 0;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPassword);
			resultSet = preparedStatement.executeQuery(); 
			
			if(resultSet.next()){
				userNumber = resultSet.getInt(1);
			}
			
		} catch (SQLException e) {
			System.out.println("login()에서 쿼리문 오류");
		} finally {
			try {
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
		return userNumber;
	}
	
//	- 아이디 찾기
	public String findId(String userPhone) {
		String query = "SELECT userId FROM TBL_user WHERE userPhoneNumber = ?";
		String userId = null;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userPhone);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userId = resultSet.getString(1); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findId() 쿼리문 오류");
		} finally {
			try {
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
		return userId;
	}
	
//	- 회원정보 수정
	public void update(UserVO userVO) {
		String query = "update tbl_user "
				+ "set userId = ?, userPassword = ?, userName = ?, userAge = ?, userPhoneNumber = ?, userStatus = ?, userBirth = ?"
				+ "where userNumber = ?";
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userVO.getUserId());
			preparedStatement.setString(2, userVO.getUserPassword());
			preparedStatement.setString(3, userVO.getUserName());
			preparedStatement.setString(4, userVO.getUserAge());
			preparedStatement.setString(5, userVO.getUserPhoneNumber());
			preparedStatement.setInt(6, userVO.getUserStatus());
			preparedStatement.setString(7, userVO.getUserBirth());
			preparedStatement.setInt(8, userVO.getUserNumber());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update() 쿼리 오류");
			e.printStackTrace();
		}finally {
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
//	- 회원번호로 회원 전체 정보 검색
	
//	- 회원탈퇴(어떤 계정을 탈퇴할 지 선택)
	
//	- 회원탈퇴 복구(어떤 계정을 복구할 지 선택)
	
	
	
	
	
	
	
	
	
}
