package ReverseInteger;

class Solution {
    public static int ReverseInteger(int x) {
        String number = Integer.toString(x);
        int length = number.length() - 1;
        String answer = "0";
        char end = '-';
        Boolean negative = false;
        for (int i = length; i < 1; i--) {
            char check = number.charAt(i);
            if (check != end) {
                answer = answer + number.charAt(i);
            } else {
                negative.equals(true);
            }
        }
        if (negative) {
            return Integer.parseInt("-" + answer);
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        int v = 123;
        System.out.println(ReverseInteger(v));
    }
}
