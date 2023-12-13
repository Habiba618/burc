import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ay, gun;
        boolean isError=false;
        Scanner sc = new Scanner(System.in);
        ay=sc.nextInt();
        gun=sc.nextInt();
        if (ay<=12 && ay>=1){
            if ((ay == 3 && gun <= 31 && gun >= 21) || (ay == 4 && gun <= 20 && gun >= 1)) {
                System.out.println("Koç Burcu: 21 Mart - 20 Nisan");
            } else if ((ay == 4 && gun <= 30 && gun >= 21) || (ay == 5 && gun <= 21 && gun >= 1)) {
                System.out.println("Boğa Burcu: 21 Nisan - 21 Mayıs");
            } else if ((ay == 5 && gun <= 31 && gun >= 22) || (ay == 6 && gun <= 22 && gun >= 1)) {
                System.out.println("İkizler Burcu: 22 Mayıs - 22 Haziran");
            } else if ((ay == 6 && gun <= 30 && gun >= 23) || (ay == 7 && gun <= 22 && gun >= 1)) {
                System.out.println("Yengeç Burcu: 23 Haziran - 22 Temmuz");
            } else if ((ay == 7 && gun <= 31 && gun >= 23) || (ay == 8 && gun <= 22 && gun >= 1)) {
                System.out.println("Aslan Burcu: 23 Temmuz - 22 Ağustos");
            } else if ((ay == 8 && gun <= 31 && gun >= 23) || (ay == 9 && gun <= 22 && gun >= 1)) {
                System.out.println("Başak Burcu: 23 Ağustos - 22 Eylül");
            } else {
                System.out.println("Belirtilen tarih aralıklarında bir burc bulunmamaktadır.");
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız. Lütfen geçerli bir ay giriniz.");
        }
    }
}
