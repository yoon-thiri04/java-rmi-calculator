package rmi2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public static void main(String[] args){
        try{
            CalculatorImpl newobj= new CalculatorImpl();
            Naming.rebind("rmi://localhost:2000/Calculator", newobj);
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
        catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }
    }
}
