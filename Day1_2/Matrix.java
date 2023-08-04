package Day1_2;
import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int max=0;
    int d;
    int ar[][]=new int[3][4];
    for(int i=0;i<row;i++){
        int count=0;
        for(int j=0;j<col;j++){
            int ele=sc.nextInt();
            if(ele==1){
                count++;
            }
            if(max<count){
                max=count;
                d=i+1;
            }
            }
        }
    }
}
