package Day6;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String str="";
        int j;
     for(int i=1;i<arr.length;i++){
        j=i-1;
        while(j!=-1 && arr[j+1].length()<arr[j].length()){
            str="";
                str=str+arr[j+1];
                arr[j+1]="";
                 arr[j+1]=arr[j+1]+arr[j];
                 arr[j]="";
                 arr[j]=arr[j]+str;
                 j--;
        }
    }
    str="";
        System.out.println(Arrays.toString(arr));
        int c;
        int d;
        String f="",g="";
        for(int i=1;i<n;i++){
            String a=arr[i-1];
            String b=arr[i];
            if(a.length()==b.length()){
                for(int k=0;k<a.length();k++){
                    f="";
                    g="";
                    f=f+a.charAt(k);
                    g=g+b.charAt(k);
                    if(Integer.parseInt(f)>Integer.parseInt(g)){
                        str="";
                        str=str+arr[i];
                        arr[i]="";
                        arr[i]=arr[i]+arr[i-1];
                        arr[i-1]="";
                        arr[i-1]=arr[i-1]+str;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        
    } 
}
