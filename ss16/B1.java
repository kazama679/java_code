package ss16;

import java.util.ArrayList;
import java.util.Iterator;

public class B1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Nguyen Van A");
        students.add("Nguyen Van B");
        students.add("Nguyen Van C");
        students.add("Nguyen Van E");
        students.add("Nguyen Van D");

        System.out.println("Duyệt bằng vòng lặp for:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("\nDuyệt bằng vòng lặp foreach:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\nDuyệt bằng Iterator:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}