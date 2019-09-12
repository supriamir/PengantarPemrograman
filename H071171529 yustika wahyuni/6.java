import java.util.Scanner;

class Enam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x==0) {
            System.out.println(x + " adalah nol");
        } else if(x<0) {
            System.out.println(x + " adalah bilangan negatif");
        } else{
            System.out.println(x + " adalah bilangan positif");
        }
    }
}