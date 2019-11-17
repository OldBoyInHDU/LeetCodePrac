package LeetCodePrac;

public class P283_MoveZeroes {
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针



    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            //双指针，快的找0，慢的找!0的
            for(int i = 0; i < nums.length; i++) {
                for(int j = i; j < nums.length; j++) {
                    if(nums[i] == 0 && nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
