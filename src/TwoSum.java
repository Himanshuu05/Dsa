import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        int ans[]=new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    System.out.println("indices are " + ans[0]+ " " + ans[1]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={2,0,3,1};
        twoSum(nums,5);

    }
}