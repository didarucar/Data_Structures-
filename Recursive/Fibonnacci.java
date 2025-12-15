package  Recursive;

import java.util.Scanner;

public class Fibonnacci {

    public  static long fib(int n){
        if ((n==0)||(n==1)){
            return  n;

        }
        else {
            return  fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Bir sayi girinniz:");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        long startTime=System.currentTimeMillis();
        long sonuc=fib(sayi);
        long endTime=System.currentTimeMillis();


        double totalTime=(endTime-startTime)/1000.0;
        System.out.println("Toplam Sure: "+totalTime);

        System.out.println(sayi+".Fibonnacci sayisi: "+sonuc);
        input.close();
    }
}
