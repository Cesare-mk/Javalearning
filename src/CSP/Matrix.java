package CSP;

import java.util.Scanner;

/**
 * @author 马蒙
 * @date 2023/8/31 10:52
 */
public class Matrix {
    public static void main(String[] args) {
        //矩阵声明
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int d = input.nextInt();

        int[][] Q = new int[n][d];
        int[][] K = new int[n][d];
        int[][] V = new int[n][d];
        int[] W = new int[n];

        long[][] tmp = new long[30][30];
        long[][] result = new long[1000][1000];

        //初始化矩阵
        readMatrix(input, Q, n, d);
        readMatrix(input, K, n, d);
        readMatrix(input, V, n, d);
        readVector(input, W, n);

        //Softmax计算
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < n; k++) {
                    tmp[i][j] += (long) K[k][i] * V[k][j];
                }
            }
        }

        // Calculate Q * tmp = ans
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k <d; k++) {
                    result[i][j] += (long) Q[i][k] * tmp[k][j];
                }
                result[i][j] *= (long)W[i];
            }
        }

        // 输出二维数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(result[i][j] + " ");
                }
            System.out.println();
            }
    }

    /**
     * 读取矩阵,初始化矩阵
     */
    private static void readMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    /**
     * 读取向量
     */
    private static void readVector(Scanner scanner, int[] vector, int size) {
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }
    }
}
