package Aut24;
/*  若原串S是由重复子串s构成的，那么两个子串组合成SS后，掐头去尾，必然还包含 S 这个子串。
    字符串平移规则。
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        ss = ss.substring(1, ss.length() - 1);
        return ss.contains(s);
    }
}
