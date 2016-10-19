Say you have an array for which the *i*<sup>th</sup> element is the price of a given stock on day <sup>i</sup>.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

#####Example 1:
```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```
#####Example 2:
```
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
```

######思路
遍历一遍数组，按如下规则用max，min记录最大最小值：
初始min赋值为正无穷大，max赋值为0
若当前值curr比min小，则给min赋值min=curr，
curr比max大，则给max赋值max=curr
最终若max-min的值大于0，则返回max-min，否则返回0