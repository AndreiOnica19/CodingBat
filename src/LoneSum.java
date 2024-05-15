public class LoneSum {
    public static void main(String[] args) {
        /** Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
         it does not count towards the sum.
         */
        System.out.println(loneSum(12, 13, 15));
    }

    public static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c) {
            return 0;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        } else if (a == b) {
            return c;
        } else {
            return sum;
        }
    }
}
