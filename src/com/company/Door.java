package com.company;

public class Door extends House{
    public Door(String name) {
        super(name);
        cDoor++;
    }

    @Override
    public String toString() {
        return "Door{" +
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