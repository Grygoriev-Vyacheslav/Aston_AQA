public class MyArrayDataEx extends Exception {
    MyArrayDataEx(int row, int col) {
        super(String.format("Invalid data in:[%d, %d]\n", row, col));
    }
}
