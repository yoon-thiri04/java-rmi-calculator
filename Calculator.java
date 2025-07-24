package rmi2;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Calculator extends Remote {
    public double calculate(double a, double b , String operator) throws RemoteException;
}
