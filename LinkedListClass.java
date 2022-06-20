import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList program with Generics ");
        FunctionClass functionClass = new FunctionClass();
        functionClass.insertFirstNode(56);
        functionClass.appendingNode(56, 30);
        functionClass.appendingNode(30, 70);
        functionClass.toPrint();
    }
}
