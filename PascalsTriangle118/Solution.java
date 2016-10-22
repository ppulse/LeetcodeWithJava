public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows < 1)
            return result;
        
        List<Integer> firstElem = new ArrayList<Integer>();
        firstElem.add(1);
        result.add(firstElem);
        
        if (numRows == 1) {
            return result;
        }

        for (int i = 2; i <= numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            
            List<Integer> preRow = result.get(i - 2);
            
            for (int j = 1; j < i - 1; j++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            
            row.add(1);
            result.add(row);
        }
        
        return result;
    }
}