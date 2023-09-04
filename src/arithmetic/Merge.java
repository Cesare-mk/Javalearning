package arithmetic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 马蒙
 * @date 2023/9/1 14:09
 */
public class Merge {
    public static int[] assist;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入待排序数组大小:");
        int n = input.nextInt();
        System.out.println("输入待排序数组元素：");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        sortMerge(array);
        System.out.print("归并排序完的数组：");
        System.out.println(Arrays.toString(array));

    }

    public static void sortMerge(int[] array) {
        assist = new int[array.length];
        int low = 0;
        int high = array.length - 1;
        sort(array, low, high);
    }

    public static void sort(int[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = (low + high) / 2;
        //对low到mid之间的数进行排序
        sort(array, low, mid);

        //对mid+1到high之间的数进行排序
        sort(array, mid + 1, high);
        //归并
        merge(array, low, mid, high);

    }

    /**
     * 对low到mid之间的数组以及mid+1到high之间的数组进行归并
     */

    public static void merge(int[] a, int low, int mid, int high) {
        //low到mid这组数据和mid+1到high这组数据归并到辅助数组assist对应的索引处
        //定义一个指针，指向assist数组中开始填充数据的索引
        int i = low;
        //定义一个指针，指向第一组数据的第一个元素
        int p1 = low;
        //定义一个指针，指向第二组数据的第一个元素
        int p2 = mid + 1;
        //比较左边小组和右边小组中的元素大小，哪个小，就把哪个数据填充到assist数组中
        while (p1 <= mid && p2 <= high) {
            if (a[p1] < a[p2]) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }

        /**
         * 上面的循环结束后，如果退出循环的条件是p1<=mid，则证明左边小组中的数据已经归并完毕，如果退
         *出循环的条件是p2<=high,则证明右边小组的数据已经填充完毕；
         *所以需要把未填充完毕的数据继续填充到assist中,
         *下面两个循环，只会执行其中的一个
         *
         */

        //遍历，如果排p1的指针没有走完，顺序移动p1，把对应元素移到辅助数组中
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        while (p2 <= high) {
            assist[i++] = a[p2++];
        }
        //到现在为止，assist数组中，从lo到hi的元素是有序的，再把数据拷贝到a数组中对应的索引处
        for (int index = low; index <= high; index++) {
            a[index] = assist[index];
        }
    }
    /**
     * 交换元素
     */

    /*public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }*/
}
