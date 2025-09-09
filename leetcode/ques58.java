package leetcode;

public class ques58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return (arr[arr.length-1]).length();
        
    }
}
    

