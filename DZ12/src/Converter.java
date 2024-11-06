public class Converter {
    static int strConverter(String[][] strArray)
            throws MyArraySizeEx, MyArrayDataEx {
        int sum = 0;
        if (strArray.length != 4) throw new MyArraySizeEx();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length != 4) throw new MyArraySizeEx();
            for (int k = 0; k < strArray[i].length; k++) {
                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataEx(i, k);
                }
            }
        }
        return sum;
    }
}