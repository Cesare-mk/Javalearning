package arithmetic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 快速排序，两次循环，外层循环长度小于length-1，外层循环是基数加1，长度小于length
 * 先定义最小值位置为外层的基数
 */
public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        long start = System.currentTimeMillis();

        for (int j = 0; j < array.length - 1; j++) {
            int minIndex = j;
            //假定当前值从索引i后的第一个值，从i+1往后开始循环找最小值索引
            for (int k = j + 1; k < array.length; k++) {
                if (array[minIndex] >= array[k]) {
                    minIndex = k;
                }
            }
            exchange(array, j,minIndex);
        }

        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println("快速排序花费时间：" + (end - start) + "毫秒");
    }

    public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}