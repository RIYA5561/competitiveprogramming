package leetcode;

public class ques125 {
    class Solution {
	    public boolean isPalindrome(String s) {
	       StringBuilder sb = new StringBuilder();
	       for(char c: s.toCharArray()){
	            if((c>='A'&& c<='Z')){
	                sb.append((char)(c+32));
	            }else if((c>='a' && c<='z')){
	                sb.append(c);
	            }else if(Character.isDigit(c)){
	                sb.append(c);
	            }
	       }
	       int l = 0;
	       int r = sb.length()-1;
	       while(l<r){
	        if(sb.charAt(l)!=sb.charAt(r)){
	            return false;
	        }
	        l++;
	        r--;
	       }
	       return true;

	    }
	}
}
    

