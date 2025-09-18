package org.example.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MainMapping {
    public static void main(String[] args) {


        MappingAlein a1 = new MappingAlein();
        MappingAlein a2 = new MappingAlein();
        MappingAlein a3 = new MappingAlein();

        MappingLaptop l1 = new MappingLaptop();
        MappingLaptop l2 = new MappingLaptop();
        MappingLaptop l3 = new MappingLaptop();
        MappingLaptop l4 = new MappingLaptop();


        l1.setLatopid(1);
        l1.setBrand("LENOVO");
        l1.setModel("G SERIES");
        l1.setPrice(100000);
        l1.setRam(" 8 GB");
        l1.setOwner("RADHA");

        l2.setLatopid(2);
        l2.setBrand("DEll");
        l2.setModel("XMG");
        l2.setPrice(100000);
        l2.setRam(" 8 GB");
        l2.setOwner("RADHA");

        l3.setLatopid(3);
        l3.setBrand("APPLE");
        l3.setModel("MACBOOK");
        l3.setPrice(1000000);
        l3.setRam(" 16 GB");
        l3.setOwner("VASU");

        l4.setLatopid(4);
        l4.setBrand("JIO");
        l4.setModel("JIOBOOK");
        l4.setPrice(1000);
        l4.setRam(" 2 GB");
        l4.setOwner("NONU");

        a1.setId(101);
        a1.setName("Radha");

        a2.setId(102);
        a2.setName("Kanha");

        a3.setId(103);
        a3.setName("Nonu");

        a1.setLaptop(Arrays.asList(l1, l2));
        a2.setLaptop(Arrays.asList(l2, l3));
        a3.setLaptop(Arrays.asList(l3, l4));

        try (SessionFactory sf = new Configuration().
                addAnnotatedClasses(MappingLaptop.class).
                addAnnotatedClasses(MappingAlein.class).
                configure().
                buildSessionFactory()) {

            Session ss = sf.openSession();

            Transaction tt = ss.beginTransaction();

            ss.persist(a1);
            ss.persist(a2);
            ss.persist(a3);

            ss.persist(l1);
            ss.persist(l2);
            ss.persist(l3);
            ss.persist(l4);

            tt.commit();


        }
    }
}



