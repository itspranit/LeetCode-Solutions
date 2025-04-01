import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        
        // Stack to store valid directory names
        Stack<String> stack = new Stack<String>();
        
        // Split the path by "/" to get directory components
        String[] components = path.split("/");

        // Process each component
        for (String directory : components) {
           
            if (directory.equals(".") || directory.isEmpty()) {
                // Ignore "." (current directory) and empty components (caused by multiple slashes)
                continue;
            } else if (directory.equals("..")) {
                // ".." means going up one directory; pop from stack if it's not empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Add valid directory names to stack
                stack.add(directory);
            }
        }

        // Build the simplified canonical path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/"); // Add separator
            result.append(dir); // Append directory name
        }

        // Return the final simplified path, or root ("/") if empty
        return result.length() > 0 ? result.toString() : "/";
    }
}
