package ss20.b4;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person() {
    }

    public Person(String name,LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = Period.between(this.birthDate, now);
        return period.getYears();
    }

    public void printInfo() {
        System.out.println("Tên: "+ getName()+", Ngày sinh: "+ getBirthDate()+", Tuổi: "+getAge());
    }
}
