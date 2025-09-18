package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Alein {

    private String Name ;
    @Id
    private int id ;
    private Laptop laptop;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alein{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", laptop=").append(laptop);
        sb.append('}');
        return sb.toString();
    }
}
