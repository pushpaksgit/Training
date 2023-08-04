package Day1_2;
import java.util.*;
import java.util.concurrent.Flow.Subscriber;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        int num=0;
        int inp=input;
        while(input>0){
            num=num*10+input%10;
            input=input/10;
        }
        if(num==inp){
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}
