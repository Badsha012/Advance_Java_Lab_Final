import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(3000)) {

            System.out.println("Server Running...");

            HashMap<Integer, String> students = new HashMap<>();

            while (true) {

                Socket socket = serverSocket.accept();

                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(socket.getInputStream()));

                String data = reader.readLine();

                if (data != null) {

                    String[] parts = data.split(",");

                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int marks = Integer.parseInt(parts[2]);

                    students.put(id, name + " , Marks = " + marks);

                    System.out.println("\nStudent Records:");

                    for (Integer studentId : students.keySet()) {
                        System.out.println(
                                "ID: " + studentId +
                                " | " + students.get(studentId));
                    }
                }

                socket.close();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}