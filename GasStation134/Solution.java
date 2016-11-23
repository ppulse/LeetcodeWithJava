public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length != cost.length)
            return -1;
        
        int[] gasLeft = new int[gas.length];

        for (int i = 0; i < gas.length;) {
            int j = 0;
            if (gas[i] >= cost[i]) {
                int remainGas = 0;
                for (; j < gas.length && remainGas >= 0; j++)  {
                    int idx = (i + j) % gas.length;
                    remainGas += gas[idx] - cost[idx];
                }
                if (j == gas.length && remainGas >= 0)
                    return i;
            }
            
            if (j > 0)
                i += j;
            else
                i++;
        }
        
        return -1;
    }
}