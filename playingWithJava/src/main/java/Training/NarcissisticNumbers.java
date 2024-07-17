package Training;

public class NarcissisticNumbers {
    public static boolean isNarcissistic(int number) {
        int sum = 0;
        String num = Integer.toString(number);
        int length = num.length();
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            sum += (int) Math.pow(digit, length);
        }
        return sum == number;
    }
}
