import java.util.*;

public class test {
    public static int teamUp(String s){
        if (s == "")
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('p', 0);
        map.put('c', 0);
        map.put('m', 0);
        map.put('b', 0);
        map.put('z', 0);
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        int team = Integer.MAX_VALUE;
        for (int i : map.values())
            team = Math.min(team, i);

        return team;
    }
    public static void main(String[] arge){
        System.out.println(teamUp("pcmppbz"));
    }
}