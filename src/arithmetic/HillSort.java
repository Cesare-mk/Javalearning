package arithmetic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 马蒙
 * @date 2023/8/30 11:51
 */
public class HillSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("希尔排序：");
        System.out.println("输入数组大小：");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        hillSort(array);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));
    }

    public static void hillSort(int[] array) {
        //设置希尔排序的H值,不大于数组长度的一半
        int h = 1;
        while (h < array.length / 2) {
            h = 2 * h + 1;
        }
//        希尔排序
        while (h >= 1) {
            //找到待插入的元素,待插入元素就是索引i处，从h开始
            for (int i = h; i < array.length; i++) {
                //把待插入元素（j）插入到已排序的序列中，前一个数据索引为当前索引j-h
                for (int j = i; j >= h; j -= h) {
                    if (array[j - h] >= array[j]) {
                        exchange(array, j - h, j);
                    }
                }
            }
            //改变h的值
            h = h / 2;
        }
    }
    public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
