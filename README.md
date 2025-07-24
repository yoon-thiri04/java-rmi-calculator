## Java RMI Calculator

A very simple Calculator application demonstrating Java Remote Method Invocation (RMI).  
It includes a remote calculator interface, server implementation, and client to perform operations remotely.

## Features

- Remote addition, subtraction, multiplication, and division
- Basic RMI setup with registry, server, and client
- Java Swing-based GUI client for interactive use

## How to Run

1. Compile all classes:
   ```bash
   javac *.java
````

2. Start the RMI registry:

   ```bash
   start rmiregistry
   ```

3. Run the Server:

   ```bash
   java Server
   ```

4. Run the Console Client (optional):

   ```bash
   java Client
   ```

5. Run the Swing GUI Client:

   ```bash
   java CalculatorClientGUI
   ```

---

This project demonstrates both a command-line and graphical interface for interacting with an RMI-based calculator backend.


