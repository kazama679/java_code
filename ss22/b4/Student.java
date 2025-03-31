package ss22.b4;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private double score;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String toString(){
        return "name: " + name + " age: " + age + " score: " + score;
    }
}
