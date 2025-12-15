package  Recursive;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz: ");

        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        System.out.print("Sayinin ustunu giriniz: ");

        int uss=input.nextInt();
        int sonuc=ussAlma(sayi,uss);
        System.out.println("Uss Alma: "+sonuc);
        input.close();


    }
    public  static  int ussAlma(int taban,int uss){
        if (uss==0){
            return  1;
        }else {
            return taban*ussAlma(taban, uss-1);

        }
    }
}
