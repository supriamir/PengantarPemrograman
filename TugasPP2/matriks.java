import java.util.Scanner;
class matriks{
  public static void main (String[]args){

    Scanner obj = new Scanner(System.in);

    int x = obj.nextInt();
    int y = obj.nextInt();
    int sum = 0;

    int mat[][] = new int [x][y];

    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat.length; j++){
        if (i == j){
          matriks[i][j] = 1;
          sum += matriks[i][j];
        }else{
          matriks[i][j] = 0;
          sum += matriks[i][j];
        }
      }
    }

    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat.length; j++){
        System.out.print(matriks[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println(sum);
}
}
