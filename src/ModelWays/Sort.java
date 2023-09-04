package ModelWays;


public interface Sort   //排序算法的接口
{
    public abstract int getLength();
    public abstract boolean compare(int i,int j);
    public abstract void swap(int i,int j);
}
