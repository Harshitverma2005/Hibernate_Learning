package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {


        Laptop l1 = new Laptop();
        l1.setBrand("LENOVO");
        l1.setModel("G SERIES");
        l1.setPrice(100000);
        l1.setRam(" 8 GB");
        l1.setOwner("RADHA");


        Alein st = new Alein();
        st.setId(1);
        st.setName("HARSHIT");
        st.setLaptop(l1);




//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClasses(org.example.Student.class);
//        cfg.configure();

        // also can use it as


        SessionFactory sf = new Configuration().addAnnotatedClasses(org.example.Alein.class).configure().buildSessionFactory();


      //  SessionFactory sf = cfg.buildSessionFactory();

        Session ss = sf.openSession();

        Transaction tt = ss.beginTransaction();

        ss.merge(st);

        tt.commit();

        ss.close();
        sf.close();


    }
}