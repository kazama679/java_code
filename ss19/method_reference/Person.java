package ss19.method_reference;

public class Person {
    private int id;
    private String name;

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

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Persin{"+"id=" + id + ", name=" + name + '}';
    }
    public static void sayHello(String name){
        System.out.println("Hello: "+name);
    }
    public void hello(String name){
        System.out.println("chào bạn: "+name);
    }
}
