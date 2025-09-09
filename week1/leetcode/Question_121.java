
package Leetcode;
// 121 Best time to sell and buy stock 
public class Question_121 {
	 public int maxProfit(int[] prices) {
	        int bp = Integer.MAX_VALUE;
	        int mx = 0;
	        for(int i : prices){
	            if(bp<i){
	                int pro = i-bp;
	                mx = Math.max(mx, pro);
	            }else{
	                bp= i;
	            }

	        }
	        return mx;
	    }

}

