package model.entities;

public class Rectangle {
    public double width, height;

    public double areaCalculate() {
        return width * height;
    }

    public double perimeterCalculate() {
        return 2 * (width + height);
    }

    public double diagonalCalculate() {
        return Math.sqrt(width * width + height * height);
    }
}
