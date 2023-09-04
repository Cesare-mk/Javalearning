package ModelWays;

public class IntBubbleSort implements Sort
{
    private int[] arr;

    public IntBubbleSort(int[] arr)
    {
        this.arr = arr;
    }

    @Override
    public int getLength()
    {
        return this.arr.length;
    }

    @Override
    public boolean compare(int i, int j)
    {
        if(this.arr[i]>this.arr[j])
            return true;
        else
           return false;
    }

    @Override
    public void swap(int i, int j)
    {
        int tmp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = tmp;
    }
}
