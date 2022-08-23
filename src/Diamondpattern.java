//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *
import java.util.Scanner;
public class Diamondpattern {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //first half
        //outer loop
        for (int i = 1; i <=n; i++) {
            //inner loop for space
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //for *
            int star=2*i-1;
            for (int j = 1; j <= star;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //second half
        //outer loop
        for (int i = n; i >=1; i--) {
            //inner loop for space
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //for star
            int star=2*i-1;
            for (int j = 1; j <= star;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

