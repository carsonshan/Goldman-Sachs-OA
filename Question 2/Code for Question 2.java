import java.util.*;

public class test {
    static int maxDifferenceOddEven(List<Integer> a) {
        int maxDiff = -1, minOdd = Integer.MAX_VALUE;
        if (a.size() == 0){
            return -1;
        }
        for (int i = 0; i < a.size(); i++){
            if (a.get(i) % 2 == 1 || a.get(i) % 2 == -1){
                minOdd = Math.min(minOdd, a.get(i));
            }
            else if (a.get(i)%2 == 0 && a.get(i) >= minOdd){
                maxDiff = Math.max(maxDiff, a.get(i) - minOdd);
            }
        }
        return maxDiff;
    }
    public static void main(String[] arge){
        List<Integer> l1 = Arrays.asList(2,3,10,1,4,8,1);
        List<Integer> l2 = Arrays.asList(7,9,5,6,3,2);
        List<Integer> l3 = Arrays.asList(1,5,7,10,-3,6,8);
        System.out.println(maxDifferenceOddEven(l1));
        System.out.println(maxDifferenceOddEven(l2));
        System.out.println(maxDifferenceOddEven(l3));
    }
}