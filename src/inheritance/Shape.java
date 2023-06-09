package inheritance;

public class Shape {
    public String color;
    public String shapeSize;

    public Shape(String color, String shapeSize) {
        this.color = color;
        this.shapeSize = shapeSize;
    }

    public Shape(Circle circle) {
        this.color = circle.getColor();
        this.shapeSize = circle.getShapeSize();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShapeSize() {
        return shapeSize;
    }

    public void setShapeSize(String shapeSize) {
        this.shapeSize = shapeSize;
    }
}
