Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


##### 思路
从后往前遍历字符串
判断异常（只能包含 I V X L C D M 字符）
记录前一个字符所代表的值与当前字符所代表的值的大小(从后往前遍历)
若前一个比当前的大，则结果减去当前字符代表的值
否则加上当前字符代表的值

```
如 MMMCMXCIX
设 preValue为前一个字符所代表的值，currentValue为当前字符代表的值，结果存入result, 初始都为0,
从后往前遍历字符串
第一次 读入 X : preValue=0 currentValue=10
             preValue <= currentValue; 则result += currentValue     =>  result = 10

第二次 读入 I : preValue=10 currentValue=1
             preValue > currentValue; 则result -= currentValue      =>  result = 9

第三次 读入 C : preValue=1 currentValue=100
             preValue <= currentValue; 则result += currentValue     =>  result = 109

第四次 读入 X : preValue=100 currentValue=10
             preValue > currentValue; 则result -= currentValue      =>  result = 99

第五次 读入 M : preValue=10 currentValue=1000
             preValue <= currentValue; 则result += currentValue     =>  result = 1099

第六次 读入 C : preValue=1000 currentValue=100
             preValue > currentValue; 则result -= currentValue      =>  result = 999

第七次 读入 M : preValue=100 currentValue=1000
             preValue <= currentValue; 则result += currentValue     =>  result = 1999

第八次 读入 M : preValue=1000 currentValue=1000
             preValue <= currentValue; 则result += currentValue      =>  result = 2999

第九次 读入 M : preValue=1000 currentValue=1000
             preValue <= currentValue; 则result += currentValue      =>  result = 3999

```