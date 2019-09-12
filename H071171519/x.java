import java.util.Scanner;

class x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextint();

        if (x==0) {
            System.out.println(x + "adalah nol");
        }else if(x<0) {
            System.out.println(x + "adalah bilangan negatif");
        }else{
            System.out.println(x + "adalah bilangan positif");
        }
    }
}