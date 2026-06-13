import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandle {

    public static void main(String[] args) {
        // ১. এখানে try ব্লক শুরু করা হলো
        try {
            File file = new File("Student.txt"); // 'Studet.txt' ঠিক করে 'Student.txt' করা হলো
            FileWriter writer = new FileWriter(file);
            
            writer.write("ID: 101\n");
            writer.write("Name: Badsha\n");
            writer.write("Marks: 85\n");
            writer.close();
            
            System.out.println("Successful ");
            
            Scanner sc = new Scanner(file);
            System.out.println("\nFile Content:");
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
            
        } catch(Exception e) { // ২. এখন catch ব্লকটি সঠিকভাবে কাজ করবে
            System.out.println(e);
        }
    }
}
