
public class LinkedStack<T> implements Stack<T> {
    
    private Node head = new Node();
    private int elements = 0;

    public void push(Object newObj) {
        Node newNode = new Node(newObj);
        newNode.setNext(head.getNext());
        head.setNext(newNode);
        elements++;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public T peek() {
        Node currentHead = new Node();
        for (int i = 0; i < elements; i++) {
            currentHead = head.getNext();
        }
        return (T)currentHead.getValue();
    }

    public T pop() {
        if (isEmpty()) throw new UnsupportedOperationException();
        else {
            Object poppedObject = head.getNext().getValue();
            head.setNext(head.getNext().getNext());
            elements--;
            return (T)poppedObject;
        }
    }

    public void printStack() {
        for (int i = 0; i < elements; i++) {
            head = head.getNext();
            System.out.println(head.getValue());
        }
    }
    
    private class Node<T> {

        private Node next;
        private Object value;

        public Node() {
            this.next = null;
            this.value = null;
        }

        public Node(Object value) {
            this.next = null;
            this.value = value;
        }

        public void setNext(Node nextNode) {
            next = nextNode;
        }

        public Node getNext() {
            return next;
        }

        public Object getValue() {
            return (T)value;
        }
  
    }
}