package crawling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myCGV {
	private WebDriver webDriver;
	public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	
	public static void main(String[] args) {
		myCGV cgv = new myCGV();				
		String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
		WebDriver driver = cgv.webDriver;
	    Scanner sc = new Scanner(System.in);
	    String countText = null;
	    int i = 0, total = 0;

		
//		운영체제에 드라이버 설정
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
//		WebDriver객체에 크롬 드라이버 대입
		driver = new ChromeDriver();
		
//		원하는 경로를 브라우저에 전달
		driver.get(url);
		try {Thread.sleep(1000);} catch (InterruptedException e) {;}//컴파일러가 빨라서 작업 뒤에는 항상 컴파일러 1초 재워주기
		
//		더 보기 버튼 클릭
		driver.findElement(By.className("btn-more-fontbold")).click();
		try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		//영화 총 51개
		
//      영화 제목 가져오기
//      for(WebElement webElement : driver.findElements(By.cssSelector("div.box-contents strong.title"))) {
//         System.out.println(++i + ". " + webElement.getText());
//      }
      
//		[실습] 예매율도 가져오기
		List<WebElement> reservationRates = driver.findElements(By.cssSelector("div.box-contents strong.percent span"));
		List<WebElement> names = driver.findElements(By.cssSelector("div.box-contents strong.title"));
		
		
		for (int j = 0; j < names.size(); j++) {
			System.out.println(++i + ". " + names.get(j).getText() + " / " + reservationRates.get(j).getText());
		}
		
//		[실습] 장르도 가져오기
//      List<WebElement> genres = driver.findElements(By.cssSelector("div.spec dl dt"));
//		
//      driver.get(genres.get(i).getAttribute("href"));
//      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//      
//      driver.get(driver.findElement(By.id("ticket_iframe")).getAttribute("src"));
//      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//      
//		for (int j = 0; j < genres.size(); j++) {
//			System.out.println(genres.get(j).getText());
//		}
      
//      //사용자가 예매할 영화번호 입력
//      i = sc.nextInt();
//      i--;
//      
////      예매하기 버튼 다 가져오기
//      List<WebElement> btns = driver.findElements(By.className("link-reservation"));
//      
////      예매하기 버튼은 클릭 안되기 때문에, 이동할 경로를 직접 가져온다.
////      가져온 경로를 직접 브라우저 주소창(URL)에 넣어준다.
//      driver.get(btns.get(i).getAttribute("href"));
//      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//      
////      극장 정보는 새로운 iframe에 담겨있기 때문에,
////      현재 브라우저의 주소창(URL)을 iframe src(경로)로 변경해준다.
//      driver.get(driver.findElement(By.id("ticket_iframe")).getAttribute("src"));
//      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//      
//      for(WebElement webElement : driver.findElements(By.className("count"))) {
//         countText = webElement.getText();
//         if(countText.length() == 0) {continue;}
//         total += Integer.valueOf(countText.substring(1, countText.length() - 1));
//      }
//      
//      System.out.println("예매 가능한 영화관 수 : " + total);

		
//		크롬 종료
		driver.close();
		driver.quit();
	}
}
