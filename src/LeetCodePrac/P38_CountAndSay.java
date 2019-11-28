package LeetCodePrac;

import java.util.Queue;

public class P38_CountAndSay {
    //报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//
//
// 1 被读作 "one 1" ("一个一") , 即 11。
//11 被读作 "two 1s" ("两个一"）, 即 21。
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
//
// 注意：整数顺序将表示为一个字符串。
//
//
//
// 示例 1:
//
// 输入: 1
//输出: "1"
//
//
// 示例 2:
//
// 输入: 4
//输出: "1211"
//
// Related Topics 字符串



    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String countAndSay(int n) {
            if (n == 1) return "1";
            String newStr = countAndSay(n - 1);
            char begin = newStr.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < newStr.length(); i++) {
                if (newStr.charAt(i) == begin) {
                    count++;
                } else {
                    String str = "" + count + begin;
                    sb.append(str);
                    begin = newStr.charAt(i);
                    count = 1;
                }
            }
            //当到最后一个字符时
            String str = "" + count + begin;
            sb.append(str);

            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
