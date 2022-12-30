
package crawling;


import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Soccer {
		   private WebDriver webDriver;
		   public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
		   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
		
		  
		   public static void main(String[] args) {
			   Soccer soccer = new Soccer();
			   String url = "https://sports.news.naver.com/wfootball/schedule/index";
			   WebDriver driver = soccer.webDriver;
			   int i = 0;
			  
//				운영체제에 웹 드라이버 설정
			   System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
			  
//		 		webDriver객체에 ChromeDriver 대입
				driver = new ChromeDriver();
				
//				원하는 경로를 브라우저에 전달
				driver.get(url);
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
				
//				driver.findElement(By.cssSelector("a._month_list_btn span.month")).click();
				driver.findElement(By.cssSelector("div.schedule_month li:nth-child(3)")).click();
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
				
				ArrayList<String> date = new ArrayList<String>();
				ArrayList<String> time = new ArrayList<String>();
				ArrayList<String> place = new ArrayList<String>();
				ArrayList<String> leftTeamName = new ArrayList<String>();
				ArrayList<String> rightTeamName = new ArrayList<String>();
				
				
				for(WebElement webElement :  driver.findElements(By.cssSelector("div.inner em"))) {
					date.add(webElement.getText());
				}
				
				for(WebElement webElement :  driver.findElements(By.cssSelector("div.inner span.time"))) {
					time.add(webElement.getText());
				}
				
				for(WebElement webElement : driver.findElements(By.cssSelector("div.inner span.place"))) {
					place.add(webElement.getText());
				}
				
				for(WebElement webElement : driver.findElements(By.cssSelector("span.team_left span.name"))) {
					leftTeamName.add(webElement.getText());
				}
				for(WebElement webElement : driver.findElements(By.cssSelector("span.team_right span.name"))) {
					rightTeamName.add(webElement.getText());
				}
				
				for (int j = 0; j < date.size(); j++) {
					System.out.println("날짜 : " + date.get(j) + "   시간 : "+time.get(j) + "   장소 : " + place.get(j) + "     "+ leftTeamName.get(j) + "  VS  " + rightTeamName.get(j));
				}
				
				
				
		   }
}
