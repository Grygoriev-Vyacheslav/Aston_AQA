public class ManyTasks {


    public void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }


    public void printColor() {
        int a = -2;
        if (a <= 0) {
            System.out.println("Красный");
        } else if (a > 0 && a <= 100) {

            System.out.println("Желтый");
        } else {

            System.out.println("Зеленый");
        }
    }


    public void сheckSumSigh() {
        int a = -15;
        int b = -75;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }
    }


    public boolean task5(int s, int x) {
        int z = s + x;
        return (z < 10) && (z >= 20);
    }


    public void task6(int c) {
        if (c >= 0) {

            System.out.println("положительное число");
        } else {

            System.out.println("отрицательное число");

        }
    }

    public boolean task7(int c) {
        return (c < 0);

    }


    public void task8(String str, int p) {
        for (int i = 0; i < p; i++)
            System.out.println(str);
        System.out.println();
    }


    public boolean task9(int year) {
        return (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0));

    }


    public void task10() {
        int[] arr = {0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;

            } else arr[i] -= 1;

        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.println();
    }


    public void task11() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(" " + arr[i]);

        }
        System.out.println();
    }


    public void task12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

    }


    public void task13() {
        int[][] matrix = new int[4][4];
        int counter = 1;
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matrix[i][j] = counter;
                matrix[i][i] = 1;
                System.out.print(matrix[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }


    public int[] task14(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }
}

