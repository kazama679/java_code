package ss25.b1;

public class Account {
    private static Account instance;
    private int id;
    private String name;
    private int age;

    private Account() {
    }

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Account Info - ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
