import java.util.*;

public class Sales {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        StockItem product2 = new StockItem("Eggs (box of 6)", 10, 175);

        System.out.print("How many boxes of eggs they want : ");
        int level = reader.nextInt();

        product2.setStockLevel(level);

        product2.printReport();


    }
}
