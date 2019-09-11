import java.util.Scanner;

class Kuiz01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int totalSks = obj.nextInt(),intensifDasar,totalIntensif,denda,intensifLebih;
        if (totalSks == 8){
            intensifDasar = 8;
            totalIntensif = intensifDasar * 200;
            System.out.printf("intensif dasar = %dsks \n total intensif = $%d",intensifDasar,totalIntensif);//
        }else if(totalSks > 8){
            intensifDasar = 8;
            intensifLebih = totalSks - intensifDasar;
            totalIntensif = (intensifDasar * 200) + (intensifLebih * 100);
            System.out.printf("intensif dasar =%dsks \nintensif lebih = %dsks \n total intensif =$%d  ",intensifDasar,intensifLebih,totalIntensif);//
        }else {
            if(totalSks >=1 && totalSks < 8){
                denda = 200;
                intensifDasar = 0;
                totalIntensif = intensifDasar - denda;
                System.out.printf("intensif dasar =%dsks \n denda = %d \n tootal intensif =$%d",intensifDasar,denda,totalIntensif);
            }//
        }
        
    }

}