import java.util.Scanner;

public class clear_ith_bit {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the ith index");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        System.out.println(num & ~bitMask);
    }
}
