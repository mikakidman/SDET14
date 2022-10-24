package Class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("Opening the URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Closer the browser");
    }
}
class Chrome extends Browser{
    @Override
    void openBrowser() {
        System.out.println("Opening the browser in less than 1 sec");
    }
}
class Firefox extends Browser {
    @Override
    void openBrowser() {
        System.out.println("Opening the browser in less than 2 sec");
    }
}