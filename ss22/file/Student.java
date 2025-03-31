package ss22.file;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public String toString(){
        return "id: " + id + " name: " + name + " age: " + age;
    }
}
