package rmi2;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    public CalculatorImpl ()throws RemoteException{
        super();
    }
    public double calculate(double a, double b, String operator){
        switch (operator) {
            case "+": return Add(a, b);
            case "-": return Sub(a, b);
            case "/": return Division(a, b);
            case "*": return Multiply(a, b);
        
            default: return 0.0;
        }
    }

    private double Add(double a, double b){
        return a+b;
    }
    private double Sub(double a, double b){
        return a-b;
    }
    private double Multiply(double a, double b){
        return a*b;
    }
    private double Division(double a, double b){
        return a/b;
    }
}

