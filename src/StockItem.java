import java.util.Date;

public class StockItem {
    private String description;
    private int level;
    private double price;
    private Date sallByDate =  new Date();


    public StockItem(String description, int level, double price){
        this.description = description;
        this.level = level;
        this.price = price;

    }

    public StockItem(String description, int level, double price, Date saleByDate){
        this.description = description;
        this.level = level;
        this.price = price;
        this.sallByDate = saleByDate;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getStockLevel(){
        return this.level;
    }

    public String getDescription(){
        return this.description;
    }



    public void printReport(){
        System.out.println("************StockReport************");
        System.out.println("*  Item : "+ this.description);
        System.out.println("*  Price : "+ this.price+"p");
        System.out.println("*  Stock Level : "+ this.level);
    }


    @Override
    public String toString(){
        return "***************Stock Item***************\n*  Item : "+ this.description +"\n*  Price : "+this.price+ "\n*  Stock Level : "+ this.level+"\n*  Date : "+ this.sallByDate;
    }

    public void doDelivery(double amount){
        this.level += amount;
    }

    public void doSales(double amount){

        if(this.level >= amount){
            this.level -= amount;
        }

    }


    public void setSellByDate(int d)
    {
        this.sallByDate.setDate(d);
    }


}
