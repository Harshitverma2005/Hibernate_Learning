package org.example.Mapping;

import jakarta.persistence.*;
import org.example.Laptop;

import java.util.List;

@Entity
public class MappingAlein {

    private String Name ;
    @Id
    private int id ;

    @OneToMany(fetch = FetchType.EAGER)
    private List<MappingLaptop> laptop;

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

    public List< MappingLaptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<MappingLaptop> laptop) {
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
