package ss10.b8;

public class Animals {
    private String name;
    private int age;

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

    public Animals(String name, int age) {
        if (name == null || name.trim().isEmpty() || age < 0) {
            System.out.println("tuổi âm hoặc tên trống.");
            return;
        }
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Tên: " + name + ", tuổi: " + age);
    }
    public void makeSound(){
        System.out.println("Some generic sound");
    }
}
