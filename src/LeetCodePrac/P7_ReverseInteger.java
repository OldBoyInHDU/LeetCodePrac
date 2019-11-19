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
        //将数字转为字符串后再进行判断
        /*public int reverse(int x) {
            /*if(x < 0) {
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
        }*/

        //数学方法，不断取模，将数反转，并进行判断是否会溢出
        public int reverse(int x) {
            int reversed = 0;
            while(x != 0) {
                //获得最后一位出栈的数
                int pop = x % 10;
                x = x / 10;

                //每一次入栈前，都和int的最大最小值进行比较，判断是否溢出
                //int类型最大数和最小数开头的数字只能是1或2，
                // 所以如果有最后一次循环的话，pop的值一定为1或2，
                // 所以(rev == INT_MAX / 10 && pop > 7)和(rev == INT_MIN / 10 && pop < -8)判断可以省略
                if(reversed > Integer.MAX_VALUE / 10) return 0;
                if(reversed < Integer.MIN_VALUE / 10) return 0;

                //反转后进栈
                reversed = reversed * 10 + pop;
            }
            return reversed;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
