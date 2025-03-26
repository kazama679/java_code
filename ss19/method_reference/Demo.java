package ss19.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Trang", "Quỳnh", "Phanh", "LAnh");
        //1. Tham chiếu đến 1 static method - class::staticMethod
        //-Lambda
        names.forEach(name->Person.sayHello(name));
        // lambda + method
        names.forEach(Person::sayHello);

        //2. tham chiếu đến 1 instance method của đối tượng cụ thể
        //-lambda
        Person person = new Person();
        names.forEach(name->person.sayHello(name));
        //-lambda +method reference
        System.out.println("Lambda + Method Reference: ");
        names.forEach(person::hello);
        //3. tham chiếu tới 1 instance method của 1 kiểu dữ liệu cụ thể
        //-lambda
        names.forEach(name-> System.out.println(name));
        //-lambda + method
        System.out.println("Lambda + Method Reference2: ");
        names.forEach(System.out::println);
        //4. tham chiếu tới 1 constructor
//      Supplier// ngăn chặn khởi tạo dữ liệu chưa cần thiếu
        Person person1 = new Person();// khởi tạo đối tượng person1 khi chưa sử dụng
        System.out.println("Thông tin của person1: "+person1);
        //Supplier và method
        Supplier<Person> supplierPerson = Person::new;// chưa khởi tạo đối tượng và cấp phát
        System.out.println("thông tin của person2: "+supplierPerson.get());// khi này ms khởi tạo đối tượng ms sử dụng
    }
}
