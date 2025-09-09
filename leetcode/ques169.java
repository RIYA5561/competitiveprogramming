package leetcode;

public class ques169 {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int val = 0;
        for(int i : nums){
            if(cnt == 0){
                val = i;
            }
            if(i==val){
                cnt++;
            }else{
                cnt--;
            }
        }
        return val;

    }
}

    

