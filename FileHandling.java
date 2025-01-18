import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args)  {

//        File myFile=new File("MyfirstTextFile.txt");
//
//        myFile.createNewFile();

    /*    this is for writing data inside a file

     try {
            FileWriter fileWriter=new FileWriter("MyfirstTextFile.txt");
            fileWriter.write("This is my first file in java by which i am learning file handling");
            fileWriter.close();
        }catch (IOException  e){
            System.out.println("File not founnd");;
        }



*/

    /* reading a file data

        File mFile=new File("MyfirstTextFile.txt");
        try {
            Scanner sc=new Scanner(mFile);
            while (sc.hasNextLine()){
                String line= sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        }catch (IOException e){
            e.printStackTrace();
        }


     */


        /*deleting a file


         */

        File dfile=new File("MyfirstTextFile.txt");

        if( dfile.delete()){
            System.out.println("File deleted successfully!!");
        }
        else{
            System.out.println("file not found!!");
        }


        }

}
