package Project1;

import java.lang.Math;
public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.x - x, 2) + Math.pow(p2.y - y, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    public void rotate(double angle) {
        double tempX = x * Math.cos(angle) - y * Math.sin(angle);
        double tempY = x * Math.sin(angle) - y * Math.cos(angle);
        x = tempX;
        y = tempY;
    }

    public String toString() {
        return "Point { x=" + x + ", y=" + y + "}";
    }
}
