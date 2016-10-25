Implement pow(x, n).


#####思路
将x，n取绝对值后扔进一个处理正数底，正数指数的函数myPowAbs中
myPowAbs 采用如下算法减少运算量

x<sup>n</sup>=(x<sup>n/2</sup>)<sup>2</sup>      n为偶数

x<sup>n</sup>=(x<sup>n/2</sup>)<sup>2</sup>*x    n为奇数

**注意：**
n可能达到Integer.MIN_VALUE
因此，在扔进myPowAbs前需要先将n转换成long型

若n为负数，需要对myPowAbs的结果求倒数

最后，根据x如果是负数，且n为奇数，那么结果为负数
     