import java.util.*;
public class FootballWorldCup {
    public static String test(List<Integer> teamGoals){
        HashMap<Integer, Integer> map = new HashMap<>(); //Score, Times.
        for (int i = 0; i <= teamGoals.size() - 2; i++){
            for (int j = i + 1; j <= teamGoals.size() - 1; j++){
                int goals = teamGoals.get(i) + teamGoals.get(j);
                map.put(goals, map.getOrDefault(goals, 0) + 1);
            }
        }
        int maxScore = Integer.MIN_VALUE, maxScoreMatch = 0, sumOfMatches = 0;
        for (int i : map.keySet()){
            if (i > maxScore){
                maxScore = i;
                maxScoreMatch = map.get(i);
            }
            sumOfMatches += map.get(i);
        }

        return String.format("%.2f", ((float)maxScoreMatch / (float)sumOfMatches));
    }
    public static void main(String[] args){
        //Case 1
        List<Integer> teamGoals = new ArrayList<>();
        teamGoals.add(1); teamGoals.add(3); teamGoals.add(4); teamGoals.add(2);
        System.out.println(test(teamGoals));
        //Case 2
        teamGoals = new ArrayList<>();
        teamGoals.add(3); teamGoals.add(3); teamGoals.add(3); teamGoals.add(3);
        System.out.println(test(teamGoals));
        //Case 3
        teamGoals = new ArrayList<>();
        teamGoals.add(1); teamGoals.add(2); teamGoals.add(2); teamGoals.add(3);
        System.out.println(test(teamGoals));
    }
}
