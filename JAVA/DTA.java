public class DTA <E>{
    public Node<E> head;

    public static class Node<E>{
        public E element;
        public Node<E> next;

        public Node(E element){
            this.element = element;
            next = null;
        }
    }

    public void addFirst(E element){
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node<E> current = head;
        while(current != null){
            System.out.print(current.element + "jjj");

            current = current.next;
        }
    }

    public void main(String[] agrs){
        DTA<String> lList = new DTA<>();
        lList.addFirst("hgasdfygsf");
        lList.addFirst("hgasdfygsf");
        lList.addFirst("hgasdfygsf");
        lList.print();
    }
}
