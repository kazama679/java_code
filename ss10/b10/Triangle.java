package ss10.b10;

public class Triangle extends Shape{
    public double a;
    public double b;
    public double c;
    public Triangle(String name,double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea(){
        double p = (a+b+c)/2;
        return Math.sqrt( p * (p - a) * (p - b) * (p - c) );
    }
    @Override
    public double calculatePerimeter(){
        return a+b+c;
    }
    @Override
    public String toString(){
        return super.toString()+" "+a+" "+b+" "+c;
    }
}