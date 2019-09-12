import java.util.Scanner;
class S01 {

    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        if (x < 0){
            System.out.println("Merupakan bilangan negatif");
        } else if (x > 0){
            System.out.println("Merupakan bilangan positif");
        } else if (x == 0){
            System.out.println("Merupakan bilangan 0");
        }
    }
}