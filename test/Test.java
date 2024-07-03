import java.util.ArrayList;
import java.util.Optional;

/**
 * Test
 */
public class Test {

    int num = 0;

    public static void main(String[] args) {
        System.out.println("hello");

        Test t = new Test();
        
        t.foo();

        ArrayList.dosomethign()



        ArrayList l = new ArrayList<>();

        Arraylist b = bar(l);

        l != b

        ! contents l != b

        Functin f = testMe;

        bar(f);

        bar(x -> x + x)


        submit(updateUjaI)
        

        // getCustomer(1234).sendMessage();

        getCustomer(123).
        .ifNotPresent(message -> respondMessage(message))
        .ifPresent(customer -> customer.foo());
    }

    public static Optional<Integer> getCustomer(int id) {
        return callFromDatabase(id);
    }

    public Optional<Customer> callFromDatabase(int id) {

        if (id in database) {
            Customer c = database.get(id);
            return Optional<T>.of(c) 
        } else {
            return Optional.empty();
        }

    }

    public int testMe(int x) {
        return x + x;

    }

    
    public void foo() {
        System.out.println("In foo");        
        num = 0;
    }

    public ArrayList bar(ArrayList z)  {
        Arraylist result = new ArrayList<>(z);        
        return result;
    }

    public int f(x) {
        num += 1;
        return x * 7;
    }

    int bar(Function f) {
        f(7);
    }

    int submit(Function closure) {
        makeCallToDatabase(closure)        
    }

    makeCallToDatabase(Function closure) {

        // actually do database stuff

        closure();

    }

}