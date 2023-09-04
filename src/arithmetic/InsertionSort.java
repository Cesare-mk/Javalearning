package arithmetic;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 当前值倒序和前面的值比较
* 外层 int i = 1; i < array.length; i++
* 内层：int j = i; j > 0; j--
*
 * @author m
 *
 * */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        //插入排序
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                //比较 j位置的值和j-1 位置的值，如果j 小于 j-1 交换，如果不大于，退出循环
                if(array[j] < array[j-1]){
                    exchange(array,j ,j-1);
                }else {
                    break;
                }
            }
        }

        //输出
        System.out.println(Arrays.toString(array));
    }

    public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
