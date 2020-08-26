import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public void dfs(List<String> ans, Map<Character, String> map, String digits, int pos, StringBuffer stringBuffer){
        if(pos == digits.length())
        {
            ans.add(stringBuffer.toString());
            return;
        }
        char digit = digits.charAt(pos);
        String letters = map.get(digit);
        for(int i = 0; i < letters.length(); i++)
        {
            stringBuffer.append(letters.charAt(i));
            dfs(ans, map, digits, pos + 1, stringBuffer);
            stringBuffer.deleteCharAt(pos);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() <= 0)
            return ans;
        Map<Character, String> map = new HashMap<>();
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        dfs(ans, map, digits, 0, new StringBuffer());
        return ans;
    }


}
