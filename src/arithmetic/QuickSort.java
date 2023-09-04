package arithmetic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 马蒙
 * @date 2023/9/1 15:13
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入待排序数组大小:");
        int n = input.nextInt();
        System.out.println("输入待排序数组元素：");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        sortQuick(array);
        System.out.print("归并排序完的数组：");
        System.out.println(Arrays.toString(array));

    }

    public static void sortQuick(int[] array) {
        int low = 0;
        int high = array.length - 1;
        sort(array, low, high);
    }

    public static void sort(int[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        //分界值的位置
        int partition = partitionValue(array, low, high);
        //对low到分界值之间的数进行排序
        sort(array, low, partition - 1);

        //对分界值到high之间的数进行排序
        sort(array, partition + 1, high);
        //归并

    }


    /**
     * 对low到mid之间的数组以及mid+1到high之间的数组进行归并
     */
    public static int partitionValue(int[] array, int low, int high) {
        //确定分界值
        int key = array[low];
        //两个指针，用来将分界值两边的元素交换
        int left = low;
        int right = high + 1;


        while (true) {

            //右指针往左移动找到一个比分界值小的元素
            while (key < array[--right]) {
                if (right == low) {
                    break;
                }
            }
            //c从左往右移动找到比分界值大的元素
            while (key > array[++left]) {
                if (left == high) {
                    break;
                }
            }
            //左指针大于等于右指针循环结束
            if (left >= right) {
                break;
            } else {
                exchange(array, left, right);
            }
            //交换分界值
            exchange(array, low, right);
        }
        return right;
    }

    /**
     * 交换元素
     */

    public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
