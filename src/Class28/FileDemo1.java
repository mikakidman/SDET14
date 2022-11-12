package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        right click on your file and click copypathreference then click from Content root
         */
        var path="Data/config.properties";//location of the file
        var fileInputStreem=new FileInputStream(path); //it helps us to navigate to the file
        var properties=new Properties(); //that special software which helps us read data
        properties.load(fileInputStreem); //loads all the data from the file inside
        System.out.println(properties.getProperty("URL"));
    }
}
