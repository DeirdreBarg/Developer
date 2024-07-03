import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println();
    
        ArrayList<String> ar = new ArrayList();
        // testPrintList();
        testGetIndex();

    }

    public static StringLinkedList getList() {
        StringLinkedList ll = new StringLinkedList();        
        ll.add("Zach");      
        ll.add("Deirdre");  
        ll.add("Josh");
        ll.add("Ben");
        return ll;
    }


    public static void testPrintList() {
        StringLinkedList ll =getList();
        System.out.println(ll);
    }

    public static void testGetIndex() {
        StringLinkedList ll = getList();
        System.out.println("node at index 5: " + ll.get(5));
    }

    public static void testSize() {
        List l = new StringLinkedList();


        List<String> a = new ArrayList<String>();
        

        



        StringLinkedList ll = getList();
        System.out.println("Size is: " + ll.size());
    }
}
