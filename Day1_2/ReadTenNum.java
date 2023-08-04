package Day1_2;
import java.util.*;
public class ReadTenNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fn=sc.nextInt();
    int max=fn;
    int min=fn;
    int max2=fn;
    for(int i=0;i<3;i++){
        int sn=sc.nextInt();
        if(max<sn){
            max2=max;
            max=sn;
        }
        else if(min>sn)
            min=sn;
    }
    System.out.println("Min"+min);
    System.out.println("Second max"+max2);
    }

}
