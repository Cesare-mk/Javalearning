package Head.first;

import java.util.List;

public interface CountPriceWays    //声明折扣方式的接口
{
    public double howToCount(List<SaleItem> saleItem);
}


class NoDiscount implements CountPriceWays   //不打折的结算方式，对上述接口的实现
{
    @Override
    public double howToCount(List<SaleItem> saleItem)
    {
        double sum = 0;
        for(int i =0 ; i<saleItem.size(); i ++)
        {
            sum += (saleItem.get(i)).getPrice() * (saleItem.get(i)).getQty();
        }
        return sum;
    }
}

class Discount implements CountPriceWays   //满200 减 50 的结算方式，对上述接口的实现
{
    NoDiscount noDisCount = new NoDiscount();
    @Override
    public double howToCount(List<SaleItem> saleItem)
    {
        double sum2 = noDisCount.howToCount(saleItem);
        if(sum2 > 200)
            sum2 -= 50;
        return  sum2;
    }
}

class Subtract implements CountPriceWays   //打9折的结算方式，对上述接口的实现
{
    NoDiscount noDiscountCount = new NoDiscount();
    @Override
    public double howToCount(List<SaleItem> saleItem)
    {
        double sum3 = noDiscountCount.howToCount(saleItem);
        sum3 *= 0.9;
        return sum3;
    }
}