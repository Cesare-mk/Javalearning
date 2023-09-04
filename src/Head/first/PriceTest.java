package Head.first;

public class PriceTest
{
    public static void main(String[] args)
    {
        SaleItem s1 = new SaleItem("中国象棋",50,1);
        SaleItem s2 = new SaleItem("变形金刚",100,1);
        SaleItem s3 = new SaleItem("纯牛奶",40,2);
        SaleItem s4 = new SaleItem("泡面",45,1);

        CountPriceWays countPriceWays = new NoDiscount();        //不打折
        CountPriceWays countPriceWays1 = new Discount();        //满减
        CountPriceWays countPriceWays2 = new Subtract();        //打九折

       // Sale sale = new Sale(countPriceWays);
       Sale sale1 = new Sale(countPriceWays1);
       // Sale sale2 = new Sale(countPriceWays2);

        sale1.addSaleItem(s1);
        sale1.addSaleItem(s2);
        sale1.addSaleItem(s3);
        sale1.addSaleItem(s4);

        //sale.countPrice();
       sale1.countPrice();
        // sale2.countPrice();

    }
}
