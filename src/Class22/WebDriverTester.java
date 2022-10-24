package Class22;

public class WebDriverTester {
    public static void main(String[] args) {

        /*Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.startBrowser();*/

        /*
        Chrome chrome= new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome, fireFox, safari};
         */

        WebDriver[] browsers={new Chrome(), new FireFox(), new Safari()};
        for(WebDriver browser: browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        for(int i=0; i<browsers.length; i++){
       browsers[i].startBrowser();
browsers[i].test();
browsers[i].closeBrowser();
}
}
}