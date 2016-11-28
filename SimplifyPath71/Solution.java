public class Solution {
    public String simplifyPath(String path) {
        if (path == null)
            return "/";
        
        Stack<String> stack = new Stack<String>();
        stack.push("/");
        
        String[] pathArray = path.split("/");
        
        for (int i = 0; i < pathArray.length; i++) {
            if (pathArray[i].equals(".") || pathArray[i].equals("")) {
                //do nothing
            } else if (pathArray[i].equals("..")) {
                if (!stack.peek().equals("/"))
                    stack.pop();
            } else {
                stack.push(pathArray[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
        	sb.append(s);
        	if (!s.equals("/"))
        		sb.append("/");
        }
        
        String result = sb.toString();
        return result.length() > 1 ? result.substring(0, result.length() - 1) : result;
    }
}