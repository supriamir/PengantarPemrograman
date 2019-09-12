import java.util.Scanner;
public class Seniorita2 {

 public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        int N = obj.nextInt();
        int x = obj.nextInt();
        int y = obj.nextInt();

        if (y % x ==0 ) {
            System.out.println(x+" adalah kelipatan dari "+y);
        } else{
           System.out.println(x+"x bukan kelipatan dari y"+y); 
        }
    }
}