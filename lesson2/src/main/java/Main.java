public class Main {
    public static void main(String[] args) {
        System.out.println("dd");
        Object[][] matrix = new Object[][]{{2, "ddd", 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}, {1, 2, 3, 4}};
        try {
            int res = MatrixProcessor.TakeSum(matrix);
            System.out.println(res);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
