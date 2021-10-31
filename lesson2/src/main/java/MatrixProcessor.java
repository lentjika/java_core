public class MatrixProcessor {
    private static int matrixSize = 4;

    public static int TakeSum(Object[][] matrix) throws MyArraySizeException, MyArrayDataException {
        var y = matrix.length;
        System.out.println("Количество основных элементов: " + y);
        if (y != matrixSize)
            throw new MyArraySizeException();
        for (int i = 0; i < matrixSize; i++) {
            int x = matrix[i].length;
            System.out.printf("Количество основных элементов на строке %s составляет %s %n", y, x);
            if (x != matrixSize)
                throw new MyArraySizeException();
        }

        int res = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                try {
                    res += (int) matrix[i][j];
                }
                catch (ClassCastException ex){
                    throw new MyArrayDataException(String.format("Ошибка в элементе %d - %d там лежит значение %s %n", i, j, matrix[i][j]));
                }
            }
        }

        return res;
    }
}
