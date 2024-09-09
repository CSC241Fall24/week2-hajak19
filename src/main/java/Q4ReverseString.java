// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // Base case: if the string is empty or has only one character, return it
        if (s.length() <= 1) {
            return s;
        }
        
        // Recursive case: take the first character and move it to the end
        return reverse(s.substring(1)) + s.charAt(0);
    }
}