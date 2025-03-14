package ss10.b5;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println(circle.getArea());

//        k hợp lệ
//        circle.setRadius(-2);
//        System.out.println(circle.getArea());


        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3);
        cylinder.setHeight(4);
        System.out.println(cylinder.getVolume());

//        k k hợp lệ
//        cylinder.setHeight(-4);
//        System.out.println(cylinder.getVolume());
    }
}
