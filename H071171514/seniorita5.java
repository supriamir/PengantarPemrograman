import java.util.Scanner;
class seniorita5 {
    public static void main(String [] args ) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int terbesar;
        int terkecil;
        int rata;

        if (x >= y){
            terbesar = x ;
        } else {
            terbesar = y ;
        }
        if (x >= y){
            terkecil = x ;
        } else {
            terkecil = y ;
        }

        if (terbesar >= z){
            System.out.println("bilangan terbesar =" + terbesar);
        } else {
            terbesar = z;
            System.out.println("bilangan terbesar = " + z);

        }
        if (terbesar >= z){
            System.out.println("bilangan terkecil =" + terkecil);
        } else {
            
           System.out.println("bilangan terkecil = " + z);

        }
         System.out.println(terbesar);
         System.out.println(terkecil);

         rata = (terbesar+terkecil)/2;
         System.out.println("rata-rata : "+rata);
    }
}


        

