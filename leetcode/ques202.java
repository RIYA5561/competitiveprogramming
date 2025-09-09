package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ques202 {
    public boolean isHappy(int n) {
	        Set<Integer> hs = new HashSet<>();
	         while(n!=0 && !hs.contains(n)){
	            hs.add(n);
	            int sum = 0;
	            while(n>0){
	                int rem = n%10;
	                sum += rem*rem;
	                n=n/10;
	            }
	            n = sum;
	            
	        }
	        return n==1;
	    }
}
    

