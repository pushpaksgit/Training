package Day5;

import java.util.ArrayList;
import java.util.Arrays;

//learn about string builder and string buffers
public class ShiftingLetter {
    public static void main(String[] args) {
        String str="abc";
        int ar[] ={3,5,9};
        char aray[]= str.toCharArray();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        int k=0;
        for(int i=(ar.length-1);i>=0;i--){
            char c=aray[i];
            int index=alpha.indexOf(c);
            k=k+ar[i];
            aray[i]=alpha.charAt(k+index);
        }
        str="";
        for(int i=0;i<aray.length;i++){
            str=str+aray[i];
        }
        System.out.println(str);

    }
}
