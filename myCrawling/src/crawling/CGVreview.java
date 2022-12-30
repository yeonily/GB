package crawling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CGVreview {
	private WebDriver webDriver;
	public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	
	public static void main(String[] args) {
		CGVreview cgv = new CGVreview();
		String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
		WebDriver driver = cgv.webDriver;
		Scanner sc = new Scanner(System.in);
		String countText = null;
		int i = 0, total = 0;
		
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		driver = new ChromeDriver();
		
		driver.get(url);
		try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		
		//더보기 클릭
//		driver.findElement(By.className("btn-more-fontbold")).click();
//		try {Thread.sleep(1000);} catch (InterruptedException e) {;}

		//영화명 출력
		for(WebElement webElement : driver.findElements(By.cssSelector("div.box-contents strong.title"))) {
			System.out.println(++i + ", " + webElement.getText());
		}
		
		//영화명, 예매비율, 개봉일자 출력
//		List<WebElement> names = driver.findElements(By.cssSelector("div.box-contents strong.title"));
//		List<WebElement> reservationRates = driver.findElements(By.cssSelector("div.score strong.percent"));
//		List<WebElement> releasedDate = driver.findElements(By.className("txt-info"));
//		
//		for (int j = 0; j < names.size(); j++) {
//			System.out.println(++i +". "+ names.get(j).getText() 
//					+ " / " + reservationRates.get(j).getText()
//					+ " / " + releasedDate.get(j).getText());
//		}
		
		//장르 출력
//		ArrayList<String> reservationRates = new ArrayList<String>();
//		ArrayList<String> names = new ArrayList<String>();
//		ArrayList<String> hrefs = new ArrayList<String>();//링크를 담은 list
//		ArrayList<String> genres = new ArrayList<String>();
//		
//		for (WebElement webElement : driver.findElements(By.cssSelector("div.box-contents strong.title"))) {
//			names.add(webElement.getText());
//		}
//		
//		for (WebElement webElement : driver.findElements(By.cssSelector("div.score strong.percent"))) {
//			reservationRates.add(webElement.getText());
//		}
//		
//		//영화 이미지의 하이퍼링크로 이동
//		for(WebElement webElement : driver.findElements(By.cssSelector("div.box-image a"))) {
//			//하이퍼링크 속성을 담음
//			String href = webElement.getAttribute("href");
//			//시작페이지는 바로 다음 반복으로 
//			if(href.equals("http://www.cgv.co.kr/movies/?lt=1&ft=0#")) {continue;}
//			//리스트에 하이퍼링크 담기
//			hrefs.add(webElement.getAttribute("href"));
//		}
//		
//		for (String href : hrefs) {
//			driver.get(href);
//			for(WebElement webElement : driver.findElements(By.cssSelector("div.spec dl dt"))) {
//				String genre = webElement.getText();
//				//장르로 시작하는 dt 가져오기
//				if(genre.startsWith("장르")) {
//					genres.add(genre);
//				}
//			}
//		}
//		
//		for(int j = 0; j < names.size(); j++) {
//			System.out.println(++i + ". " + names.get(j) + ", " + reservationRates.get(j) + ", " + genres.get(j));
//		}
		
		//예매하기 출력
		
		//예매할 영화 입력
		System.out.print("예매할 영화 : ");
		i = sc.nextInt();
		i--;
		
		//찾는 게 단수이면 findElement
		//찾는 게 복수이면 findElements
		List<WebElement> btns = driver.findElements(By.className("link-reservation"));
		
		//driver.get(url) >> url에 각 하이퍼링크 주소를 넣어준 것임.
		driver.get(btns.get(i).getAttribute("href"));
		//콘솔창이 더 빠르기 떄문에 1초 멈추기
		try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		
		//iframe, src 안으로 url 이동
		driver.get(driver.findElement(By.id("ticket_iframe")).getAttribute("src"));
		try {Thread.sleep(2000);} catch (InterruptedException e) {;}
		
		for (WebElement webElement : driver.findElements(By.className("count"))) {
			countText = webElement.getText();
			if(countText.length() == 0) {continue;}
			total += Integer.valueOf(countText.substring(1, countText.length() - 1));
		}
		
		System.out.println("예매 가능한 영화관 수 : " + total);
		
		
		
//		driver.close();
		driver.quit();
	}
	
}
