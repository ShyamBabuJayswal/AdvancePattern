//    *****
//   *****      (n-i) space
//  *****
// *****
//*****
import java.util.Scanner;
public class SolidRombhus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //outer loop
    for(int i=1;i<=n;i++){
       //Inner loop
        // for space
       for(int j=1;j<=(n-i);j++){
           System.out.print(" ");
       }
       for(int j=1;j<=n;j++){
           System.out.print("*");
       }

        System.out.println();
    }


}}
