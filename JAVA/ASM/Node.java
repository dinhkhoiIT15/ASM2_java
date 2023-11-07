package ASM;

public class Node<E> {
    E data;
    public Node<E> next;

    public Node(E data){
        this.data = data;
        this.next = null;
    }
    public E getData(){
        return this.data;
    }
    public void setData(E data){
        this.data = data;
    }
}
