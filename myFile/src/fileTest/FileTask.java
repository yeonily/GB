package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {

	public static void main(String[] args) throws IOException{
//		고등어, 갈치, 꽁치, 전어
//		배열로 출력하고 전체 내용 가져와서 콘솔에 출력하기
		
		String[] fishs = {"고등어", "갈치", "꽁치", "전어"};
		
		
//		try {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.txt"));
////		for (int i = 0; i < fishs.length; i++) {
////			bufferedWriter.write(fishs[i]);
////		}
//		for (String fish : fishs) {
//			bufferedWriter.write(fish + "\n");
//		}
//		bufferedWriter.close();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	
//	
//	File file = new File("test2.txt"); 
//	try {
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//		String line = null;
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
//		bufferedReader.close();
//	} catch (FileNotFoundException e) {
//		System.out.println("해당 경로는 존재하지 않습니다");
//	} catch (IOException e) { 
//		e.printStackTrace();
//	}
		
		
//		수정(갈치 -> 연어)
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
			String line = null, temp = "";
			
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals("갈치")) {//검색먼저, 다음에 수정
					temp += "연어\n";
					continue;
				}
				temp += line + "\n";
			}
			
			bufferedReader.close();
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로입니다");
		}
		
//		고등어 삭제
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
			String line = null, temp = "";
			
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals("고등어")) {
					continue;
				}
				temp += line + "\n";
			}
			bufferedReader.close();
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로입니다");
		}
		

	}

}
