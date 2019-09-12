import java.util.Scanner;
 class Seniorita3 {

 public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        int x = obj.nextInt();
        

        if ( x==0 ) {
            System.out.println(x +" x adalah nol ");
        } else if (x<0) {
           System.out.println(" bilangan negatif"); 
        } else{
            System.out.println(" bilangan positif");
        }
    }
}