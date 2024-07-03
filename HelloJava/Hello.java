import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        int x = 7;
        String y = "abc";
        foo();
        List l = getNames("microsoft");


        //
        List<String> l = getNames("microsoft");
        


    }

    public static void foo() {
        int x = 12;
    }


    public static List<String> getNames(String company) {
        LinkedList a = new LinkedList<>();
        if (company == "Apple") {
            return a;
        } else if (company == "microsoft") {
            LinkedList l = new LinkedList<String>()
            return l;
        }
        return null;
    }
}

