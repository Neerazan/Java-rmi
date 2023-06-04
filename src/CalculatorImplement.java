import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImplement extends UnicastRemoteObject implements Calculator {
    public CalculatorImplement() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    @Override
    public int mul(int a, int b) throws RemoteException {
        return a * b;
    }
    @Override
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }
    @Override
    public int div(int a, int b) throws RemoteException {
        return a / b;
    }
}
