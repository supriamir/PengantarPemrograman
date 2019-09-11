import java.util.Scanner;

class Kuiz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int totalSks = obj.nextInt();
        int sksdasar = 8;
        int skslebih;
        obj.close();
        if (totalSks > 1 && totalSks < 8) {
            int denda = 200;
            int totalInsentif = -denda;
            System.out.println("Total Insentif:" + totalInsentif);
        } else if (totalSks == 8) {
            int totalInsentif = sksdasar * 200;
            System.out.println("Total Insentif" + totalInsentif);
        } else {
            if (totalSks > 8) {
                skslebih = totalSks - sksdasar;
                int totalInsentif = sksdasar * 200 + skslebih * 100;
                System.out.println("Total Insentif:" + totalInsentif);
            }
        }
    }
}