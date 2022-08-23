//*      *  i=1   ----->   1star  6spaces  1star
//**    **    2   ----->   2star  4spaces  2star
//***  ***    3   ----->   3star  2spaces  3star
//********    4   ----->   4star  0spaces  4star        spaces=2(n-i)
//********    5   ----->   4star  0spaces  4star
//***  ***    6   ----->   3star  2spaces  3star
//**    **    7   ----->   2star  4spaces  2star
//*      *    8   ----->   1star  6spaces  1star
import java.util.Scanner;
public class Butterflypattern {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //first half
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop for *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for Spaces
            int spaces=2*(n-i);for (int j = 1; j <= spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        //outer loop
        for (int i = n; i >=1; i--) {
            //inner loop for *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for Spaces
            int spaces=2*(n-i);
            for (int j = 1; j <= spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}