public class Triangle implements Shape1 {
    private String fillColor, borderColor;
    public double side1, side2, side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double calcPerimetr() {
        return (side1 + side2 + side3);
    }


    @Override
    public double calcArea() {
        double half = calcPerimetr() / 2;

        return Math.sqrt(half * (half - side1) * (half - side2) * (half - side3));
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printTriangle() {
        System.out.println("Triangle  is: ");
        System.out.println("Perimetr " + calcPerimetr());
        System.out.println("Area is: " + calcArea());
        System.out.println("Fill color is: " + fillColor);
        System.out.println("Border color is: " + borderColor);
    }
}
