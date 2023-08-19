public class RepeatedStrings {

    public static long repeatedString(String s, long n) {
        long l = ((long) s.length());
        long r = n/l;
        int rr = (int) (n%l);
        long a = countInString('a', s);
        long c = r*a;
        if (rr>0) {
            String sub = s.substring(0, rr);
            c+=countInString('a', sub);
        }
        return c;
    }

    private static long countInString(char x, String s) {
        long c=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == x) {
                c++;
            }

        }
        return c;
    }
}
