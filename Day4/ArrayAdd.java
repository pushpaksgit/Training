package Day4;
import java.util.*;
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar1[]={1,4,5,3,5,7};
        int ar2[]={6,3,2};
        int f=0,s=0;
        for(int i=0;i<ar1.length;i++){
            f=f*10+ar1[i];
        }
        for(int j=0;j<ar2.length;j++){
            s=s*10+ar2[j];
        }
        int res=f+s;
        String r="";
        r=r+res;
        int ar[]=new int[r.length()];
        for(int i=0;i<r.length();i++){
            String rr="";
            rr=rr+r.charAt(i);
            ar[i]=Integer.parseInt(rr);
        }
        System.out.println(Arrays.toString(ar));
        
          
    }
}

