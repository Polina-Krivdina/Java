package homeTaskStocks;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NetUtitilies netUtitilies = new NetUtitilies();

        List<Stock> imbStocks =  netUtitilies.getMonthlyStocks("IBM");
        System.out.println(imbStocks);
    }
}
