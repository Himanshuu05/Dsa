import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int num[]={1,2,3,2};
        int target=5;
        int sum;
        int n= num.length;
        boolean found=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum=num[i]+num[j]+num[k];
                    if(sum==target){
                        System.out.println("Triplet is " + num[i] + "," + num[j] + "," + num[k]);
                        found=true;
                    }
                }
            }
        }
        if(!found){
            System.out.println("triplet is not found");
        }
    }
}
