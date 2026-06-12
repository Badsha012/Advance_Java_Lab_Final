import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 5000);

            DataOutputStream dos =
                    new DataOutputStream(s.getOutputStream());

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            dos.writeInt(id);
            dos.writeUTF(name);
            dos.writeInt(marks);

            System.out.println("Data Sent Successfully!");

            dos.close();
            s.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}