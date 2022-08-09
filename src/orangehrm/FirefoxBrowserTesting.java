package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTesting {

    public static void main(String[] args) {

        FirefoxBrowserTesting f=new FirefoxBrowserTesting();
        f.fireFoxTesting();

    }
    public void fireFoxTesting()
    {
        String BaseUrl = "https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver d=new FirefoxDriver();
        d.get(BaseUrl);
        d.manage().window().maximize();
        String title = d.getTitle();
        System.out.println(title);
        d.close();

    }
}
