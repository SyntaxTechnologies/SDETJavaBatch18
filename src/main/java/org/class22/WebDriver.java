package org.class22;

public interface WebDriver {

    void openBrowser();

    void closeBrowser();
    void maximizeWindow();


}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize in Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize in Firefox ");
    }
}
class WebTester {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver t:arr){
            t.openBrowser();
            t.closeBrowser();
            t.maximizeWindow();
        }
    }
}