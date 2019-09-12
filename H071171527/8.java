import java.util.Scanner;

class Delapan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int terbesar = Math.max(Math.max(x, y), z);
        int terkecil = Math.min(Math.min(x, y), z);
        int rata = (terbesar+terkecil)/2;

        System.out.println("bilangan terbesar: " + terbesar);
        System.out.println("bilangan terkecil: " + terkecil);
        System.out.println("rata-rata: "+rata);
    }
}