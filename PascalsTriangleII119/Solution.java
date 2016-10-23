public class Solution {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        
        if (rowIndex < 0)
            return result;
        
        result.add(1);
        
        if (rowIndex == 0)
            return result;
        
        for (int i = 1; i <= rowIndex; i++) {
            int prevElem = 0;
            int currElem = 0;
            
            int size = result.size();
            
            for (int j = 0; j < size; j++) {
                prevElem = currElem;
                currElem = result.poll();
                result.add(prevElem + currElem);
            }
            
            result.add(1);
        }
        
        return result;
    }
}