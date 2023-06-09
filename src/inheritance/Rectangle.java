package inheritance;

public class Rectangle {
    private String rectangleSize;
    private String rectangleColor;

    public Rectangle(String rectangleSize, String rectangleColor) {
        this.rectangleSize = rectangleSize;
        this.rectangleColor = rectangleColor;
    }

    public String getRectangleSize() {
        return rectangleSize;
    }

    public void setRectangleSize(String rectangleSize) {
        this.rectangleSize = rectangleSize;
    }

    public String getRectangleColor() {
        return rectangleColor;
    }

    public void setRectangleColor(String rectangleColor) {
        this.rectangleColor = rectangleColor;
    }
}
