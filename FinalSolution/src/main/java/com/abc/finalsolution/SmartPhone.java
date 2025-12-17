package com.abc.finalsolution;

public class SmartPhone implements Connectable {

    @Override
    public void connect() {
        System.out.println("Connect with WIFI");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with WIFI");
    }

    public void deviceinfo() {
        System.out.println("SmartPhone - Android M-14");

    }

}
