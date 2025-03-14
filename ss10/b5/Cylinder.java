package ss10.b5;

public class Cylinder extends Circle {
    private double height;
    public double getVolume() {
        return getArea()* height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <=0){
            System.out.println("Chiều cao p lớn hơn 0");
            return;
        }
        this.height = height;
    }
}
