package Arrays;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize=100;
        HighArray dizi=new HighArray(maxSize);


        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(88);
        dizi.insert(22);
        dizi.insert(81);
        dizi.insert(11);
        dizi.insert(66);
        dizi.insert(33);


        dizi.display();
        int seacrKey=55;
        if (dizi.find(seacrKey))
            System.out.println(seacrKey+"Bulundu!");
        else
            System.out.println(seacrKey+"Bulunamadı!");
        dizi.delete(88);
        dizi.delete(66);
        dizi.delete(99);
        dizi.display();



    }
}

