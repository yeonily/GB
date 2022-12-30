package test;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DBConnecter;

public class Test {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = DBConnecter.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}
		
	}
}
