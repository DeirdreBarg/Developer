/**
 * LinkedList
 */
public class StringLinkedList {
    private StringNode root;
    private int size = 0;

    public void add(String s) {        
        size++;
        if (root == null) {
            root = new StringNode(s);
        } else {            
            StringNode current = root;
                        
            while (current.next != null) {
                // go to the next one
                current = current.next;
            }

            // current is now pointing to the last node

            StringNode end = new StringNode(s);
            current.next = end;
        }
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        
        StringNode current = root;
        for (int i = 0; i < index; i++) {
            
            current = current.next;
        }

        return current.data;


    }

    public String toString() {
        if (root == null) {
            return "root is null";
        } else {   
            StringNode current = root;      
            StringBuilder result = new StringBuilder();   
            while (current != null) {
                result.append(current + " ");
                current = current.next;
            }
            return result.toString();
        }
    }

    public void remove(int index) {
        // Bounds check
        if (index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();            
        }
        size--;

        // Removing the root
        if (index == 0) {
            root = root.next;
            return;
        }
        
        StringNode current = root;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Removing last element
        if (index == size() - 1) {
            current.next = null;
            return;            
        }

        // Remove a middle node
        current.next = current.next.next;
    }

    public void add(int index, String s) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        size++;
        StringNode sn = new StringNode(s);

        // Add new node at the begging
        if (index == 0) {
            sn.next = root;
            root = sn;            
        }


        StringNode current = root;

        // Add new node in the middle
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Current is the one before we want to do surgury

        sn.next = current.next;
        current.next = sn;


    }
}