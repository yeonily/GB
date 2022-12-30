package crawling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class myMelon {
	private WebDriver webDriver;
	private String url;
	public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	
	public myMelon() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		url = "https://www.melon.com/";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless"); //크롬 창이 눈에 안 보일 것임.
		
		webDriver = new ChromeDriver(options);
		webDriver.get(url);
		
	}
	
	public WebDriver selectLyric() {
		Scanner sc = new Scanner(System.in);
		WebElement input = null, form = null;
		
		List<WebElement> songNumberElements = null;
		List<WebElement> songTitleElements = null;
		List<WebElement> songArtistElements = null;
		
		ArrayList<String> songNumbers = new ArrayList<String>();
		ArrayList<String> songTitles = new ArrayList<String>();
		ArrayList<String> songArtists = new ArrayList<String>();
		
		String songNumber = null, songTitle = null, songArtist = null;
		int choice = 0;
		
		input = webDriver.findElement(By.className("ui-autocomplete-input"));
		
		System.out.print("노래제목 : ");
		input.sendKeys(sc.nextLine());
		input.sendKeys(Keys.RETURN);
		try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		
		form = webDriver.findElement(By.id("frm_searchSong"));
		
		songNumberElements = form.findElements(By.cssSelector("td.no div"));
		songTitleElements = form.findElements(By.cssSelector("td.t_left a.fc_gray"));
		
		for (int i = 0; i < songNumberElements.size(); i++) {
			songNumber = songNumberElements.get(i).getText();
			songTitle = songTitleElements.get(i).getText();
					
			songNumbers.add(songNumber);
			songTitles.add(songTitle);
		}
		
		for(WebElement webElement : form.findElements(By.cssSelector("div#artistName"))) {
			songArtistElements = webElement.findElements(By.cssSelector("span a.fc_mgray"));
			
			songArtist = songArtistElements.get(0).getAttribute("title").split(" - ")[0];
			if(songArtistElements.size() > 1) {
//				System.out.println(songArtistElements.get(0).getText());
				songArtist = songArtistElements.stream().map(v -> v.getAttribute("title")).map(v -> v.split(" - ")[0]).collect(Collectors.joining(","));
			}
			
			songArtists.add(songArtist);
		}
		
		for (int i = 0; i < songNumbers.size(); i++) {
			System.out.println(songNumbers.get(i) + " / " + songTitles.get(i) + " / " + songArtists.get(i));
		}
		
//		System.out.println(songNumbers);
//		System.out.println(songTitles);
//		System.out.println(songArtists);
		
		
//		System.out.println(songNumberElements.size());
//		System.out.println(songTitleElements.size());
//		System.out.println(songArtistElements.size());
		
		System.out.print("가사를 보고 싶은 곡 번호 : ");
		choice = sc.nextInt() - 1;
		
		form.findElements(By.className("btn_icon_detail")).get(choice).click();
		try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		
		System.out.println("=========" + songTitles.get(choice) + "가사 ===========");
		System.out.println(webDriver.findElement(By.className("lyric")).getText());
		
		return webDriver;
	}
	
	public void operate() {
		selectLyric();
		
//		webDriver.close();
		webDriver.quit();
	}
	
	public static void main(String[] args) {
		new myMelon().operate();
	}
}
