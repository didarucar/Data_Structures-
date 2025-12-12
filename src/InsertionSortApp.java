public class InsertionSortApp {
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 10;
        dizi[0] = 77;
        dizi[1] = 66;
        dizi[2] = 22;
        dizi[3] = 78;
        dizi[4] = 90;
        dizi[5] = 44;
        dizi[6] = 99;
        dizi[7] = 81;
        dizi[8] = 88;
        dizi[9] = 21;

        System.out.println("Siralamadan once: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
    }
        System.out.println();

        for (int i = 0; i <elemanSayisi ; i++) {
            long temp=dizi[i];
            int j=i;


            while (j>0  && dizi[j-1]>temp){
                dizi[j]=dizi[j-1];
                j--;
            }
            dizi[j]=temp;
        }
        System.out.println("Siraladiktan sonra: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");

        }
}
}
