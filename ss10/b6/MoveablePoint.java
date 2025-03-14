package ss10.b6;

public class MoveablePoint extends Point{
    private double xSpeed;
    private double ySpeed;

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return super.toString() + "with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}