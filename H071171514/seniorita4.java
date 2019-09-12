import java.util.Scanner;
class seniorita4 {
    public static void main(String [] args ) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int terbesar ;

        if(x>=y){
            terbesar = x;
    } else {
        terbesar = y;
 }
    if(terbesar>=z){
        System.out.println("bilangan terbesar = "+terbesar);
   }else{
       System.out.println("bilangan terbesar = "+ z);
   }
}
}



