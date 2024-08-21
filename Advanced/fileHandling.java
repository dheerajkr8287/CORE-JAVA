

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
//      code to create a new file
        /*
        File myfile=new File("file1.txt");
        try{
            myfile.createNewFile();

        }
        catch(IOException e){
            System.out.println("unable to create a file");
            e.printStackTrace();
        }


//        code to write a file
        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write("this is file handling course and thankyou! ");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


        //reading a file

        File myfile=new File("file1.txt");
        try{
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()){  //Returns true if there is another line in the input of this scanner. This method may block while waiting for input. The scanner does not advance past any input.
                String line= sc.nextLine();
                System.out.println(line);
            }


        }
        catch( FileNotFoundException e ){
            e.printStackTrace();
        }

         */

//delete a file


        File myfile=new File("file1.txt");
        if(myfile.delete()){
            System.out.println("I hava deleted :"+myfile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting a file");
        }





    }
}
