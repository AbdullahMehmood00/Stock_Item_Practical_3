import java.util.Date;

public class Tester {
    public static void main(String[] args){
        System.out.println("Stock Item Task 1");

        StockItem bob = new StockItem("Baked Beans 415g", 15, 65);

        bob.setPrice(100);
//        bob.printReport();

//        bob.toString();


        bob.doDelivery(10);
        bob.doSales(30);
        System.out.println(bob.toString());
        System.out.println(bob.getDescription());


        System.out.println("Stock Item Task 2");

        bob.setSellByDate(21);

        System.out.println(bob.toString());

    }
}
