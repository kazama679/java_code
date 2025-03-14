package ss10.b3;

import java.time.LocalDate;
import java.util.Calendar;

public class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = LocalDate.now().getYear();
        if(year > currentYear) {
            System.out.println("Năm k hợp lệ");
            return;
        }
        this.year = year;
    }
}
