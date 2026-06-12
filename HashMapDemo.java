import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> student = new HashMap<>();

        student.put(101, "Badsha");
        student.put(102, "Rahim");

        System.out.println(student);

        System.out.println(student.get(101));
    }
}