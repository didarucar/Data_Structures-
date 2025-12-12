public class BubbleApp {
    public static void main(String[] args) {


        Bubble dizi=new Bubble(10);


        dizi.insert(77);
        dizi.insert(66);
        dizi.insert(22);
        dizi.insert(78);
        dizi.insert(90);
        dizi.insert(44);
        dizi.insert(99);
        dizi.insert(81);
        dizi.insert(88);
        dizi.insert(21);

        dizi.display();
        dizi.bubbleSort();

        System.out.println("Dizi siralandiktan sonra: ");
        dizi.display();

    }
}
