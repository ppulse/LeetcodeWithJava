public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null)
            return 0;
        
        int[] minHeap = new int[k + 1];
        
        int idxOfNums = 0;
        int idxOfMinHeap = 1;
        int numsLen = nums.length;
        
        while (idxOfNums < k) {
            minHeap[idxOfMinHeap++] = nums[idxOfNums++];
        }
        
        buildMinHeap(minHeap, k);
        
        while (idxOfNums < numsLen) {
            if (nums[idxOfNums] > minHeap[1]) {
                minHeap[1] = nums[idxOfNums];
                siftDown(minHeap, 1, k);
            }
            
            idxOfNums++;
        }
        
        return minHeap[1];
    }
    
    private void buildMinHeap(int[] minHeap, int heapSize) {
        int sentinel = heapSize >> 1;
        for (int i = sentinel; i >= 1; i--)
            siftDown(minHeap, i, heapSize);
    }
    
    private void siftDown(int[] minHeap, int idx, int heapSize) {
        int sentinel = heapSize >> 1;
        
        while (idx <= sentinel) {
            int j = idx << 1;
            if (j + 1 <= heapSize && minHeap[j] > minHeap[j+1])
                j++;
            
            if (minHeap[j] < minHeap[idx]) {
                int tmp = minHeap[j];
                minHeap[j] = minHeap[idx];
                minHeap[idx] = tmp;
                idx = j;
            } else {
                break;
            }
        }
    }
}