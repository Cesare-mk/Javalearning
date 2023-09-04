package ModelWays;

import java.util.ArrayList;
public class StudentBubbleSort implements Sort {
    ArrayList<Student> list;
    public StudentBubbleSort(ArrayList<Student> list)
    {
        this.list = list;
    }

    public StudentBubbleSort()
    {
    }
    @Override
    public int getLength()
    {
        return list.size();
    }

    @Override
    public boolean compare(int i, int j)
    {
        if(this.list.get(i).getHeight() > this.list.get(j).getHeight())
            return true;
        else
            return false;

    }
    @Override
    public void swap(int i, int j)
    {
        Student tmp;
        tmp = this.list.get(i);
        this.list.set(i, this.list.get(j));
        this.list.set(j, tmp);

    }
}
