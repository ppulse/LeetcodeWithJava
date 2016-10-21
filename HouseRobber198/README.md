You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight **without alerting the police**.

##### 思路
动态规划
若抢当前户，则前一户不能抢，成果为 两户以前的收益与当前户之和
若不抢当前户，则成果为一户以前的收益
两者取最大值

状态转移方程
f(n) = Max(f(n-2)+num[n],  f(n-1))

如  1,3,5,4,2,6
  n    0  1  2  3  4  5 
f(n-2) 0  0  1  3  6  7
f(n-1) 0  1  3  6  7  8
f(n)   1  3  6  7  8  13
结果为13

又如  2,1,1,2
  n     2  1  1  2 
f(n-2)  0  0  2  2
f(n-1)  0  2  2  3
f(n)    2  2  3  4
结果为4