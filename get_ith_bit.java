import java.util.Scanner;
// note: here the ith bit is calculated from the end
//       i.e. 00001111 will have third bit as 1
public class get_ith_bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the ith index");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        if( (num & bitMask) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
