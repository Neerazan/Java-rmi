import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient {
    public static void main(String args[]) {
        int a = 6, b = 8;

        try {
            Calculator stub = (Calculator) Naming.lookup("rmi://localhost:1099/calculator");

            System.out.println("a + b = " + stub.add(a, b));
            System.out.println("a * b = " + stub.mul(a, b));
            System.out.println("a / b = " + stub.div(a, b));
            System.out.println("a - b = " + stub.sub(a, b));
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
