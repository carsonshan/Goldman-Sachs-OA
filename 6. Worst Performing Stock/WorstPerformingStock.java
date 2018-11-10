import java.util.*;
public class WorstPerformingStock {
    public static int worstPerformingStock(List<List<Integer>> input){
        int worstID = 0;
        double worstRate = Double.MAX_VALUE;
        for (List<Integer> stock : input){
            int stockID=stock.get(0);
            int open=stock.get(1);
            int close=stock.get(2);
            double rate = (double)(close - open) / (double)open;
            if (rate < worstRate){
                worstRate = rate;
                worstID = stockID;
            }
        }
        return worstID;
    }
    public static void main(String[] args) {
        List<List<Integer>> input=new ArrayList<>();
        List<Integer> stock1=new ArrayList<>();
        List<Integer> stock2=new ArrayList<>();
        stock1.add(1200);
        stock1.add(100);
        stock1.add(105);
        stock2.add(1400);
        stock2.add(50);
        stock2.add(55);
        input.add(stock1);
        input.add(stock2);
        System.out.println(worstPerformingStock(input));
    }
}
