package ss22.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<Student>();
        listStudents.add(new Student(18, 1,"Nguyễn Văn A"));
        listStudents.add(new Student(18, 2,"Nguyễn Văn B"));
        listStudents.add(new Student(18, 3,"Nguyễn Văn C"));
        listStudents.forEach(System.out::println);
    }

    public static void writeToFile(List<Student> listStudents) {
        /*
         * B1: Khởi tạo đối tượng File
         * B2: Khởi tạo đối tượng FileOutputStream
         * B3: Khởi tạo đối tượng ObjectOutputStream
         * B4: Sử dụng phương thức write của ObjectOutputStream để ghi dữ liệu từ ra file
         * B5: Đẩy dữ liệu từ stream --> file (flush)
         * B6: Đóng file
         * */
        //B1:
        File file = new File("demo.txt");
        //B2:
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudents);
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

    public static void readFromFile() {
        /*
         * B1: Khởi tạo đối tượng file
         * B2: Khởi tạo đối tượng FileInputStream
         * B3: Khởi tạo đối tượng ObjectInputStream
         * B4: sử dụng phương thức read của ObjectInputStream để đọc dữ liệu file
         * B5: Đóng file
         * */
        File file = new File("demo.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            List<Student> listStudents = (List<Student>) ois.readObject();
            listStudents.forEach(System.out::println);
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
