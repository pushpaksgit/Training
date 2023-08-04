package Day1_2;
import java.util.*;
public class Astric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int countAstric=0,countHash=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='*'){
                countAstric++;
            }
            else{
                countHash++;
            }
        }
        if(countAstric>countHash){
            System.out.println("1");
        }
        else if(countAstric<countHash){
            System.out.println("-1");
        }
        else
        System.out.println("0");
    }
}
