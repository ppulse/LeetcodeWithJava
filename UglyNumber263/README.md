Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include `2, 3, 5`. For example, `6, 8` are ugly while `14` is not ugly since it includes another prime factor `7`.

Note that `1` is typically treated as an ugly number.


##### 思路
循环除2直到余数不为0
循环除3直到余数不为0
循环除5直到余数不为0
若最后结果为1，则为丑数，否则不是