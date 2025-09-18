package org.example.Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import org.example.Alein;

import java.util.List;

@Entity
public class MappingLaptop {

    @Id
    int latopid;
    String brand ;
    String ram;
    int price;
    String model;
    String owner;

    public String getBrand() {
        return brand;
    }

    public int getLatopid() {
        return latopid;
    }

    public void setLatopid(int latopid) {
        this.latopid = latopid;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MappingLaptop{");
        sb.append("latopid=").append(latopid);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", price=").append(price);
        sb.append(", model='").append(model).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
