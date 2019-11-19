package LeetCodePrac;

public class P7_ReverseInteger {
    //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            if(x < 0) {
                String numStr = Integer.toString(x).substring(1);

                String reversedStr = swap(numStr);
                long num = Long.parseLong(reversedStr);
                if(num > Math.pow(2, 31) || num < Math.pow(-2, 31)) {
                    return 0;
                } else {
                    return (int)num;
                }
            } else {
                String numStr = Integer.toString(x);

                String reversedStr = swap(numStr);
                long num = Long.parseLong(reversedStr);
                if(num > Math.pow(2, 31) || num < Math.pow(-2, 31)) {
                    return 0;
                } else {
                    return (int)num;
                }
            }


        }

        public String swap(String str) {
            String reversedStr = "";
            for(int i = 0; i < str.length(); i++) {
                reversedStr = str.charAt(i) + reversedStr;
            }
            return reversedStr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
