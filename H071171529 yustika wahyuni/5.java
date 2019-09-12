import java.util.Scanner;
class Seniorita{
    public static void main(String[] args) {
        Scanner jec = new Scanner (System.in);
        
        int x = jec.nextInt();
        int y = jec.nextInt();

        if (y % x ==0 ) {
            System.out.println(" adalah kelipatan dari ");
        } else{
           System.out.println("x bukan kelipatan dari y"); 
        }
    }
}