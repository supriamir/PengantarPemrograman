import java.util.Scanner;
class Seniorita6 {
  public static void main (String [] args) {
    Scanner obj = new Scanner(System.in);
    int X = obj.nextInt();

    if ( X > 0 ) {
      System.out.println ( X + " adalah Bilangan Positif ");
    } else
    if ( X < 0 ) {
      System.out.println ( X + " adalah Bilangan Negatif ");
    } else 
    if ( X == 0 ) {
      System.out.println ( X + " adalah Bilangan 0 ");
    }
  }
}
