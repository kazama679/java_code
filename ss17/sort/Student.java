//package ss17.sort;
//
//public class Student {
//    private String name;
//    private int age;
//    private int StudentId;
//
//    public Student(String name, int age, int studentId) {
//        this.name = name;
//        this.age = age;
//        StudentId = studentId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getStudentId() {
//        return StudentId;
//    }
//
//    public void setStudentId(int studentId) {
//        StudentId = studentId;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String toString(){
//        return "Name: "+name+"\nAge: "+age+"\nStudentId: "+StudentId;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        if(this.age > o.age){
//            return 1;
//        }else if(this.age == o.age){
//            return 0;
//        }else {
//            return -1;
//        }
//        return this.age - o.age;
//    }
//}
