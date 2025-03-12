package ss9.b5;

public class B5 {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(3, 4);
        Vector2D vector2 = new Vector2D(5, 6);

        System.out.print("vector1: "); vector1.displayVector();
        System.out.println("Độ dài 1: " + vector1.calculateMagnitude());
        System.out.print("vector2: "); vector2.displayVector();
        System.out.println("Độ dài 2: " + vector2.calculateMagnitude());

        Vector2D sum = vector1.add(vector2);
        System.out.print("Tổng: "); sum.displayVector();
        Vector2D diff = vector1.subtract(vector2);
        System.out.print("Hiệu: "); diff.displayVector();
        System.out.println("Tích vô hướng: " + vector1.dotProduct(vector2));
    }
}