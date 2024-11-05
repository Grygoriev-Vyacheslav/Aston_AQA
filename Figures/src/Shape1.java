public interface Shape1 {

    double calcPerimetr();

    double calcArea();

    default void setFillColor(String color) {
    }

    void setBorderColor(String color);

}
