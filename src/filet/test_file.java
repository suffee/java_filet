package filet;

import java.io.Console;

/**
 * Created by suffee on 2017/2/17.
 */
public class test_file {

    public static void main(String args[]){

        CreateSequentialFile application = new CreateSequentialFile();

        application.openFile();
        application.addRecords();
        application.closeFile();

        System.out.println("\n\n\n\n\n\n\n\n");

        ReadSequentialFile app2 = new ReadSequentialFile();

        app2.openFile();
        app2.readFile();
        app2.closeFile();

    }
}
