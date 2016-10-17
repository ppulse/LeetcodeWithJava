Given two arrays, write a function to compute their intersection.

Example:
Given *nums1* = `[1, 2, 2, 1]`, *nums2* = `[2, 2]`, return `[2, 2]`.

#####Note:
- Each element in the result should appear as many times as it shows in both arrays.
- The result can be in any order.
#####Follow up:
- What if the given array is already sorted? How would you optimize your algorithm?
- What if *nums1*'s size is small compared to *nums2*'s size? Which algorithm is better?
- What if elements of *nums2* are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

######思路
将较短的数组缓存在hashMap中，花掉O(N)的辅助空间
然后遍历较长的数组，看是否在hashMap中，由于hashMap的O(1)查找时间，因此时间复杂度为O(M)