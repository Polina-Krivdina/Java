package homeTaskStocks;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NetUtitilies netUtitilies = new NetUtitilies();

        List<Stock> ibmStocks =  netUtitilies.getMonthlyStocks();

        if (ibmStocks.isEmpty()){
            System.out.println("No trades were executed so far");
            return;
        }

        Stock lastTradedStock = ibmStocks.get(0);
        System.out.println("Last traded stock value is " + lastTradedStock.getValue() + " at " + lastTradedStock.getDate() );

        ibmStocks.sort(new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                return new Float(o1.getValue()).compareTo(new Float(o2.getValue()));
            }
        });

        Stock maxValue = ibmStocks.get(ibmStocks.size() - 1);
        System.out.println("Max value was " + maxValue.getValue() + " at " + maxValue.getDate() );

        Stock minValue = ibmStocks.get(0);
        System.out.println("Min value was " + minValue.getValue() + " at " + minValue.getDate() );
    }
}
