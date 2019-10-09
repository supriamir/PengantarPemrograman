import java.util.Scanner;
class ArrayEdo{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);

    int x = obj.nextInt();
    int y = obj.nextInt();
    int sum = 0;

    int matriks[][] = new int [x][y];

    for (int i = 0; i < matriks.length; i++){
      for (int j = 0; j < matriks.length; j++){
        if (i == j){
          matriks[i][j] = 1;
          sum += matriks[i][j];
        }else{
          matriks[i][j] = 0;
          sum += matriks[i][j];
        }
      }
    }

    for (int i = 0; i < matriks.lenght; i++){
      for (int j = 0; j < matriks.lenght; j++){
        System.out.print(matriks[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println(sum);
}
