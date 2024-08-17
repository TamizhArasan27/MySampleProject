package org.base;


import java.awt.AWTException;







import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Actions a;
	
	public static Robot r;

	public static JavascriptExecutor js;
	
	public static TakesScreenshot ts;
	
	public static File f;
	
	public static Alert a1 ;
	
	public static Select s;
	
	public static FluentWait<WebDriver> f1;
	
	public static WebDriverWait w;
	
	
	public static void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
	public static void closeBrowser() {
		
		driver.close();
		}
	
	public static void maximizeWindow() {
		
		driver.manage().window().maximize();

	}
	
    public static void minimizeWindow() {
		
		driver.manage().window().minimize();

	}

	public static String getTitle() {
		
		String title = driver.getTitle();
		return title;

	}
	
	public static String pageUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	 
	public static void Get(String url) {
		driver.get(url);

	}
	
	public static void sendKeys(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	
	public static void click(WebElement element) {
		
		element.click();
	}
	
	// action class
	
	public static void actions() {
		a = new Actions(driver);
	}
	
	public static void moveToElement(WebElement element) {
		a.moveToElement(element);

	}
	
	public static void dragAndDrop(WebElement src,WebElement trg) {
		
		a.dragAndDrop(src,trg );
}
	
	public static void click() {
		a.click();

	}
	
	public static void doubleClick() {
		a.doubleClick();
		
	}
	
	public static void contextClick() {
		
        a.contextClick();
        
	}
	// robot Class
	
	public static void robot() throws AWTException {
		r = new Robot();		
}
	public static void copy() {
		
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_C);
	}
    public static void Paste() {
		
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
	}
    
    public static void tab() {
		
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
	}
    
    public static void CopyAll() {
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	 r.keyPress(KeyEvent.VK_A);
    	 
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_A);
 	}
   
    public static void backSpace() {
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);

	}
    
	
	
    public static void javaScriptExecutor() {
	js= (JavascriptExecutor)driver;	

	}
	//JavaScriptExecutor
	
	public static void alternativeSendKeys(String element,WebElement element1) {
		
    js.executeScript(element, element1);
    
	}
	
	public static void alternativeclick(String element,WebElement element1) {
		js.executeAsyncScript(element, element1);
	}
	
	public static void getAttribute(String element,WebElement element1 ) {
		
        js.executeScript(element, element1);
	}
	
	public static void scrollUp(WebElement element) {
		js.executeAsyncScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public static void scrollDown(WebElement element) {
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", element);
	}
	
	//TakeScreenshots
	public static void takeScreenShot(String value) throws IOException {
		
		ts= (TakesScreenshot)driver;
		File s1 = ts.getScreenshotAs(OutputType.FILE);

	    File d1 = new File(value);
	    
	    FileUtils.copyFile(s1, d1);
	    
	}
	//Alert
	
	public static void alert() {
		
		a1  = driver.switchTo().alert();
		
}
	
	public static void accept() {
		
        a1.accept();
	}
	
	public static void dismiss() {
		a1.dismiss();
		
	}
	
	public static void alertSendKeys(String value) {
		a1.sendKeys(value);

	}
	
	public static void alertGetText() {
		String value  = a1.getText();
		System.out.println(value);
	}
	
	public static void frame(int a) {
		driver.switchTo().frame(a);
	}
	
	public static void frame(String value) {
		driver.switchTo().frame(value);

	}
	
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);

	}
	
	public static void parentframe() {
		driver.switchTo().parentFrame();

	}
	public static void defaultcontent() {
		
        driver.switchTo().defaultContent();
	}
	
	public static void windows(String value) {
	
		driver.switchTo().window(value);

	}
	
	public static void getWindowsHandle() {
		String value = driver.getWindowHandle();
		System.out.println(value);
		
	}
	
	public static void getWindowsHandles(int a) {
	
		Set<String> s  = driver.getWindowHandles();
	
		List<String> li = new ArrayList<String>();
		
		li.addAll(s);
		
		System.out.println(li.get(a));
		
		driver.switchTo().window(li.get(a));
	}
	
	//select--class
	public static void select(WebElement ref) {
		
		s = new Select(ref);
}
	
	public static void selectByValue(String value) {
		
	  s.selectByValue(value);	

	}
	
	public static void selectVisibleText(String text) {
		
      s.selectByVisibleText(text);
	}
	
	public static  void selectByIndex(int a) {
		s.selectByIndex(a);

	}
	
	public static void isMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}
	
	public static  void getOptions() {
		
		List<WebElement> options = s.getOptions();
		
		List<WebElement> li = new ArrayList<WebElement>();
		
		for (WebElement webElement : li) {
			
			System.out.println(webElement.getText());
		}
		
		
			}
	public static  void getAllSelectedOptins() {
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		List<WebElement> li = new ArrayList<WebElement>();
		
		for (WebElement webElement : li) {
			System.out.println(webElement.getText());
			
		}
		}
	
	public static  void deselectByValue(String value) {
		
		s.deselectByValue(value);

	}
	
	public static void deselectByIndex(int a) {
		s.deselectByIndex(a);

	}
	
	public static void deselectByVisibleText(String text) {
		s.deselectByVisibleText(text);

	}
	
	public static void deselectAll() {
		s.deselectAll();

	}
	
	public static void staticWait(int a) throws InterruptedException {
	
		Thread.sleep(a);	

	}
	public static void implicitWait(int a) {
		
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	
	public static void fluentWait(int a) {
		f1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(a)).pollingEvery(Duration.ofMillis(250)).ignoring(Exception.class);

	}
	
	
	public static void WebdriverWait(int a) {
		
		w = new WebDriverWait(driver , Duration.ofSeconds(a));
		
	}
	
	public static void readFromExcel(String sheetname, int a, int b) throws IOException {
		
   	 File f = new File("C:\\Users\\Hp\\eclipse-workspace\\TestngProject\\Excel File\\Book2.xlsx");
   	 
   	 FileInputStream fin = new FileInputStream(f);
   	 
   	 Workbook w = new XSSFWorkbook(fin);
   	 
   	 Sheet sh = w.getSheet(sheetname);
   	 
   	 Row r = sh.getRow(a);
   	 
   	 Cell c = r.getCell(b);
   	 
   	 int type = c.getCellType();
   	 
       String name = "";
   	
   	 if (type==1) {
   		 
   		 name = c.getStringCellValue();
			
		} else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			
		SimpleDateFormat si = new SimpleDateFormat("dd/mmm/yyyy");
			name = si.format(d);
		}
   	 
   	 else {
   		 double d = c.getNumericCellValue();
   		 
   		 long l = (long)d;
   		 
   		 name = String.valueOf(l);

		}

	}
	
	
	
		
	

	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

