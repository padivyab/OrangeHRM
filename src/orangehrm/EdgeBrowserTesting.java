package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public static void main(String[] args) {

        EdgeBrowserTesting e=new EdgeBrowserTesting();
        e.edgeTesting();

    }
    public void edgeTesting()
    {
        String BaseUrl = "https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver d=new EdgeDriver();
        d.get(BaseUrl);
        d.manage().window().maximize();
        String title= d.getTitle();
        System.out.println(title);
        d.close();

    }
}
