package inheritance;

public class Circle extends Shape {
    private String circleSize;
    private String circleColor;

    public Circle(String color, String shapeSize, String circleSize, String circleColor) {
        super(color, shapeSize);
        this.circleSize = circleSize;
        this.circleColor = circleColor;
    }

    public Circle(String color, String shapeSize) {
        super(color, shapeSize);
    }

    public String getCircleSize() {
        return circleSize;
    }

    public void setCircleSize(String circleSize) {
        this.circleSize = circleSize;
    }

    public String getCircleColor() {
        return circleColor;
    }

    public void setCircleColor(String circleColor) {
        this.circleColor = circleColor;
    }

//    @Override
//    public String toString() {
//        return "Circle{" +
//                "circleSize='" + circleSize + '\'' +
//                ", circleColor='" + circleColor + '\'' +
//                ", color='" + color + '\'' +
//                ", shapeSize='" + shapeSize + '\'' +
//                '}';
//    }
}
