package practice;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static Set<String> dictionary = new HashSet<>();

    public static void main(String[] args) {
        dictionary.add("you");
        dictionary.add("a");
        dictionary.add("are");
        dictionary.add("hero");
        dictionary.add("i");
        dictionary.add("then");
        dictionary.add("areah");

        String input = "youareahero";
        System.out.println(breakWords(input));
    }

    public static String breakWords(String input) {
        int length = input.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(input.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        if (!dp[length]) {
            return "Cannot break the input into words";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length;) {
            for (int j = i + 1; j <= length; j++) {
                if (dp[j] && dictionary.contains(input.substring(i, j))) {
                    sb.append(input.substring(i,j)).append(" ");
                    i = j;
                    break;
                }
            }
        }

        return sb.toString();
    }
}
