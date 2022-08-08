import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<String> parentheses = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                parentheses.push(s.substring(i, i+1));
            } else if (s.charAt(i) == ')') {
                if (parentheses.empty()) {
                    return false;
                } else if (parentheses.peek().equals("(")) {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
            
            if (s.charAt(i) == '[') {
                parentheses.push(s.substring(i, i+1));
            } else if (s.charAt(i) == ']') {
                if (parentheses.empty()) {
                    return false;
                } else if (parentheses.peek().equals("[")) {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
            
            if (s.charAt(i) == '{') {
                parentheses.push(s.substring(i, i+1));
            } else if (s.charAt(i) == '}') {
                if (parentheses.empty()) {
                    return false;
                } else if (parentheses.peek().equals("{")) {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
        }
        
        if (parentheses.empty()) 
            return true;
        else 
            return false;
    }
}