Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation `00000000000000000000000000001011`, so the function should return 3.

##### 思路

n & (n - 1)能够将最低的位1置为0
如00001011
n    00001011
n-1  00001010
&
     00001010
有几次上述操作，就有几个1