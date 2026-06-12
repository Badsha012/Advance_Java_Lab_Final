import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Badsha");
        students.add("Rahim");
        students.add("Karim");

        for(String s : students) {
            System.out.println(s);
        }
    }
}