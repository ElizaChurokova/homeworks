public class Circle implements Drawable {
    private String color;
    private double square;

    public Circle(String color, double square) {
        this.color = color;
        this.square = square;
    }

    @Override
    public void draw(){
        System.out.println("Circle is drawn");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
