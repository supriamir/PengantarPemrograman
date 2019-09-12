import java.util.Scanner;

class Seniorita02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();

        if (N % 2 == 0) {
            if (N >= 10 && N < 100) {
                System.out.println(N + "Bilangan Genap yang lebih besar 10 dan kurang dari 100");
            }
        } else {
            if (N >= 10 && N < 100) {
                System.out.println(N + "Bilangan Ganjil yang lebih besar 10 dan kurang dari 100");
            }
        }

    }
}