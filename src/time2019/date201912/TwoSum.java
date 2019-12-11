package time2019.date201912;
/*
给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
示例:
输入: numbers = [2, 4, 11,12,15], target = 15
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。

 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right=numbers.length-1;
        while (left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum>target){
                right--;
            }else {
                left++;
            }
        }
        throw new RuntimeException("在数组中没有找到这样的两个数，使得它们的和为指定值");
    }
}
