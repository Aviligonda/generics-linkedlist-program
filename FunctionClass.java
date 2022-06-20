public class FunctionClass {
    Node head;

    public void insertFirstNode(int data) {
        Node node = new Node(data);
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void insertLast(int data) {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.setData(data);
        currentNode.setNext(node);
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

    public void insertInBetween(int before, int after, int data) {
        Node currentNode = head;
        while (currentNode.data != before && currentNode.data != after) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;
    }

    public void deleteFirst() {
        Node currentNode = head;
        head = head.next;
    }

    public void deleteLast() {
        Node currentNode = head, secondLast = null;
        while (currentNode.next != null) {
            secondLast = currentNode;
            currentNode = currentNode.next;
        }
        if (secondLast != null) {
            secondLast.next = null;
        }
    }

    public void findNode(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                System.out.println(data + " Element found in the list ");
            }
            currentNode = currentNode.next;
        }
    }

    public void deleteAnyNode(int data) {
        Node currentNode = head, previousNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                previousNode.next = currentNode.next;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
}
