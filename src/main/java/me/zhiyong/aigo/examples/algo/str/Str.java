package me.zhiyong.aigo.examples.algo.str;

/**
 * Created by afanty on 17-2-15.
 */
public class Str {
    public static String reverse(String s) {
        char[] c = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char tmp = c[i];
            c[i] = c[n - i - 1];
            c[n - i - 1] = tmp;
        }
        return new String(c);
    }

    public static String maxLoopSubstring(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int start = 0;
        int end = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            int k = i + 1;
            while (k < s.length() && s.charAt(i) == s.charAt(k)) {
                k++;
            }
            for (int j = i - 1; j >= 0 && k < s.length(); j--, k++) {
                if (s.charAt(j) == s.charAt(k)) {
                    if (k - j > end - start) {
                        start = j;
                        end = k;
                    }
                } else {
                    break;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        //System.out.println(Str.reverse("abcdefgh"));
        System.out.println(Str.maxLoopSubstring("dabcebad"));
    }
}
