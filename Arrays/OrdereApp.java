package  Arrays;
public class OrdereApp {


    public OrdereApp(int maxSize) {
    }

    public static void main(String[] args) {
        int maxSize=100;

        OrderArray dizi= new OrderArray(maxSize);

        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(22);
        dizi.insert(88);
        dizi.insert(11);
        dizi.insert(81);
        dizi.insert(66);
        dizi.insert(33);
        dizi.display();


    }
}
