import java.util.*;
public class prefixSum {
    public static void main(String[] args) {
        System.out.println("Enter length of an array");
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter value of the array");
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int[] prefixSum=new int[N];
        prefixSum[0]=arr[0];
        for(int i=1;i<N;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.println("Enter number of queries");
        int Q= sc.nextInt();
        for(int i=0;i<Q;i++){
            System.out.println("Enter L");
            int L= sc.nextInt();
            System.out.println("Enter R");
            int R= sc.nextInt();
            int sum;
            if(L==0){
               sum=prefixSum[R];
            }
            else{
                sum=prefixSum[R]-prefixSum[L-1];
            }
            System.out.println("Sum" + sum);
        }

    }
}
