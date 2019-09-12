import java.util.Scanner;
class S {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();

        if(y%x==0){
            System.out.println(x+" merupakan kelipatan "+y);
        }else {
            System.out.println(x+" bukan kelipatan "+y);
        }

    }



}