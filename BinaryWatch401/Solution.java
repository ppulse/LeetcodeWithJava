import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    private Map<Integer, List<Integer>> hourContainer = new HashMap<Integer, List<Integer>>();
    private Map<Integer, List<Integer>> minuteContainer = new HashMap<Integer, List<Integer>>();
    
    public List<String> readBinaryWatch(int num) {
        cacheNumsOfBitOne();
        
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 4 && i <= num; i++) {
            List<Integer> hourList = hourContainer.get(i);
            List<Integer> minuteList = minuteContainer.get(num - i);
                
            if (minuteList != null) {
                for (int hour : hourList) {
                    for (int minute : minuteList) {
                        result.add(hourMinuteToString(hour, minute));
                    }
                }
            }
        }
        
        return result;
    }
    
    private void cacheNumsOfBitOne() {
        cacheNumsOfBitOneHour();
        
        cacheNumsOfBitOneMinute();
    }
    
    private void cacheNumsOfBitOneHour() {
        cacheNumsOfBitOne(hourContainer, 12);
    }
    
    private void cacheNumsOfBitOneMinute() {
        cacheNumsOfBitOne(minuteContainer, 60);
    }
    
    private void cacheNumsOfBitOne(Map<Integer, List<Integer>> container, int loopTimes) {
        for (int i = 0; i < loopTimes; i++) {
            if (!container.containsKey(numOfBitOne(i))) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                container.put(numOfBitOne(i), list);
            } else {
                container.get(numOfBitOne(i)).add(i);
            }
        }
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
    
    private String hourMinuteToString(int hour, int minute) {
        StringBuilder sb = new StringBuilder();
        sb.append(hour);
        sb.append(":");
        if (minute < 10) {
            sb.append("0");
        }
        sb.append(minute);
        return sb.toString();
    }
}