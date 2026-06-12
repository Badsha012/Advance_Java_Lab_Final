import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is Waiting...");

            Socket s = ss.accept();

            DataInputStream dis =
                    new DataInputStream(s.getInputStream());

            int id = dis.readInt();
            String name = dis.readUTF();
            int marks = dis.readInt();

            System.out.println("Student Information:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);

            dis.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}