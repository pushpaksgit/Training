package Training.Day3;
import java.util.*;
public class InsertationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,8,1,4,7,4,2};
        int key;
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

