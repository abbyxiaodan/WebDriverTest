package selenium.WebDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by wu_dan on 2018/4/27.
 */
public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\autotest\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");
        //获取网页的title
        System.out.println("The testing page title is:"+driver.getTitle());
        //找到输入框元素的id,然后输入hello
        driver.findElement(By.id("kw")).sendKeys(new String[]{"hello"});
        //点击按钮
        driver.findElement(By.id("su")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //退出浏览器
        driver.quit();
    }
}
