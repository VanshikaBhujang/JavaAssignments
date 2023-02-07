import java.io.IOException;

// ***** Unchecked Exceptions
/*
when an exception happens, Propagation is a process in which the exception is being dropped from to the top to the bottom of the stack. If not caught once,
the exception again drops down to the previous method and so on until it gets caught or until it reach the very bottom of the call stack.
This is called exception propagation and this happens in case of Unchecked Exceptions.
*/

class Demo
{
    void m()
    {
        int data = 50 / 0; // unchecked exception occurred
        // exception propagated to n()
    }

    void n()
    {
        m();
        // exception propagated to p()
    }

    void p()
    {
        try {
            n(); // exception handled
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}

// ***** Checked Exceptions
/*
Unlike Unchecked Exceptions, the propagation of exception does not happen in case of Checked Exception and its mandatory to use throw keyword here.
Only unchecked exceptions are propagated. Checked exceptions throw compilation error.
*/
class Demo1 {

    // exception propagated to n()
    void m() throws IOException {
        // checked exception occurred
        throw new IOException("device error");
    }

    // exception propagated to p()
    void n() throws IOException {
        m();
    }

    void p() {
        try {

            // exception handled
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
public class ExceptionPropogation {

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.p();
        System.out.println("Normal flow..");

        Demo1 d1 = new Demo1();
        d1.p();
        System.out.println("Normal Flow Continues!");
    }

}
