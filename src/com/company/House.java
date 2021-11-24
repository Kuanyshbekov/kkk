package com.company;
import java.util.Objects;

public class House {
    public String name;
    public static int cDoor = 0;
    public String Status = "Open";
    public static int cWindow = 0;
    void Close(){
        this.Status = "Closed";
    }

    public House(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", Status: '" + Status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(name, house.name) && Objects.equals(Status, house.Status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Status);
    }
}