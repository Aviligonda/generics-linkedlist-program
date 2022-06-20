import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList program with Generics ");
        LinkedList<Integer>list=new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("Simple Linked list is :"+ list);
        FunctionClass functionClass=new FunctionClass();
        functionClass.insertFirstNode(70);
        functionClass.insertFirstNode(30);
        functionClass.insertFirstNode(56);
        functionClass.toPrint();
    }
}
