package ha06.a1;

public class MatrixMultMain {
    // Method to multiply two matrices using threads
    public static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];
        DotProductThread[][] threads = new DotProductThread[rowsA][colsB];

        // Transpose B to easily get columns as rows
        int[][] B_T = new int[colsB][colsA];
        for (int i = 0; i < colsA; i++) {
            for (int j = 0; j < colsB; j++) {
                B_T[j][i] = B[i][j];
            }
        }

        // Create and start threads
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                threads[i][j] = new DotProductThread(A[i], B_T[j]);
                threads[i][j].start();  // Try run() instead of start() to compare
            }
        }

        // Wait for all threads to finish
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                try {
                    threads[i][j].join();
                    result[i][j] = threads[i][j].getDot();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int[][] result = multiply(A, B);

        // Print result
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
