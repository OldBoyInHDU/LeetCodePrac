package LeetCodePrac;

public class P14_LongestCommonPrefix {
    //编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
// 示例 1:
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
//
//
// 示例 2:
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//
//
// 说明:
//
// 所有输入只包含小写字母 a-z 。
// Related Topics 字符串



    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            //每次取第一个元素的0-i的子字符串作为比较前缀
            //startswith(prefix)
            if (strs.length == 0) return "";
            if ("".equals(strs[0])) return "";
            if(strs.length == 1) return strs[0];
            String first = strs[0];
            boolean flag = true;
            int i = 1;
            String prefix = "";
            while (flag && i <= first.length()) {

                String tempPrefix = first.substring(0, i);
                for (int j = 1; j < strs.length; j++) {
                    if (!strs[j].startsWith(tempPrefix)) {
                        flag = false;
                        prefix = tempPrefix.substring(0, tempPrefix.length() - 1);
                        break;
                    }
                    prefix = tempPrefix;
                }

                i++;
            }
            return prefix;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
