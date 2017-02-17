package filet;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by suffee on 2017/2/17.
 */
public class ReadSequentialFile {

    private ObjectInputStream inputStream;

    public void openFile(){
        try{
            inputStream = new ObjectInputStream(new FileInputStream("test"));
        }
        catch (IOException ioe){

            System.err.println("Error opening file.");
        }
    }

    public void readFile(){

        AccountRecordsSerializable temp_record;
        System.out.println("Account Name Money");

        try{
            while(true){
                temp_record = (AccountRecordsSerializable)inputStream.readObject();

                System.out.println(temp_record.getAccount_Number()+temp_record.getName()+temp_record.getMoney());

            }
        }catch (EOFException eof){

            return;

        }catch (ClassNotFoundException cnfe){

            System.err.println("Unable to create object.");

        }catch (IOException ioe){

            System.err.println("Error during read from file.");

        }
    }
    public void closeFile(){

        try {
            if(inputStream!=null)
                inputStream.close();
        }
        catch (IOException ioe){

            System.err.println("Error closing file.");
            System.exit(1);

        }
    }

}

