import java.util.*;
public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] ballot = {"Alice", "Bob", "Cara", "Bob", "Alice", "Bob", "Cara", "Alice", "Bob", "Alice"};
        for (String name : ballot) votes.put(name, votes.getOrDefault(name, 0) + 1);
        System.out.println("Vote counts: " + votes);
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}
