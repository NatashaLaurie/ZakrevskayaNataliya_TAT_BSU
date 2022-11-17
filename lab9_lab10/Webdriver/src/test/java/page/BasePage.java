package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver chromeDriver;
    protected final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(10);

    protected abstract BasePage openPage();

    protected BasePage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

}
