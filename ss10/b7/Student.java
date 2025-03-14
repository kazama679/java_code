package ss10.b7;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        if (checkName(name) && checkID(id) && checkGpa(gpa)) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        } else {
            System.out.println("k hợp lệ.");
        }
    }

    private boolean checkName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private boolean checkID(String id) {
        return id != null && !id.trim().isEmpty();
    }

    private boolean checkGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
        } else {
            System.out.println("Điểm trung bình không hợp lệ.");
        }
    }

    public String getDetails() {
        return "Tên: " + name + ", Mã SV: " + id + ", Điểm TB: " + gpa;
    }
}