package kr.hs.dgsw.java.List;

public class MyLinkedList implements MyList {
    private Node head;

    @Override
    public void add(String value) {
        Node node = new Node();
        node.setValue(value);

        Node prev = getLastNode();
        if (prev == null) {
            head = node;
        } else {
            prev.setNext(node);
        }
    }

    private Node getLastNode() {
        if (head == null) {
            return null;
        }

        Node node = head;
        while (true) {
            if (node.getNext() == null) {
                return node;
            }
            node = node.getNext();
        }
    }

    @Override
    public String get(int index) {
        Node node = this.head;
        for (int i = 0; i < index; i++) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }
            node = node.getNext();
        }
        return node.getValue();
    }

    @Override
    public int size() {
        Node node = this.head;
        int size = 0;
        while (node != null) {
            node = node.getNext();
            size++;
        }
        return size;
    }
}
