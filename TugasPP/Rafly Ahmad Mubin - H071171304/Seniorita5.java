import java.util.Scanner;
class Seniorita5 {
  public static void main (String [] args) {
    Scanner obj = new Scanner(System.in);
    int X = obj.nextInt();
    int Y = obj.nextInt();

    if ( X % Y == 0 ) {
      System.out.println ( X + " adalah kelipatan dari " + Y);
    } else {
      System.out.println ( X + " bukan kelipatan dari " + Y);
    }
  }
}
