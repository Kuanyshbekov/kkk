package com.company;
public class Main {
    public static void main(String[] args) {
        House []p = new House[5];
        p[0] = new Door("D1");
        p[1] = new Door("D2");
        p[2] = new Window("W1");
        p[3] = new Window("W2");
        p[4] = new Window("W3");
        House t = new House("H1");
        System.out.println("Number of windows: "+t.cWindow);
        System.out.println("Number of doors: "+t.cDoor);
        for (int i = 0; i < 5; i++) {
            p[i].Close();
            System.out.println(p[i].toString());
        }
    }
}

