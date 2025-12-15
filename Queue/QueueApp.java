package Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue thequeue=new Queue(5);


        thequeue.insert(10);
        thequeue.insert(20);
        thequeue.insert(30);
        thequeue.insert(40);


        thequeue.remove();
        thequeue.remove();

        thequeue.insert(50);
        thequeue.insert(60);

        while (!thequeue.isEmpty()) {
            long n = thequeue.remove();

            System.out.print(n + " ");
        }
        System.out.println("");

        }

    }

