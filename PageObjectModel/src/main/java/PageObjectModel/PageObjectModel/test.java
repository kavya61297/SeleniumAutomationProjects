package PageObjectModel.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		//driver.findElement(By.id(""));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[2]")).click();
		//code to register
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kavyasairam612");
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("kavyasairam612");
		//driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("kavyasairam612");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/p/a")).click();
	
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kavyasairam612");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("kavyasairam612");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/button")).click();
									
		System.out.println("clicking the button");
		// Using contains() to create a dynamic XPath
        String dynamicClass = "[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/div/div[2]/button"; // The dynamic part of the class
        String xpathExpression = "//button[contains(@class, '" + dynamicClass + "')]";

        // Find the element using dynamic XPath
        WebElement dynamicElement = driver.findElement(By.xpath(xpathExpression));
        dynamicElement.click();
        
       // class="MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root card-button css-54wre3"
        
      //*[@id="root"]/div/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/button
		
		//driver.findElement(By.cssSelector("#root > div > div > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-undefined.css-1d3bbye > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-9.product-grid.css-14gqd74 > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-2.css-1msksyp > div:nth-child(2) > div > div.MuiCardActions-root.MuiCardActions-spacing.card-actions.css-3zukih > button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/button[2]/svg")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div[3]/button")).click();
		driver.findElement(By.className("MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root")).click();
		
		//html/body/div/div/div/div[3]/div[2]/div/div[3]/button
		driver.findElement(By.xpath("//*[@id=\"add-new-btn\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/textarea[1]")).sendKeys("#20,xyz main road, abc palya, bglr-000000");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div/div[1]/span/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/button[2]")).click();
		
       //logout
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
