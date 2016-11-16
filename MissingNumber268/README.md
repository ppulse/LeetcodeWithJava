Given an array containing *n* distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing from the array.

For example,
Given *nums* = `[0, 1, 3]` return `2`.

#####Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?


#####思路
0、1、2....n之和expectedSum为(n+1)*n/2

拿掉一个数k后的和sum为(n+1)*n/2-k
  
因此k = expectedSum - sum