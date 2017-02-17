package filet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by suffee on 2017/2/17.
 */
public class CreateSequentialFile {

    private ObjectOutputStream outputStream;

    public void openFile(){
         try{
             outputStream = new ObjectOutputStream(new FileOutputStream("test"));
         }
         catch (IOException ioe){

             System.err.println("Error opening file.");
         }
    }

    public void addRecords(){

        AccountRecordsSerializable temp_record;
        int account_Number;
        String name;
        double money;
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            try{

                account_Number = input.nextInt();
                name = input.next();
                money = input.nextDouble();

                temp_record = new AccountRecordsSerializable(account_Number,name,money);
                outputStream.writeObject(temp_record);

            }
            catch (IOException ioe){

                System.err.println("Error Writing to file.");
                return;
            }
            catch (NoSuchElementException nsee){

                System.err.println("Invalid input,try again");
                input.nextLine();
            }

            System.out.println("account name money.");
        }

    }

    public void closeFile(){

        try {
            if(outputStream!=null)
                outputStream.close();
        }
        catch (IOException ioe){

            System.err.println("Error closing file.");
            System.exit(1);

        }
    }
}