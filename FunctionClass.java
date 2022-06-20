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

    public void appendingNode(int before, int data) {
        Node currentNode = head;
        while (currentNode.data != before) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;

    }
}
