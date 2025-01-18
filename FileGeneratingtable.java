import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGeneratingtable {
    public static void main(String[] args) {

     /*   File mFile =new File("Table.txt");

        try {
            mFile.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }


*/
try {
    FileWriter fileWriter=new FileWriter("Table.txt");
    for(int i=1;i<=10;i++){
        try {
            fileWriter.write(i*2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    fileWriter.close();
}catch (IOException e){
    e.printStackTrace();
}



    }
}
