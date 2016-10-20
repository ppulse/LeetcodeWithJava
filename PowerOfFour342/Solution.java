public class Solution {
    // public boolean isPowerOfFour(int num) {
    //     if (num < 1)
    //         return false;
        
    //     while (num % 4 == 0)
    //         num >>= 2;
        
    //     return num == 1;
    // }
    
    // without loops/recursion
    public boolean isPowerOfFour(int num) {
        switch (num) {
            case 1:          //fall through
            case 4:          //fall through
            case 16:         //fall through
            case 64:         //fall through
            case 256:        //fall through
            case 1024:       //fall through
            case 4096:       //fall through
            case 16384:      //fall through
            case 65536:      //fall through
            case 262144:     //fall through
            case 1048576:    //fall through
            case 4194304:    //fall through
            case 16777216:   //fall through
            case 67108864:   //fall through
            case 268435456:  //fall through
            case 1073741824: 
                return true;
            default:
                return false;
        }
    }
}