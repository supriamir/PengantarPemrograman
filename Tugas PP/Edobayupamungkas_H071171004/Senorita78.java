import java.util.Scanner;
class Senorita78 {
  public static void main (String [] args) {
    Scanner obj = new Scanner(System.in);
    int X = obj.nextInt();
    int Y = obj.nextInt();
    int Z = obj.nextInt();
    int r;

    r = (X + Y + Z)/3;
    System.out.println ("Rata - Rata" +r);

    if (X > Y && X > Z){
      System.out.println(X + " adalah Bilangan Terbesar ");
    } else
    if (Y > Z && Y > X){
      System.out.println(Y + " adalah Bilangan Terbesar ");
    } else
    if (Z > X && Z > Y){
      System.out.println(Z + " adalah Bilangan Terbesar ");
    } else
    if (X == Y && X > Z){
      System.out.println(X + " adalah Bilangan Terbesar ");
    } else
    if (X == Z && X > Y){
      System.out.println(X + " adalah Bilangan Terbesar ");
    } else {
          System.out.println(" Ketiga Bilangan Sama ");
    }

    if (X < Y && X < Z){
      System.out.println(X + " adalah Bilangan Terkecil ");
    } else
    if (Y < Z && Y < X){
      System.out.println(Y + " adalah Bilangan Terkecil ");
    } else
    if (Z < X && Z < Y){
      System.out.println(Z + " adalah Bilangan Terkecil ");
    } else
    if (X == Y && X < Z){
      System.out.println(X + " adalah Bilangan Terkecil ");
    } else
    if (X == Y && X < Z){
      System.out.println(X + " adalah Bilangan Terkecil ");
    } else {
          System.out.println(" Ketiga Bilangan Sama ");
    }
  }
}
