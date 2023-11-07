import java.util.Scanner;

public class LinkedList<E> {
    public Node<E> head;

    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(E data){
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node<E> last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    public E removeFirst(){
        if(head == null){
            return null;
        }
        E data = head.data;
        head = head.next;
        return data;
    }

    public E removeLast(){
        if(head == null){
            return null;
        }
        if(head.next == null){
            E data = head.data;
            head = null;
            return data;
        }
        Node<E> last = head;
        while(last.next.next != null){
            last = last.next;
        }
        E data = last.next.data;
        last.next = null;
        return data;
    }

    public E getFirst(){
        if(head == null){
            return null;
        }
        return head.data;
    }

    public E getLast(){
        if(head == null){
            return null;
        }
        Node<E> last = head;
        while(last.next != null){
            last = last.next;
        }
        return last.data;
    }

    public void printList() {
        Node<E> original = head;
        while (original != null) {
            System.out.print("|" + original.data + "|");
            
            original = original.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // list.addFirst("Dinh Khoi");
        // list.addFirst("Nhut Truong");
        // list.addFirst("Hoang Phuc");
        // list.addFirst("Viet Tien");
        // list.addLast("Huu Nghia");
        String[] sList = {};

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of list: ");
        int n = scn.nextInt();
        scn.nextLine();
        for(int i=0; i<n; i++){
            System.out.print("Enter name: ");
            String element = scn.nextLine();
            list.addLast(element);
        }
        scn.close();
        for(String element : sList){
            System.out.println(element);
        }


        // System.out.print("Original list: ");
        // list.printList();
        // System.out.println("");
        // System.out.print("Last element: ");
        // System.out.print(list.getLast());
    }
}