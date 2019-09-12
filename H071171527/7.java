import java.util.Scanner;

class Tujuh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int terbesar = Math.max(Math.max(x, y), z);
        System.out.println("bilangan terbesar: " + terbesar);
    }
}