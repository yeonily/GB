package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException{
//		절대 경로 : 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//		상대 경로 : 현재 위치에 따라 변경되는 경로, ../a/b
		
//		try {
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true)); //경로 전달
//																//FileWriter가 Writer로 업캐스팅
//			bufferedWriter.write("한동석\n"); //write()로 작성, \n으로 구분.
//			bufferedWriter.newLine(); // 줄바꿈 메소드, JVM이 운영체제에 맞는 줄바꿈으로 바꿔줌. \r\n으로 구분.
//			bufferedWriter.write("졸려");
//			bufferedWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		File file = new File("test.txt"); //경로 전달
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);//줄바꿈은 가져오지 않음, 출력은 println이라서 줄바꿈되어서 출력됨.
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로는 존재하지 않습니다");
		} catch (IOException e) { //IOException이 부모이니 한번에 오류처리하는 게 어떤지 경고문
			e.printStackTrace();
		}

		if(file.exists()) {//있는지 없는지 검사하고, 해당 경로가 존재하면
			System.out.println(file.delete()); // 삭제
		}
		
		
			
		
	}

}
