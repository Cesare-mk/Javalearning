package arithmetic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 两层循环，外层倒序遍历，int j = array.length-1; j > 0 ; j--
 * 内层：int k = 0; k < j; k++
 * 比较k和k+1的大小，大的往后排
 *
 */
public class Maopao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        long start = System.currentTimeMillis();
        //冒泡排序,每次排序都会少一个数据参与，最大值已经排到最后不参与排序，所以可以倒序循环
        for (int j = array.length-1; j > 0 ; j--) {
            for (int k = 0; k < j; k++) {
                if (array[k] >= array[k + 1]) {
                    int temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println("冒泡排序花费时间："+ (end - start)+"毫秒");
    }
}
