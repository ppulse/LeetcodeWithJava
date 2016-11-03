public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (!isValidRectangle(A, B, C, D) || !isValidRectangle(E, F, G, H))
            return 0;
        
        int rect1Area = (D - B) * (C - A);
        int rect2Area = (H - F) * (G - E);
        int totalArea = rect1Area + rect2Area - getOverLappedArea(A, B, C, D, E, F, G, H); 
        
        return totalArea;
    }
    
    private int getOverLappedArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int xLength = getOverlappedLength(A, C, E, G);
        int yLength = getOverlappedLength(B, D, F, H);
        
        return xLength * yLength;
    }
    
    private int getOverlappedLength(int A, int B, int C, int D) {
        // C---A----B---D
        if (C <= A && B <= D && A <= B)
            return B - A;

        // A---C---D---B
        if (A <= C && D <= B && C <= D)
            return D - C;
        
        // A---C---B---D
        if (A <= C && B <= D && C <= B)
            return B - C;
        
        // C---A---D---B
        if (C <= A && D <= B && A <= D)
            return D - A;
        
        return 0;
    }
    
    private boolean isValidRectangle(int A, int B, int C, int D) {
        if (A > C || B > D)
            return false;
        else
            return true;
    }
}