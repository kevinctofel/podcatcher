import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URLConnection;
import org.apache.commons.io.*;

public class podcatcher {

    // private static final URL http = null;

    public static void main(final String args[]) throws MalformedURLException, IOException {

        
        for(int episode = 1; episode<=500; episode++) {

        final URL FILE_URL = new URL("http://traffic.libsyn.com/motr/MOTR_" + episode +".mp3");
        final String FILE_NAME = FILE_URL.getFile().substring(6);
        final int CONNECT_TIMEOUT = 1000;
        final int READ_TIMEOUT = 1000;

        try {
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(FILE_NAME + " doesn't exist.");
        } System.out.println("Getting episode " + episode + " now.");
        FileUtils.copyURLToFile((FILE_URL), new File(FILE_NAME), CONNECT_TIMEOUT, READ_TIMEOUT);
    

        System.out.println("File " + FILE_NAME + " downloaded!");
            

    }
}
}