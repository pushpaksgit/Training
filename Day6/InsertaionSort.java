package Day6;

import java.util.*;
public class InsertationSort {
    public static void main(String[] args) {
        int arr[]={9,2,8,1,1};
        int j;
        int temp;
        for(int i=1;i<arr.length;i++){
            j=i-1;
            while(j!=-1 && arr[j+1]<arr[j]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

