package rmi2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num1:");
        Double num1 = s.nextDouble();
        System.out.println("Enter num2:");
        Double num2= s.nextDouble();
        System.out.println("Enter operator:");
        String op= s.next();
        s.close();
        try{
        Calculator c = (Calculator) Naming.lookup("rmi://localhost:2000/Calculator");
        System.out.println(c.calculate(num1,num2,op));
        }catch(RemoteException | MalformedURLException | NotBoundException e){
            e.printStackTrace();
        }
}
}