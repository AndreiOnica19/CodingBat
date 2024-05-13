public class ShareDigit {
    public static void main(String[] args) {
        shareDigit(12,43);
        System.out.println(shareDigit(12,43));
    }


    /**
    * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
    * such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
     */
    public static boolean shareDigit(int a, int b) {
        String txtA = String.valueOf(a);
        String txtB = String.valueOf(b);
        for (int i = 0; i < txtA.length(); i++) {
            for (int j = 0; j < txtB.length(); j++) {
                if (txtA.charAt(i) == txtB.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
