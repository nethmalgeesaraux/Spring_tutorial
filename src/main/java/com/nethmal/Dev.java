package com.nethmal;



public class Dev {

    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Dev() {
        System.out.println("Dev object created!");
    }

    public void build() {
        System.out.println("Hello from Div class!");
        com.compile();



    }

}
