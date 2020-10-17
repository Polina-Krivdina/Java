package homeTaskStocks;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 Using alphavantage.co
 */
public class NetUtitilies {


    public List<Stock> getMonthlyStocks(){
        String url = "https://raw.githubusercontent.com/productstar-team/javaTwo/master/resources/monthly_IBM.csv";
        try (BufferedInputStream inStream = new BufferedInputStream(new URL(url).openStream())) {
            Scanner s = new Scanner(inStream).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";
            return convertCsvToStocks(result);

        } catch (IOException e) {
            System.out.println("Unable to retrieve stocks for IBM");
        }

        return new LinkedList();
    }

    private List<Stock> convertCsvToStocks(String result) {
        List<Stock> stocks = new LinkedList<>();
        String[] lines = result.split("\\n");
        for (int i = 1; i < lines.length; i++){
            stocks.add(convertLineToStock(lines[i]));
        }

        return stocks;
    }

    private Stock convertLineToStock(String line) {
        String[] tokens = line.split(",");
        return new Stock(tokens[0], Float.parseFloat(tokens[4]));
    }
}
