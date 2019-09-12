import java.util.Scanner;
class Seniorita {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double angka1 = obj.nextDouble();
        double angka2 = obj.nextDouble();

        double hasil, hasilkali, hasilbagi;
        hasil = angka1 + angka2;
        hasilkali = angka1 * angka2;
        hasilbagi = angka1 / angka2;
        String nama = "Rafly";
        char jenisKelamain = 'L';

        System.out.println("Hasil Jumlah: " + hasil);
        System.out.println("Hasil kali: " + hasilkali);
        System.out.println("Hasil Bagi: " + hasilbagi);
        System.out.println(nama);
        System.out.println(jenisKelamain);

    }

}