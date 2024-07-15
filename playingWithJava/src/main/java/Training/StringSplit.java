package Training;

public class StringSplit {
    //Complete the solution so that it splits the string into pairs of two characters.
    // If the string contains an odd number of characters then it should
    // replace the missing second character of the final pair with an underscore ('_').
    public static String[] solution(String s) {
        int n = (s.length() + 1) / 2;
        String[] responses = new String[n];

        for (int i = 0; i < s.length(); i += 2) {

            if (i + 1 < s.length()) {
                responses[i / 2] = s.substring(i, i + 2);
            } else {
                responses[i / 2] = s.substring(i) + "_";
            }
        }
        return responses;
    }
}
