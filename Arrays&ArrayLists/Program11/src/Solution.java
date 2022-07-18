//Count Items Matching a Rule
import java.util.List;
import java.util.ArrayList;


class Solution {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;

        if(ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(0))) {
                    count++;
                }
            }
        }
        else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(1))) {
                    count++;
                }
            }
        }
        else {
            for (int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(2))) {
                    count++;
                }
            }
        }
        return count;
    }
}