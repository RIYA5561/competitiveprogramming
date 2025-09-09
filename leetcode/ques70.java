package leetcode;

public class ques70 {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int curr = 0;
        int prev = 2;
        int next = 3;
        for(int i = 3;i<n;i++){
            curr = prev+next;
            prev = next;
            next = curr;
        }
        return curr;

    }
}
    

