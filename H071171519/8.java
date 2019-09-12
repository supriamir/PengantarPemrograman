import java.util.Scanner;

class Delapan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int terbesar;
        int terkecil;
        int rata;

        if (x >= y) {
            terbesar = x;
            if (terbesar >= z){
                System.out.println("Bilangan terbesar = " +  terbesar);
            }else {
                terbesar = z;
                System.out.println("Bilangan terbesar = " + z);
            }
        }else {
            terbesar = y;
            if (terbesar >= z){
                System.out.println("Bilangan terbesar = " + terbesar);
            } else {
                terbesar = z;
                System.out.println("Bilangan terbesar = " + z);

            }
        }

        if (x <= y) {
            terkecil = x;
            if (terkecil <= z) {
                System.out.ptintln("Bilangan terkecil = " + terkecil);
            } else {
                terkecil = z;
                System.out.println("Bilangan terbesar = " + z);
            }

        } else {
            terkecil = y;
            if (terkecil <= z) {
                System.out.println("Bilangan terkecil = " + terkecil);
            } else {
                terkecil = z;
                System.out.println("Bilangan terkecil = " + Z);
            }
        }

        System.out.println(terbesar);
        System.out.println(terkecil);

        rata = (terbesar + terkecil) / 2;
        System.out.println("rata-rata: " + rata);
        
            }
        }

