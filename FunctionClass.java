public class FunctionClass {
    Node head;

    public void insertFirstNode(int data) {
        Node node = new Node(data);
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void toPrint() {
        Node currentNode = head;
        System.out.println("Generics LinkedList is :");
        while (currentNode != null) {
            currentNode.toPrint();
            currentNode = currentNode.next;
        }
    }
}
