import org.w3c.dom.Node;
public class IntList {
    private Node head;

    public IntList() {
        head = null;
    }

    public void add(int a) {
        head = new Node(a, head);
    }

    @Override
    public String toString(){
        String s = "{";
        Node<Integer> h = head;
        while(h.getNext()!= null){
            s += h.getValue()+",";
            h = h.getNext();
        }
        return s + h.getValue()+"}";
    }


    public boolean what1(IntList list) {
        Node h1 = head;
        Node h2 = list.head;
        while (h1 != null && h2 != null) {
            if (h1.value != h2.value) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return h1 == null && h2 == null;
    }

    private class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

