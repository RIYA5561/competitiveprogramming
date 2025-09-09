package leetcode;

public class ques242 {
    // 242 Valid Anagram
public class Question_242 {
	 public boolean isAnagram(String s, String t) {
	        int[] freq = new int[256];
	        for(char c: s.toCharArray()){
	            freq[c]++;
	        }
	        for(char c: t.toCharArray()){
	            freq[c]--;
	        }
	        for(int i : freq){
	            if(i!=0){
	                return false;
	            }
	        }
	        return true;

	    }
}
    
}
