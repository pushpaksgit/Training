package Day4;
import java.util.*;
public class PairSum {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int ar[]={1,2,4,6,3,8};
    int k=sc.nextInt();
    for(int i=0;i<ar.length;i++){
        for(int j=i;j<ar.length;j++){
            if(ar[j]==(k-ar[i])){
                System.out.println(ar[j]+","+ar[i]);
            }
        }
    }
    }
}
