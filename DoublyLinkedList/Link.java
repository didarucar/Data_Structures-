package DoublyLinkedList;

public class Link {
    public  long data;
    public  Link next;
    public  Link previons;


    public  Link(long data){
        this.data=data;
    }
    public  void  displayLink(){
        System.out.print(data+" ");
    }
}
