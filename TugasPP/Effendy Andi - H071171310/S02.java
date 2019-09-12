import java.util.Scanner;
class S02{

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int  x = obj.nextInt();
        int  y = obj.nextInt();
        int  z = obj.nextInt();
        int  r;

        r = (x + y + z) / 3;

        System.out.println("Rata-Rata : "+r);

        if        (x > y && x > z) {System.out.println(x + " Merupakan bilangan terbesar");
        } else if (y > z && y > x) {System.out.println(y + " Merupakan bilangan terbesar");
        } else if (z > x && z > y) {System.out.println(z + " Merupakan bilangan terbesar");
        } else if (x == y && x > z) {System.out.println(x + " Merupakan bilangan terbesar");
        } else if (x == z && x > y) {System.out.println(x + " Merupakan bilangan terbesar");
        } else {System.out.println(" Ketiga Bilangan Kembar");
        }        
        
        if        (x < y && x < z) {System.out.println(x + " Merupakan bilangan terkecil");
        } else if (y < z && y < x) {System.out.println(y + " Merupakan bilangan terkecil");
        } else if (z < x && z < y) {System.out.println(z + " Merupakan bilangan terkecil");
        } else if (x == y && x < z) {System.out.println(x + " Merupakan bilangan terkecil");
        } else if (x == z && x < y) {System.out.println(x + " Merupakan bilangan terkecil");
        } else {System.out.println("Ketiga Bilangan Kembar");
        }
    }
}