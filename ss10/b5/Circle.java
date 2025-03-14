package ss10.b5;

public class Circle {
    private double radius;
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <=0){
            System.out.println("bán kính p lớn hơn 0");
            return;
        }
        this.radius = radius;
    }
}
