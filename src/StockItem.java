public class StockItem {
    private String description;
    private int level;
    private double price;


    public StockItem(String description, int level, double price){
        this.description = description;
        this.level = level;
        this.price = price;
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
        return "***************Stock Item***************\n*  Item : "+ this.description +"\n*  Price : "+this.price+ "\n*  Stock Level : "+ this.level;
    }

    public void doDelivery(double amount){
        this.level += amount;
    }

    public void doSales(double amount){

        if(this.level >= amount){
            this.level -= amount;
        }

    }


}
