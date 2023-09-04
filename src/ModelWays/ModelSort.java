package ModelWays;

public  class ModelSort
{
    Sort sort;

    public ModelSort(Sort sort)
    {
        this.sort = sort;
    }

    public void Sort()
    {
        for(int i=0;i<sort.getLength()-1;i++)
        {
            for(int j=0;j<sort.getLength()-i-1;j++)
            {
                if(sort.compare(j,j+1))
                    sort.swap(j,j+1);
            }
        }
    }
}
