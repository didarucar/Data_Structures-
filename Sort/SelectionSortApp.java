package Sort;

public class SelectionSortApp {
    public static void main(String[] args) {


    long[] dizi = new long[100];
    int elemanSayisi = 10;

    dizi[0] = 77;
    dizi[1] = 66;
    dizi[2] = 22;
    dizi[3] = 11;
    dizi[4] = 55;
    dizi[5] = 33;
    dizi[6] = 99;
    dizi[7] = 44;
    dizi[8] = 81;
    dizi[9] = 21;

        System.out.println("Siralamadan once: ");

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");

        }
        System.out.println();

        for (int i = 0; i <elemanSayisi-1 ; i++) {
            int minIndex=i;
            for (int j = i+1; j <elemanSayisi ; j++) {
                if (dizi[j]<dizi[minIndex]){

                    minIndex=j;
                }

            }
            if (minIndex !=i){
                long temp=dizi[i];
                dizi[i]=dizi[minIndex];
                dizi[minIndex]=temp;

            }
        }
        System.out.println("Siralamadan sonra:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
}
}}
