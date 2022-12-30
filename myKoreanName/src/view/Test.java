package view;

import java.io.IOException;

import dao.NameDAO;

public class Test {
	public static void main(String[] args) {
		NameDAO nameDAO = new NameDAO();
		try {
			nameDAO.merge("boy.txt", "girl.txt", "names.txt");
			nameDAO.updateRanking("names.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
