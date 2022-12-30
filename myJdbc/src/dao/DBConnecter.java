package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	//DB와 연결 공식
	public static Connection getConnection() {
		
		Connection connection = null;
		try {
//			연결에 필요한 정보
			//자바에서는 데이터로 작성해서 로그인함.(DBeaver에서 create해서 로그인했던 내용)
			String userName = "hr";
			String password = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 직접 url을 써줘야 함. url = DBMS를 접근할 수 있는 경로.
			
//			드라이버를 메모리에 할당
			//jar파일에 드라이버가 있음.
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 경로가 잘못되어 있으면 ClassNotFoundException 발생. try-catch잡아줘야 함.
			
//			정보를 전달하여 연결 객체 가져오기
			connection = DriverManager.getConnection(url, userName, password); // 잘 못 가져올 수 있으니까 try-catch잡아줘야 함.(SQLException)
			
			System.out.println("연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		} catch (Exception e) { // 알 수 없는 오류가 발생할 수 있으니 마지막에 Exception으로 다 잡아주기
			System.out.println("알 수 없는 오류");
		}
				
		return connection;
	}
}
