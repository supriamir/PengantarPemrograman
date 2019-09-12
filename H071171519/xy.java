import java.util.Scanner;
public class xy {
    public static void main (String[] args) {
        Scanner pandy = new Scanner (System.in);
        int x = pandy.nextInt();
        int y = pandy.nextInt();
        
        if (x % y == 0) {
            System.out.println("x adalah kelipatan dari y");
        }
    }
}