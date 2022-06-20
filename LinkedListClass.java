public class LinkedListClass {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList program with Generics ");
        FunctionClass functionClass = new FunctionClass();
        functionClass.insertFirstNode(56);
        functionClass.insertLast(70);
        functionClass.insertInBetween(56, 70, 30);
        functionClass.toPrint();
        functionClass.deleteLast();
        functionClass.toPrint();
    }
}
