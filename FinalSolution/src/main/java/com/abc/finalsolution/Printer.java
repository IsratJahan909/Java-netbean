package com.abc.finalsolution;

public class Printer implements Connectable {

    @Override
    public void connect() {
        System.out.println("Connect with PC");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with PC");
    }

    public void deviceinfo() {
        System.out.println("Printer ZUKAR");
    }

}
