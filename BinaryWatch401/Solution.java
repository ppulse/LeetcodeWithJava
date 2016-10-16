import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> readBinaryWatch(int num) {
        Map<Integer, List<Integer>> hourContainer = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> minuteContainer = new HashMap<Integer, List<Integer>>();
        
        for (int i = 0; i < 12; i++) {
            if (!hourContainer.containsKey(numOfBitOne(i))) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                hourContainer.put(numOfBitOne(i), list);
            } else {
                hourContainer.get(numOfBitOne(i)).add(i);
            }
        }
        
        for (int i = 0; i < 60; i++) {
            if (!minuteContainer.containsKey(numOfBitOne(i))) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                minuteContainer.put(numOfBitOne(i), list);
            } else {
                minuteContainer.get(numOfBitOne(i)).add(i);
            }
        }
        
        List<String> result = new ArrayList<String>();
   
        for (int i = 0; i < 4 && i <= num; i++) {
            List<Integer> hourList = hourContainer.get(i);
            List<Integer> minuteList = minuteContainer.get(num - i);
                
            if (minuteList != null) {
                for (int hour : hourList) {
                    for (int minute : minuteList) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(hour);
                        sb.append(":");
                        if (minute < 10) {
                            sb.append("0");
                        }
                        sb.append(minute);
                        
                        result.add(sb.toString());
                    }
                }
            }
        }
        
        
        return result;
    }
    
    private int numOfBitOne(int num) {
        int value = num;
        int cnt = 0;
        
        while (value != 0) {
            cnt++;
            value = value & (value - 1);
        }
        
        return cnt;
    }
}