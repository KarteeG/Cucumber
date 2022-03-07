package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static String value;

	public static WebDriver launchBroser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Driver//iedriverserver.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void waitImp(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void radioButton(WebElement element) {
		element.click();
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void alert(String type, WebElement element, String value) {
		try {
			if (type.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (type.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			} else if (type.equalsIgnoreCase("sendkeys")) {
				driver.switchTo().alert().sendKeys(value);
			} else if (type.equalsIgnoreCase("gettext")) {
				String text = driver.switchTo().alert().getText();
				System.out.println(text);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionsFunctions(String type, WebElement element, WebElement toelement) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (type.equalsIgnoreCase("Double Click")) {
			a.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("context")) {
			a.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("moveto")) {
			a.moveToElement(element).build().perform();
		} else if (type.equalsIgnoreCase("clickAndHold")) {
			a.clickAndHold(element).build().perform();
		} else if (type.equalsIgnoreCase("release")) {
			a.release(element).build().perform();
		} else if (type.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(element, toelement).build().perform();
		}
	}

	public static void swithFrames(String type, String value, WebElement element) {
		if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			driver.switchTo().frame(parseInt);
		} else if (type.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);
		} else if (type.equalsIgnoreCase("idorname")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void robotFunctions(String type) throws AWTException {
		Robot r = new Robot();
		if (type.equalsIgnoreCase("Down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}
//	public static void unitTest() {
//		try {
//			int a=0;
//			int b = 1/a;
//			System.out.println("val:"+b);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void windowHandles(String type, String title, String parentid) {
		if (type.equalsIgnoreCase("parent")) {
			String parent = driver.getWindowHandle();
			System.out.println("Parent Id :" + parent);
		} else if (type.equalsIgnoreCase("All")) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String all : windowHandles) {
				String titles = driver.switchTo().window(all).getTitle();
				System.out.println(titles);
			}
		} else if (type.equalsIgnoreCase("size")) {
			Set<String> windowHandles = driver.getWindowHandles();
			int size = windowHandles.size();
			System.out.println("ALL Windows Size: " + size);
		} else if (type.equalsIgnoreCase("specific")) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String s : windowHandles) {
				if (driver.switchTo().window(s).getTitle().equalsIgnoreCase(title)) {
					break;
				}
			}
		} else if (type.equalsIgnoreCase("closechildwindow")) {
			Set<String> all = driver.getWindowHandles();
			for (String s : all) {
				if (!s.equals(parentid)) {
					driver.switchTo().window(s);
					driver.close();
				}
			}
		}
	}

	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(value);
		}
	}

	public static void mulitDD(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.deselectByIndex(parseInt);
		} else if (type.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (type.equalsIgnoreCase("visible")) {
			s.deselectByVisibleText(value);
		} else if (type.equalsIgnoreCase("all")) {
			s.deselectAll();
		}
	}

	public static void dropDownOptions(String type, WebElement element) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = s.getOptions();
			for (WebElement all : options) {
				String text = all.getText();
				System.out.println(text);
			}
		} else if (type.equalsIgnoreCase("size")) {
			List<WebElement> options = s.getOptions();
			int size = options.size();
			System.out.println(size);
		} else if (type.equalsIgnoreCase("first")) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text = firstSelectedOption.getText();
			System.out.println(text);
		} else if (type.equalsIgnoreCase("all")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allselected : allSelectedOptions) {
				String text = allselected.getText();
				System.out.println(text);
			}
		} else if (type.equalsIgnoreCase("multiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		}
	}

	public static void elementConfirm(String type, WebElement element) {
		if (type.equalsIgnoreCase("isdisplay")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} else if (type.equalsIgnoreCase("isenables")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} else if (type.equalsIgnoreCase("isselected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		} else if (type.equalsIgnoreCase("gettext")) {
			String text = element.getText();
			System.out.println(text);
		}
	}

	public static void getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}

	public static void getDrivers(String type) {
		if (type.equalsIgnoreCase("title")) {
			String title = driver.getTitle();
			System.out.println(title);
		} else if (type.equalsIgnoreCase("currenturl")) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
	}

	public static void screenShot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\u\\eclipse-workspace\\Revised_Maven\\target\\Screen\\" + value);
		FileUtils.copyFile(screenshotAs, Destination);

	}

	public static void JavaScroll(String type) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollDown")) {
			js.executeScript("window.scrollBy(0,350)");
		} else if (type.equalsIgnoreCase("scrollup")) {
			js.executeScript("window.scrollBy(0,-500)");
		} else if (type.equalsIgnoreCase("scroll")) {
			js.executeScript("window.scroll(0,0)");
		}
	}

	public static void javaScriptOptions(String type, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("click")) {
			js.executeScript("arguments[0].click()", element);
		} else if (type.equalsIgnoreCase("Checkedtrue")) {
			js.executeScript("arguments[0].checked=true", element);
		} else if (type.equalsIgnoreCase("Checkedfalse")) {
			js.executeScript("arguments[0].checked=false", element);
		} else if (type.equalsIgnoreCase("scrollIntoView")) {
			js.executeScript("arguments[0].scrollIntoView();", element);
		}
		{

		}
	}

	public static String readExcel(String path, int Row_Index, int Col_Index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Cell cell = sheetAt.getRow(Row_Index).getCell(Col_Index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int v = (int) numericCellValue;
			value = String.valueOf(v);
			wb.close();
		}return value;
	}

}
