package org.example;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {
        public static void main(String[] args) {
            Student st = new Student();
            st.setsName("Amit");
            st.setsAge(50);
            st.setsRollNo(5);


//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClasses(org.example.Student.class);
//        cfg.configure();

            // also can use it as
            SessionFactory sf = new Configuration().addAnnotatedClasses(org.example.Student.class).configure().buildSessionFactory();

            Session ss = sf.openSession();

      //     Student  st2 = ss.find(Student.class,100);

            Transaction tt= ss.beginTransaction();

          //  ss.merge(st);

            //Student st1 = ss.find(Student.class,5);

            ss.remove(st);

            tt.commit();



            ss.close();
            sf.close();
            System.out.println(st);

        }
    }

