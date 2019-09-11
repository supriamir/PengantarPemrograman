import java.util.Scanner;

/**
 * Kuiz01
 */

public class Kuiz01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gajiPokok = input.nextDouble();
        if (gajiPokok > 0 && gajiPokok <= 400.00) {
            double kenaikanGajiPokok = gajiPokok * 0.15;
            double gajiPokokBaru = gajiPokok + kenaikanGajiPokok;
            double tunjangan = 100;
            double totalGajiPokok = gajiPokokBaru + tunjangan;
            System.out.printf("Kenaikan Gaji Pokok : %.2f\n", kenaikanGajiPokok);
            System.out.printf("Gaji Pokok Baru : %.2f\n", gajiPokokBaru);
            System.out.printf("Total Gaji Pokok : %.2f\n", totalGajiPokok);
        } else if (gajiPokok >= 400.01 && gajiPokok <= 800.00) {
            double kenaikanGajiPokok = gajiPokok * 0.12;
            double gajiPokokBaru = gajiPokok + kenaikanGajiPokok;
            double tunjangan = 150;
            double totalGajiPokok = gajiPokokBaru + tunjangan;
            System.out.printf("Kenaikan Gaji Pokok : %.2f\n", kenaikanGajiPokok);
            System.out.printf("Gaji Pokok Baru : %.2f\n", gajiPokokBaru);
            System.out.printf("Total Gaji Pokok : %.2f\n", totalGajiPokok);
        } else if (gajiPokok >= 800.01 && gajiPokok <= 1200.00) {
            double kenaikanGajiPokok = gajiPokok * 0.10;
            double gajiPokokBaru = gajiPokok + kenaikanGajiPokok;
            double tunjangan = 200;
            double totalGajiPokok = gajiPokokBaru + tunjangan;
            System.out.printf("Kenaikan Gaji Pokok : %.2f\n", kenaikanGajiPokok);
            System.out.printf("Gaji Pokok Baru : %.2f\n", gajiPokokBaru);
            System.out.printf("Total Gaji Pokok : %.2f\n", totalGajiPokok);
        } else if (gajiPokok >= 1200.01 && gajiPokok <= 2000.00) {
            double kenaikanGajiPokok = gajiPokok * 0.07;
            double gajiPokokBaru = gajiPokok + kenaikanGajiPokok;
            double tunjangan = 500;
            double totalGajiPokok = gajiPokokBaru + tunjangan;
            System.out.printf("Kenaikan Gaji Pokok : %.2f\n", kenaikanGajiPokok);
            System.out.printf("Gaji Pokok Baru : %.2f\n", gajiPokokBaru);
            System.out.printf("Total Gaji Pokok : %.2f\n", totalGajiPokok);
        } else if (gajiPokok >= 2001.00) {
            double kenaikanGajiPokok = gajiPokok * 0.04;
            double gajiPokokBaru = gajiPokok + kenaikanGajiPokok;
            double tunjangan = 750;
            double totalGajiPokok = gajiPokokBaru + tunjangan;
            System.out.printf("Kenaikan Gaji Pokok : %.2f\n", kenaikanGajiPokok);
            System.out.printf("Gaji Pokok Baru : %.2f\n", gajiPokokBaru);
            System.out.printf("Total Gaji Pokok : %.2f\n", totalGajiPokok);
        }
    }
}   