package DoublyLinkedList;

public class DoublyLinkList {
    private  Link head;

    private  Link tail;

    public  DoublyLinkList(){
        head=null;
        tail=null;

    }
    public  boolean isEmpty(){
        return  head==null;
    }
    public  void  insertFirt(long d){
        Link newLink=new Link(d);

        if (isEmpty()){
            tail=newLink;
        }
        else {
            head.previons=newLink;
        }
        newLink.next=head;
        head=newLink;
    }
    public  void  insertToTail(long d){
        Link newLink=new Link(d);

        if (isEmpty()){
            head=newLink;
        }
        else {
            tail.next=newLink;
            newLink.previons=tail;
        }
        tail=newLink;
    }
    public  Link deleteFirst(){
        Link temp=head;


        if (head.next==null){

            tail=null;
        }
        else {
            head.next.previons=null;
        }
        head=head.next;
        return  temp;
    }
    public  Link deleteFromTail(){
        Link temp=tail;

        if (head.next==null){
            head=null;
        }
        else {
            tail.previons.next=null;
        }
        tail=temp.previons;

        return  temp;

    }
    public  Link find(long key){
        Link current=head;


        while (current.data!=key){
            current=current.next;

            if (current==null){
                return  null;
            }
        }
        return  current;
    }
    public  void  delete(long d){
        Link current=find(d);

        if (current!=null){
            if (current==head){

                head=current.next;

                head.previons=null;
            } else if (current==tail) {
                tail=current.previons;
                tail.next=null;

            }
            else {
                current.previons.next=current.next;

                current.next.previons=current.previons;
            }
        }
    }
    public  void  displayFoeward(){
        System.out.print("Liste: (head--tail):");
        Link current=head;

        while (current!=null){

            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
    public  void  displayBackward(){
        System.out.print("Liste:(tail--head):");

        Link current=tail;


        while (current!=null){

            current.displayLink();
            current=current.previons;
        }
        System.out.println("");
    }
}
