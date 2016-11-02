public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Parts = version1.split("\\.");
        String[] version2Parts = version2.split("\\.");
        
        int indexOfVersion1Parts = 0;
        int indexOfVersion2Parts = 0;
        
        while (indexOfVersion1Parts < version1Parts.length 
            && indexOfVersion2Parts < version2Parts.length) {
            int subVersion1 = Integer.valueOf(version1Parts[indexOfVersion1Parts]);
            int subVersion2 = Integer.valueOf(version2Parts[indexOfVersion2Parts]);
            if (subVersion1 < subVersion2) {
                return -1;
            } else if (subVersion1 > subVersion2) {
                return 1;
            } else {
                indexOfVersion1Parts++;
                indexOfVersion2Parts++;
            }
        }
        
        if (indexOfVersion1Parts == version1Parts.length) {
            if (indexOfVersion2Parts == version2Parts.length)
                return 0;
            else {
                while (indexOfVersion2Parts < version2Parts.length) {
                    if (Integer.valueOf(version2Parts[indexOfVersion2Parts++]) != 0)
                        return -1;
                }
                
                return 0;
            }
        } else {
            while (indexOfVersion1Parts < version1Parts.length) {
                if (Integer.valueOf(version1Parts[indexOfVersion1Parts++]) != 0)
                    return 1;
            }
                
            return 0;
        }
    }
}