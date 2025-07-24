package rmi2;
import java.awt.*;

import java.rmi.Naming;

import javax.swing.*;


public class CalculatorClientGUI extends JFrame {
    private Calculator calculator;
    private JTextField num1Field, num2Field, resultField;
    private JButton addBtn, subBtn, multBtn, divBtn;
    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new CalculatorClientGUI().setVisible(true));
}

    public CalculatorClientGUI(){
        setTitle("RMI Calculator");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2,10,10));

        num1Field =new JTextField();
        num2Field =new JTextField();
        resultField= new JTextField();
        resultField.setEditable(false);

         addBtn = new JButton("Add");
         subBtn = new JButton("Subtract");
         multBtn = new JButton("Multiply");
         divBtn = new JButton("Divide");


        add(new JLabel("Number 1 :"));
        add(num1Field);
        add(new JLabel("Number 2: "));
        add(num2Field);
        add(addBtn);
        add(subBtn);
        add(multBtn);
        add(divBtn);
        add(new JLabel("Result"));
        add(resultField);

        try{
            calculator = (Calculator) Naming.lookup("rmi://localhost:2000/Calculator");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Failed to connect to server");
            e.printStackTrace();
            System.exit(1);
        }

        addBtn.addActionListener(e-> calculate("+"));
        subBtn.addActionListener(e -> calculate("-"));
        multBtn.addActionListener(e -> calculate("/"));
        divBtn.addActionListener(e-> calculate("*"));
    }

    private void calculate(String operation){
        try{
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result = calculator.calculate(a, b, operation);
            resultField.setText(String.valueOf(result));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
}
