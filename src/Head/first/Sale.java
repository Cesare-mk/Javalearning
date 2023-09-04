package Head.first;

import java.util.ArrayList;
import java.util.List;

public class Sale   //一次销售，包括多个销售项
{
    List<SaleItem> saleItem;
    CountPriceWays countPriceWays;   // 接口的对象声明
    public Sale(CountPriceWays c)   //创建时就将计算价格的方式注入
    {
        saleItem = new ArrayList<SaleItem>();
        this.countPriceWays = c;
    }

    public void addSaleItem(SaleItem s)   //将销售项添加到 list里
    {
        this.saleItem.add(s);
    }

    public void countPrice()   //总价的结算方式，依赖于具体的折扣实现
    {
        double price = this.countPriceWays.howToCount(this.saleItem);
        System.out.println("此次购物的总价格是："+price);
    }
}

class SaleItem
{
    private String itemName;      //商品名
    private double price;       //价格
    private double qty;           //数量
    public SaleItem()
    {

    }
    public SaleItem(String itemName,double price,double qty)   //销售项的对象创建 ，后续是属性的访问器和设置器
    {
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getQty()
    {
        return qty;
    }

    public void setQty(double qty)
    {
        this.qty = qty;
    }
}