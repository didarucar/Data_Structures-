package Arrays;

public class LowArrayApp {
    public static void main(String[] args) {

        LowArray dizi;
        dizi = new LowArray(100);
        int elemanSayisi = 0;
        int j;
        dizi.setElem(0, 77);
        dizi.setElem(1, 99);
        dizi.setElem(2, 44);
        dizi.setElem(3, 55);
        dizi.setElem(4, 88);
        dizi.setElem(5, 11);
        dizi.setElem(6, 81);
        dizi.setElem(7, 66);
        dizi.setElem(8, 33);


        elemanSayisi = 10;
        for (j = 0; j < elemanSayisi; j++)
            System.out.print(dizi.getElem(j) + " ");

        System.out.println("");

        int searchKey = 26;


        for (j = 0; j < elemanSayisi; j++)
            if (dizi.getElem(j) == searchKey)
                break;
        if (j == elemanSayisi)
            System.out.println(searchKey + " Bulunamadı !");
        else
            System.out.println(searchKey + "Bulndu !");


        for (j = 0; j < elemanSayisi; j++)
            if (dizi.getElem(j) == 55)
                break;


        for (int k = j; k < elemanSayisi; k++)
            dizi.setElem(k, dizi.getElem(k + 1));
        elemanSayisi--;

        for (j = 0; j < elemanSayisi; j++)
            System.out.print(dizi.getElem(j) + " ");
        System.out.println("");


    }
}










