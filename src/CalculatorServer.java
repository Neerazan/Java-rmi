import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class CalculatorServer {
    public static  void main(String args []) throws RemoteException, MalformedURLException {

            Calculator stub  = new CalculatorImplement();

            Naming.rebind("rmi://localhost:8099/calculator" , stub);

            System.out.println("Server Started");


    }
}
