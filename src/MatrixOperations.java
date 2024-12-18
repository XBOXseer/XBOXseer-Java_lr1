import java.util.Arrays;

public class MatrixOperations {

    public static void main(String[] args) {
        // Ініціалізована матриця
        long[][] matrix = {
                {54, 5662, 1563, 100},
                {456, 509843, 16, 24},
                {7777, 80, 910, 75}
        };

        // Транспонування матриці
        long[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Оригінальна матриця:");
        printMatrix(matrix);
        System.out.println("Транспонована матриця:");
        printMatrix(transposedMatrix);

        // Підрухунок суми найменших елементів в кожній колонці
        long sumOfSmallestElements = sumOfSmallestElementsInColumns(transposedMatrix);
        System.out.println("Сума найменших елементів в кожній колонці: " + sumOfSmallestElements);
    }

    // Транспонування
    public static long[][] transposeMatrix(long[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        long[][] transposed = new long[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // Обчислення суми найменших елементів у кожному стовпці матриці
    public static long sumOfSmallestElementsInColumns(long[][] matrix) {
        int cols = matrix[0].length;
        long sum = 0;

        for (int j = 0; j < cols; j++) {
            long min = Long.MAX_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            sum += min;
        }

        return sum;
    }

    // Виведення матриці в консоль
    public static void printMatrix(long[][] matrix) {
        for (long[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
