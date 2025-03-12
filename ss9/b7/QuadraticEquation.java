package ss9.b7;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        if (!hasRealRoots()) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (!hasRealRoots()) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void display() {
        double delta = getDiscriminant();
        if (delta > 0) {
            System.out.println("pt có hai nghiệm phân biệt:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (delta == 0) {
            System.out.println("pt có nghiệm kép:");
            System.out.println("x = " + getRoot1());
        } else {
            System.out.println("pt vô nghiệm.");
        }
    }
}
