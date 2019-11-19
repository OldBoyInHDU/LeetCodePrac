package LeetCodePrac;

public class P42_TrappingRainWater {
    //给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
//
//
//
// 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
//
// 示例:
//
// 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
//输出: 6
// Related Topics 栈 数组 双指针

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {
            //按列求水，只有当前列的高度大于左右两边的最高列才行。
            int sum = 0;
            //最左列肯定不会有水
            for(int i = 1; i < height.length; i++) {
                //找当前列左边的最高列
                int max_left = 0;
                for(int j = 0; j < i; j++) {
                    if(max_left < height[j]) max_left = height[j];
                }

                //找到当前列右边的最高列
                int max_right = 0;
                for(int j = i + 1; j < height.length; j++) {
                    if(max_right < height[j]) max_right = height[j];
                }

                int heightNum = Math.min(max_left, max_right);
                if(heightNum > height[i]) sum = sum + heightNum - height[i];
            }

            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
