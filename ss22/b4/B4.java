package ss22.b4;

import ss22.b4.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(19, "NVQ", 8.4));
        students.add(new Student(18, "NVA", 7.4));
        students.add(new Student(21, "NVC", 6.4));
        writeToFile(students);
        readFromFile();
    }

    public static void writeToFile(List<Student> listStudents) {
        File file = new File("student.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudents);
            oos.flush();
            System.out.println("Đã ghi đối tượng vào file student.dat");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void readFromFile() {
        File file = new File("student.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            List<Student> listStudents = (List<Student>) ois.readObject();
            listStudents.forEach(System.out::println);
            System.out.println("Đã đọc đối tượng từ file student.dat");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
