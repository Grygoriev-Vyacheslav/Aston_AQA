public class Circle implements Shape1 {
    public double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimetr() {
        return (2 * 3.14 * radius);
    }

    @Override
    public double calcArea() {
        return (3.14 * radius * radius);
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printCircle() {
        System.out.println("Circle is: ");
        System.out.println("Perimetr" + calcPerimetr());
        System.out.println("Area is: " + calcArea());
        System.out.println("Fill color is:" + fillColor);
        System.out.println("Border color is:" + borderColor);

    }
}

