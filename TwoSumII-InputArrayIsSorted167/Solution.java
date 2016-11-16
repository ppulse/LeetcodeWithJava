public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {0, 0};
        if (numbers == null || numbers.length <= 1)
            return result;
        
        int index1 = 0;
        int index2 = numbers.length - 1;
        
        while (index1 < index2) {
            int sum = numbers[index1] + numbers[index2];
            if (sum < target)
                index1++;
            else if (sum > target)
                index2--;
            else
                break;
        }
        
        result[0] = index1 + 1;
        result[1] = index2 + 1;
        return result;
    }
}