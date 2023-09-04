package ModelWays;

import java.util.ArrayList;

public class ModelTest {
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("王菲",158,22));
        list.add(new Student("张三丰",160,20));
        list.add(new Student("赵无极",178,19));
        list.add(new Student("黄英",185,21));
        StudentBubbleSort studentSort =new StudentBubbleSort(list);
        ModelSort modelSort = new ModelSort(studentSort);
        modelSort.Sort();
        for (Student i:list)
        {
            System.out.println(i.toString());
        }
        int[] arr= new int[]{15,5,80,20,30,256};
        IntBubbleSort intBubbleSort = new IntBubbleSort(arr);
        ModelSort modelSort1 = new ModelSort(intBubbleSort);
        modelSort1.Sort();
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
