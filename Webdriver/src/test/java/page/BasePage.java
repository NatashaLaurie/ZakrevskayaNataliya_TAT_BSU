package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    protected abstract BasePage openPage();

    protected JavascriptExecutor executor;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        executor = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

}
