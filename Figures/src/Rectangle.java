public class Rectangle implements Shape1 {
    public double width, height;
    private String fillColor, borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcPerimetr() {
        return (2 * (width + height));
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printRectangle() {
        System.out.println("Reactangle is: ");
        System.out.println("Perimetr " + calcPerimetr());
        System.out.println("Area is: " + calcArea());
        System.out.println("Fill color is: " + fillColor);
        System.out.println("Border color is: " + borderColor);
    }
}
