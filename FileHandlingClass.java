import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingClass {

    public static void main(String[] args) throws IOException {
     File myFile=new File("student.txt");
     myFile.createNewFile();



     FileWriter myWriter=new FileWriter("javaClass.txt");
     myWriter.write("badsha");
     myWriter.close();

     Scanner myReader =new Scanner(myFile);
     String data =myReader.nextLine();
     System.out.println(data);
     myReader.close();


    }
}