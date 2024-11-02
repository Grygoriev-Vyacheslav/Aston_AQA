public class Main {
    public static void main(String[] args) {

        String[][] trueMatrix = {
                {"8", "1", "2", "5",},
                {"1", "2", "0", "3"},
                {"1", "9", "2", "3"},
                {"1", "9", "4", "5"}
        };
        String[][] lowSizeMatrix = {
                {"3", "6", "9", "1"},
                {"1", "6", "6", "8"},
                {"0", "8", "3", "6"},
                {"9", "9"}
        };
        String[][] BadCharMatrix = {

                {"1", "6", "6", "8"},
                {"8", "8", "3", "5"},
                {"5", "F", "9", "0"},
                {"2", "4", "6", "8"},
        };

        try {
            System.out.println("Case #1:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(trueMatrix) + ".\n");
        } catch (MyArrayDataEx | MyArraySizeEx e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Case #2:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(lowSizeMatrix) + ".\n");
        } catch (MyArrayDataEx | MyArraySizeEx e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Case #3:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(BadCharMatrix) + ".\n");
        } catch (MyArrayDataEx | MyArraySizeEx e) {
            System.out.println(e.getMessage());
        }
    }
}