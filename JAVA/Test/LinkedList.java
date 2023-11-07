package Test;

public class LinkedList<E> {
    public Node<E> head;
    public Node<E> tail;
    public int size;

    class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E data){
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E data){
        Node<E> newNode = new Node<>(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E removeFirst(){
        if(head == null){
            return null;
        }
        E data = head.data;
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
        return data;
    }

    public E removeLast(){
        if(tail == null){
            return null;
        }
        E data = tail.data;
        if(head == null){
            head = null;
            tail = null;
        }else{
            Node<E> current = head;
            while(current.next != tail){
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
        return data;
    }

    public E getFirst(){
        if(head == null){
            return null;
        }
        return head.data;
    }

    public E getLast(){
        if(tail == null){
            return null;
        }
        return tail.data;
    }

    public void add(E data){
        addLast(data);
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            
            current = current.next;
        }
    }

    public static void main(String[] agrs){
        LinkedList<String> list = new LinkedList<>();
        list.add("Dinh");
        list.add("Dinh");
        list.add("Khoi");

        System.out.print("Current list: ");
        list.printList();
        System.out.println("");
        list.removeLast();
        System.out.print("New list: ");
        list.printList();

    }
}
