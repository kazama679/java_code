package ss22.b10;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void addStudent(Scanner scanner) {
        Student student = new Student();
        student.addStudent(scanner);
        B10.students.add(student);
    }

    public static void saveToFile(List<Student> listStudent) {
        File file = new File("b10.txt");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudent);
            oos.flush();
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

    public static void loadFromFile() {
        File file = new File("b10.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            List<Student> listStudent = (List<Student>) ois.readObject();
            listStudent.forEach(System.out::println);
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
    public static Student findTopStudent() {
        return B10.students.stream().max(Comparator.comparingDouble(student->student.getGpa())).orElse(null);
    }
    public static List<Student> searchByMajor(String major) {
        return B10.students.stream().filter(student -> student.getMajor().equals(major)).toList();
    }
    public static double calculateAverageGpa(){
        return B10.students.stream().mapToDouble(Student::getGpa).sum() / B10.students.size();
    }
}
