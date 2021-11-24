package com.company;

public class Window extends House{
    public Window(String name) {
        super(name);
        cWindow++;
    }
    @Override
    public String toString() {
        return "Window{" +
                "name='" + name + '\'' +
                ", Status: '" + Status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
