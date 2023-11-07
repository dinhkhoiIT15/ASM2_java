package ASM;

import java.util.Scanner;

public class LinkedList<E> {
    public Node<E> head;

    public void addStudent(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void remove(E data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node<E> current = head.next, prev = head;
        while (current != null) {
            if(head.data.equals(data)){
                prev.next=current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void listStudent(){
        if(head == null){
            throw new KException(200);
        }

        Node<E> current = head;
        while(current != null){
            Student st = (Student) current.data;
            System.out.println("Name: " + st.getStuName());
            System.out.println("Class: " + st.getStuClass());
            System.out.println("Mark: " + st.getMark());
            System.out.println("---------");
            current = current.next;
        }
    }

    public static void main(String[] agrs){
        LinkedList<Student> sList = new LinkedList<>();
        int choice;
        Scanner scn = new Scanner(System.in);
        
        while(true){
            System.out.println("Choose an option:\n");
            System.out.println("1. Add new student!");
            System.out.println("2. List student!");
            System.out.println("3. Remove student!");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice 1 - 4: ");

            choice = scn.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter student information: ");
                    System.out.print("Name: ");
                    String sName = scn.next();
                    System.out.print("Class: ");
                    String sClass = scn.next();
                    System.out.print("Mark: ");
                    int sMark = scn.nextInt();
                    Student stu = new Student(sName, sClass, sMark);
                    sList.addStudent(stu);
                    System.out.println("Add successfull!\n");
                    break;
                case 2:
                    System.out.println("List all students");
                    sList.listStudent();
                    break;
                case 3:
                    if(sList.head != null){
                        System.out.print("Enter name to remove: ");
                        String nameRemove = scn.next();
                        Student stRemove = new Student(nameRemove, "", 0);
                        sList.remove(stRemove);
                        System.out.println("Removed successfully!");
                        sList.listStudent();
                        break;
                    }
                case 4:
                    System.out.println("Exiting the progam!");
                    scn.close();
                    System.exit(0);
                default:
                    throw new KException(201);
            }
        }
    }
}
